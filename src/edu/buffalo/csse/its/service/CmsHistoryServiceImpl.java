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

import edu.buffalo.csse.its.dao.CmsHistoryDao;
import edu.buffalo.csse.its.data.CmsHistory;
import edu.buffalo.csse.its.dataload.CmsHistoryLoad;
import edu.buffalo.csse.its.util.ITSUtils;
import edu.buffalo.csse.its.xmlbinding.cmshistory.ROW;

public class CmsHistoryServiceImpl implements DataService{

	protected final Log logger = LogFactory.getLog(getClass());
	
	private CmsHistoryDao cmsHistoryDao;
	private CmsHistoryLoad obj;

	public void setCmsHistoryDao(CmsHistoryDao cmsHistoryDao) {
		this.cmsHistoryDao = cmsHistoryDao;
	}

	public boolean processData(File file) {

		try {
			obj = new CmsHistoryLoad(file);
			obj.loadXML();

			List<CmsHistory> cmsHistoryList = new ArrayList<CmsHistory>();
			
			List<ROW> rows = null;

			rows = obj.getRowdata().getROW();

			SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm a");
			NumberFormat formatter = new DecimalFormat("#,###,###");
			
			Iterator<ROW> iter = rows.iterator();
			while (iter.hasNext()) {
				ROW row = (ROW) iter.next();

				CmsHistory data = new CmsHistory();

//				data.setUniveral_update_time(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getUNIVERSALUPDATETIME(), sdf))));
//				data.setLocal_update_time(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getUNIVERSALUPDATETIME(), sdf))));
				data.setDevice_id(formatter.parse(row.getDEVICEID()+"").intValue());
				data.setDevice_type(row.getDEVICETYPE());
				data.setNumber_of_phases(formatter.parse(row.getNUMBEROFPHASES()+"").intValue());
				data.setStatic_text1(row.getSTATICTEXT1());
				data.setStatic_text2(row.getSTATICTEXT2());
				data.setStatic_text3(row.getSTATICTEXT3());
				data.setPhase1_line1_text(row.getPHASE1LINE1TEXT());
				data.setPhase1_line2_text(row.getPHASE1LINE2TEXT());
				data.setPhase1_line3_text(row.getPHASE1LINE3TEXT());
				data.setPhase2_line1_text(row.getPHASE2LINE1TEXT());
				data.setPhase2_line2_text(row.getPHASE2LINE2TEXT());
				data.setPhase2_line3_text(row.getPHASE2LINE3TEXT());

				cmsHistoryList.add(data);
			}
			// save incidents
			cmsHistoryDao.saveCmsHistory(cmsHistoryList);

		} catch (Exception e) {
			logger.error("Error occurred saving : " + e.getMessage());
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
