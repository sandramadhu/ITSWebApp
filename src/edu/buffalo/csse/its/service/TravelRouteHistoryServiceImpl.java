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

import edu.buffalo.csse.its.dao.TravelRouteHistoryDao;
import edu.buffalo.csse.its.data.TravelRouteHistory;
import edu.buffalo.csse.its.dataload.TravelRouteHistoryLoad;
import edu.buffalo.csse.its.util.DateUtils;
import edu.buffalo.csse.its.util.ITSUtils;
import edu.buffalo.csse.its.xmlbinding.travelroutehistory.ROW;

public class TravelRouteHistoryServiceImpl implements DataService{

	protected final Log logger = LogFactory.getLog(getClass());
	
	private TravelRouteHistoryDao travelRouteHistoryDao;
	private TravelRouteHistoryLoad obj;

	public void setTravelRouteHistoryDao(TravelRouteHistoryDao travelRouteHistoryDao) {
		this.travelRouteHistoryDao = travelRouteHistoryDao;
	}

	public boolean processData(File file) {

		try {
			obj = new TravelRouteHistoryLoad(file);
			obj.loadXML();

			List<TravelRouteHistory> list = new ArrayList<TravelRouteHistory>();
			
			List<ROW> rows = null;

			rows = obj.getRowdata().getROW();

			SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm a");
			NumberFormat formatter = new DecimalFormat("#,###,###");
			
			Iterator<ROW> iter = rows.iterator();
			while (iter.hasNext()) {
				ROW row = (ROW) iter.next();

				TravelRouteHistory data = new TravelRouteHistory();

				data.setRouteName(row.getROUTENAME());
				data.setOperatorMode(row.getOPERATORMODE());
				data.setTravelTime(formatter.parse(row.getTRAVELTIME()+"").doubleValue());
//				data.setUpdateTime(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getUPDATETIME(), sdf))));
				
				list.add(data);
			}
			// save incidents
			travelRouteHistoryDao.saveTrafficRouteHistory(list);

		} catch (Exception e) {
			logger.error("Error occurred saving : " + e.getMessage());
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
