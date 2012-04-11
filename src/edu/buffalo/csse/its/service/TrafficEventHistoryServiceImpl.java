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

import edu.buffalo.csse.its.dao.TrafficEventHistoryDao;
import edu.buffalo.csse.its.data.TrafficEventHistory;
import edu.buffalo.csse.its.dataload.TrafficEventHistoryLoad;
import edu.buffalo.csse.its.util.ITSUtils;
import edu.buffalo.csse.its.xmlbinding.trafficeventhistory.ROW;

public class TrafficEventHistoryServiceImpl implements DataService{

	protected final Log logger = LogFactory.getLog(getClass());
	
	private TrafficEventHistoryDao trafficEventHistoryDao;
	private TrafficEventHistoryLoad obj;

	public void setTrafficEventHistoryDao(TrafficEventHistoryDao trafficEventHistoryDao) {
		this.trafficEventHistoryDao = trafficEventHistoryDao;
	}

	public boolean processData(File file) {

		try {
			obj = new TrafficEventHistoryLoad(file);
			obj.loadXML();

			List<TrafficEventHistory> list = new ArrayList<TrafficEventHistory>();
			
			List<ROW> rows = null;

			rows = obj.getRowdata().getROW();

			SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy hh:mm a");
			NumberFormat formatter = new DecimalFormat("#,###,###");
			
			Iterator<ROW> iter = rows.iterator();
			while (iter.hasNext()) {
				ROW row = (ROW) iter.next();

				TrafficEventHistory data = new TrafficEventHistory();

				data.setAction(row.getACTION());
				data.setAreas(row.getAREAS());
				data.setAteid(formatter.parse(row.getATEID()+"").intValue());
				data.setBlocked_lane(row.getBLOCKEDLANE());
				data.setCause(row.getCAUSE());
				data.setConfirmationSource(row.getCONFIRMATIONSOURCE());
//				data.setConfirmationTime(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getCONFIRMATIONTIME(), sdf))));
//				data.setDetectionTime(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getDETECTIONTIME(), sdf))));
				data.setDistance_covered(formatter.parse(row.getDISTANCECOVERED()+"").doubleValue());
				data.setDistrict(row.getDISTRICT());
				data.setEstimatedDuration(row.getESTIMATEDDURATION());
				data.setFull_closure(row.getFULLCLOSURE());
				data.setHead_loc_string(row.getHEADLOCSTRING());
				data.setHead_long_road_name(row.getHEADLONGROADNAME());
				data.setHeadvdsid(formatter.parse(row.getHEADVDSID()+"").intValue());
				data.setIncident_id(formatter.parse(row.getINCIDENTID()+"").intValue());
//				data.setInitial_notification_time(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getINITIALNOTIFICATIONTIME(), sdf))));
				data.setInjuries(row.getINJURIES());
				data.setLeft_shoulder(row.getLEFTSHOULDER());
//				data.setLocalUpdateTime(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getLOCALUPDATETIME(), sdf))));
				data.setLongdesc(row.getLONGDESC());
//				data.setNormal_traffic_flow_time(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getNORMALTRAFFICFLOWTIME(), sdf))));
//				data.setNotificationTime(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getNOTIFICATIONTIME(), sdf))));
//				data.setOccurence_time(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getOCCURENCETIME(), sdf))));
				data.setOwner(row.getOWNER());
				data.setQueueid(formatter.parse(row.getQUEUEID()+"").intValue());
				data.setRight_shoulder(row.getRIGHTSHOULDER());
				data.setSecondary(row.getSECONDARY());
				data.setSeverity(formatter.parse(row.getSEVERITY()+"").intValue());
				data.setSource(row.getSOURCE());
				data.setState(row.getSTATE());
				data.setSubcause(row.getSUBCAUSE());
				data.setTail_loc_string(row.getTAILLOCSTRING());
				data.setTail_long_road_name(row.getTAILLONGROADNAME());
				data.setTailvdsid(formatter.parse(row.getTAILVDSID()+"").intValue());
				data.setTetype(row.getTETYPE());
				data.setTown(row.getTOWN());
				data.setTransittype(row.getTRANSITTYPE());
//				data.setUniversalUpdateTime(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getUNIVERSALUPDATETIME(), sdf))));
				data.setVehicles_involved(row.getVEHICLESINVOLVED());
//				data.setVerification_time(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(row.getVERIFICATIONTIME(), sdf))));
				data.setWrecker_clears_lanes(row.getWRECKERCLEARSLANES());
				
				list.add(data);
			}
			// save incidents
			trafficEventHistoryDao.saveTrafficEventHistory(list);

		} catch (Exception e) {
			logger.error("Error occurred saving : " + e.getMessage());
			e.printStackTrace();
			return false;
		}
		return true;
	}
}
