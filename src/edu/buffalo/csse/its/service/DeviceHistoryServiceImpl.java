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

import edu.buffalo.csse.its.dao.DeviceHistoryDao;
import edu.buffalo.csse.its.data.DeviceHistory;
import edu.buffalo.csse.its.dataload.DeviceHistoryLoad;
import edu.buffalo.csse.its.xmlbinding.devicehistory.ROW;

public class DeviceHistoryServiceImpl implements DataService{

	protected final Log logger = LogFactory.getLog(getClass());
	
	private DeviceHistoryDao deviceHistoryDao;
	private DeviceHistoryLoad obj;

	public void setDeviceHistoryDao(DeviceHistoryDao deviceHistoryDao) {
		this.deviceHistoryDao = deviceHistoryDao;
	}

	public boolean processData(File file) {

		try {
			obj = new DeviceHistoryLoad(file);
			obj.loadXML();

			List<DeviceHistory> deviceHistoryList = new ArrayList<DeviceHistory>();
			
			List<ROW> rows = null;

			rows = obj.getRowdata().getROW();

			SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm a");
			NumberFormat formatter = new DecimalFormat("#,###,###");
			
			Iterator<ROW> iter = rows.iterator();
			while (iter.hasNext()) {
				ROW row = (ROW) iter.next();

				DeviceHistory data = new DeviceHistory();

//				data.setUniveral_update_time(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getUNIVERSALUPDATETIME(), sdf))));
//				data.setLocal_update_time(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getUNIVERSALUPDATETIME(), sdf))));
				data.setAction(row.getACTION());
				data.setDeviceType(row.getDEVICETYPE());
				data.setDeviceId(formatter.parse(row.getDEVICEID()+"").intValue());
				data.setDeviceComponentId(formatter.parse(row.getDEVICECOMPONENTID()+"").intValue());
				data.setDescription(row.getDESCRIPTION());
				data.setSourceType(row.getSOURCETYPE());
				data.setSourceId(row.getSOURCEID());
				data.setState(row.getSTATE());
				data.setStatus(row.getSTATUS());

				deviceHistoryList.add(data);
			}
			// save incidents
			deviceHistoryDao.saveDeviceHistory(deviceHistoryList);

		} catch (Exception e) {
			logger.error("Error occurred saving : " + e.getMessage());
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
