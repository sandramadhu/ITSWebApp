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

import edu.buffalo.csse.its.dao.BcdEventHistoryDao;
import edu.buffalo.csse.its.data.BcdEventHistory;
import edu.buffalo.csse.its.dataload.BcdEventHistoryLoad;
import edu.buffalo.csse.its.util.DateUtils;
import edu.buffalo.csse.its.util.ITSUtils;
import edu.buffalo.csse.its.xmlbinding.bcdeventhistory.ROW;

public class BcdEventHistoryServiceImpl implements DataService{

	protected final Log logger = LogFactory.getLog(getClass());
	
	private BcdEventHistoryDao bcdEventHistoryDao;
	private BcdEventHistoryLoad obj;

	public void setBcdEventHistoryDao(BcdEventHistoryDao bcdEventHistoryDao) {
		this.bcdEventHistoryDao = bcdEventHistoryDao;
	}

	public boolean processData(File file) {

		try {
			obj = new BcdEventHistoryLoad(file);
			obj.loadXML();

			List<BcdEventHistory> bcdEventHistoryList = new ArrayList<BcdEventHistory>();
			
			List<ROW> incidents = new ArrayList<ROW>();

			incidents = obj.getRowdata().getROW();

			SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy h:mm a");
			NumberFormat formatter = new DecimalFormat("#,###,###");
			
			Iterator<ROW> iter = incidents.iterator();
			while (iter.hasNext()) {
				ROW row = (ROW) iter.next();

				BcdEventHistory data = new BcdEventHistory();

//				data.setUniversalUpdateTime(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getUNIVERSALUPDATETIME(), sdf))));
//				data.setLocalUpdateTime(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getUNIVERSALUPDATETIME(), sdf))));
				data.setId(formatter.parse(row.getID()).intValue());
				data.setOwner(row.getOWNER());
				data.setDescription(row.getDESCRIPTION());
				data.setSource(row.getSOURCE());
//				data.setConfirmationTime(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getCONFIRMATIONTIME(), sdf))));
				data.setSource(row.getSOURCE());
				data.setAction(row.getACTION());
				data.setPeaceBridgeUsToCan(ITSUtils.parseDouble(row.getPEACEBRIDGEDELAYUSTOCANADA()));
				data.setPeaceBridgeCanToUs(ITSUtils.parseDouble(row.getPEACEBRIDGEDELAYCANADATOUS()));
				data.setRainbowBridgeUsToCan(ITSUtils.parseDouble(row.getRAINBOWBRIDGEDELAYUSTOCANADA()));
				data.setRainbowBridgeCanToUs(ITSUtils.parseDouble(row.getRAINBOWBRIDGEDELAYCANADATOUS()));
				data.setQlBridgeUsToCan(ITSUtils.parseDouble(row.getQLBRIDGEDELAYUSTOCANADA()));
				data.setQlBridgeCanToUs(ITSUtils.parseDouble(row.getQLBRIDGEDELAYCANADATOUS()));
				

				bcdEventHistoryList.add(data);
			}
			// save incidents
			bcdEventHistoryDao.saveBcdEventHistory(bcdEventHistoryList);

		} catch (Exception e) {
			logger.error("Error occurred saving bcd event history data : " + e.getMessage());
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
