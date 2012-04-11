package edu.buffalo.csse.its.service;

import java.io.File;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.buffalo.csse.its.dao.ExternalAgencyHistoryDao;
import edu.buffalo.csse.its.data.ExternalAgencyHistory;
import edu.buffalo.csse.its.dataload.ExternalAgencyHistoryLoad;
import edu.buffalo.csse.its.xmlbinding.externalagencyhistory.ROW;

public class ExternalAgencyHistoryServiceImpl implements DataService{

	protected final Log logger = LogFactory.getLog(getClass());
	
	private ExternalAgencyHistoryDao externalAgencyHistoryDao;
	private ExternalAgencyHistoryLoad obj;

	public void setExternalAgencyHistoryDao(ExternalAgencyHistoryDao externalAgencyHistoryDao) {
		this.externalAgencyHistoryDao = externalAgencyHistoryDao;
	}

	public boolean processData(File file) {

		try {
			obj = new ExternalAgencyHistoryLoad(file);
			obj.loadXML();

			List<ExternalAgencyHistory> list = new ArrayList<ExternalAgencyHistory>();
			
			List<ROW> rows = null;

			rows = obj.getRowdata().getROW();

			SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm a");
			NumberFormat formatter = new DecimalFormat("#,###,###");
			
			Iterator<ROW> iter = rows.iterator();
			while (iter.hasNext()) {
				ROW row = (ROW) iter.next();

				ExternalAgencyHistory data = new ExternalAgencyHistory();

//				
				data.setAteid(formatter.parse(row.getATEID()+"").intValue());
//				data.setDetectionTime(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getDETECTIONTIME(), sdf))));
				data.setAgency(row.getAGENCY());
//				data.setNotificationTime(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getNOTIFICATIONTIME(), sdf))));
//				data.setArrivalTime(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getARRIVALTIME(), sdf))));
//				data.setDepartureTime(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getDEPARTURETIME(), sdf))));
//				data.setUniversalUpdateTime(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getUNIVERSALUPDATETIME(), sdf))));
//				data.setLocalUpdateTime(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getLOCALUPDATETIME(), sdf))));
				
				list.add(data);
			}
			// save incidents
			externalAgencyHistoryDao.saveExternalAgencyHistory(list);

		} catch (Exception e) {
			logger.error("Error occurred saving : " + e.getMessage());
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
