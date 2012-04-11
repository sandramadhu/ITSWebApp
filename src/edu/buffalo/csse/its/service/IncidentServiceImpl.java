package edu.buffalo.csse.its.service;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import edu.buffalo.csse.its.dao.IncidentLogDao;
import edu.buffalo.csse.its.data.IncidentLog;
import edu.buffalo.csse.its.dataload.IncidentLogLoad;
import edu.buffalo.csse.its.util.DateUtils;
import edu.buffalo.csse.its.util.ITSUtils;
import edu.buffalo.csse.its.xmlbinding.incidentlog.IncidentX0020Log;

public class IncidentServiceImpl implements IncidentService {

	protected final Log logger = LogFactory.getLog(getClass());
	
	private IncidentLogDao incidentLogDao;
	private IncidentLogLoad obj;

	public void setIncidentLogDao(IncidentLogDao incidentLogDao) {
		this.incidentLogDao = incidentLogDao;
	}

	@Override
	public List<IncidentLog> getIncidents(String linkId) {
		return this.incidentLogDao.getIncidents(linkId);
	}

	@Override
	public boolean processData(File file) {

		try {
			obj = new IncidentLogLoad(file);
			obj.loadXML();

			List<IncidentLog> incidentsList = new ArrayList<IncidentLog>();
			
			List<IncidentX0020Log> incidents = new ArrayList<IncidentX0020Log>();

			incidents = obj.getDataroot().getIncidentX0020Log();

			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
			SimpleDateFormat tmf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");

			Iterator<IncidentX0020Log> iter = incidents.iterator();
			while (iter.hasNext()) {
				IncidentX0020Log incident = (IncidentX0020Log) iter.next();

				IncidentLog data = new IncidentLog();

				data.setId(ITSUtils.parseInt(incident.getID()));
				data.setIncident_date(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(incident.getDate(), sdf))));
				data.setIncident_time(ITSUtils.parseLong(DateUtils.getHHMMSS(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(
						incident.getTime(), tmf)))));
				data.setCaller_name(incident.getCallerX0020Name());
				data.setCaller_org(incident.getCallerX0020Organization());
				data.setCaller_phone(incident.getCallerX0020PhoneX0020X0023());
				data.setCARS_active(ITSUtils.parseInt(incident.getCARSX0020Active()));
				data.setCARS_deactive(ITSUtils.parseInt(incident.getCARSX0020Deactive()));
				data.setCARS_Man_Act(ITSUtils.parseInt(incident.getCARSX0020ManX0020Act()));
				data.setCARS_Man_DeAct(ITSUtils.parseInt(incident.getCARSX0020ManX0020DeAct()));
				data.setCharms_Event_No_Action(ITSUtils.parseInt(incident.getCharmsEventNoAction()));
				data.setClear_Time(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(incident.getClearTime(), tmf))));
				data.setClosed_time(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(incident.getClosedTime(), sdf))));
				data.setCR_Event_ID(incident.getCREventID());
				data.setCR_Fax_Email_Act(ITSUtils.parseInt(incident.getCRFaxEmailX0020Act()));
				data.setCR_Fax_Email_De_Act(ITSUtils.parseInt(incident.getCRFaxEmailX0020DeAct()));
				data.setCR_Web_Act(ITSUtils.parseInt(incident.getCRWebX0020Act()));
				data.setCR_Web_DeAct(ITSUtils.parseInt(incident.getCRWebX0020DeAct()));
				data.setCRDMS_Act(ITSUtils.parseInt(incident.getCRDMSX0020Act()));
				data.setCRDMS_DeAct(ITSUtils.parseInt(incident.getCRDMSX0020DeAct()));
				data.setDetection_time(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(incident.getDetectionTime(), tmf))));
				data.setDMS(ITSUtils.parseInt(incident.getDMS()));
				data.setDMS_Act_Time(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(incident.getDMSX0020ActX0020Time(),
						tmf))));
				data.setDMS_Active_List(incident.getDMSActiveList());
				data.setDMS_DeAct_Time(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(
						incident.getDMSX0020DeActX0020Time(), tmf))));
				// data.setEvent(incident.getCREventID());
				data.setEventDescription(incident.getEventX0020Description());
				data.setExclude_From_Rep(ITSUtils.parseInt(incident.getExcludeFromRep()));
				data.setFull_Road_Closure(ITSUtils.parseInt(incident.getFullRoadClosure()));
				data.setHAR(ITSUtils.parseInt(incident.getHAR()));
				// data.setHAR_Act_Time(incident.getHAR());
				// data.setHAR_DeAct_Time(incident.getHAR());
				data.setHAR_Slot(ITSUtils.parseInt(incident.getHARSlot()));
				data.setHICF_Final_Sent(ITSUtils.parseInt(incident.getHICFFinalSent()));
				data.setHICF_Sent(ITSUtils.parseInt(incident.getHICFSent()));
				data.setInc_Severity(ITSUtils.parseInt(incident.getIncSeverity()));
				data.setInc_Severity_Maj(ITSUtils.parseInt(incident.getIncSeverityMaj()));
				data.setInc_Severity_Mod(ITSUtils.parseInt(incident.getIncSeverityMod()));
				data.setLan_Block_Clear_Time_Span_Max(ITSUtils.parseInt(incident.getLanBlcokClearTimeSpanMax()));
				data.setLane_BCTS(ITSUtils.parseInt(incident.getLaneBCTS()));
				data.setLane_block_clear_time(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(
						incident.getLanBlockClearTime(), tmf))));
				data.setLane_Block_Clear_Time_Span(ITSUtils.parseInt(incident.getLanBlcokClearTimeSpan()));
				data.setLane_Block_Clear_Time_Span_Mod(ITSUtils.parseInt(incident.getLanBlcokClearTimeSpanMod()));
				data.setLane_Blocked(ITSUtils.parseInt(incident.getLaneBlocked()));
				data.setMod_Time(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(incident.getModTime(), sdf))));
				data.setMunicipality(incident.getMunicipality());
				data.setNum_Lanes_Blocked(ITSUtils.parseInt(incident.getNumX0020LanesX0020Blocked()));
				data.setOperator_response(incident.getOperatorsResponse());
				data.setOperators(incident.getOperators());
				data.setOwning_agency(incident.getOwningX0020Agency());
				data.setPVMS(ITSUtils.parseInt(incident.getPVMS()));
				data.setPVMS_Act_Time(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(
						incident.getPVMSX0020ActX0020Time(), tmf))));
				data.setPVMS_DeAct_Time(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(
						incident.getPVMSX0020DeActX0020Time(), tmf))));
				data.setRet_Norm_Time(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(incident.getRetNormTime(), tmf))));
				data.setRet_Norm_Time_Span(ITSUtils.parseInt(incident.getRetNormTimeSpan()));
				data.setRet_Norm_Time_Span_Max(ITSUtils.parseInt(incident.getRetNormTimeSpanMax()));
				data.setRet_Norm_Time_Span_Mod(ITSUtils.parseInt(incident.getRetNormTimeSpanMod()));
				data.setRet_NTS(ITSUtils.parseInt(incident.getRetNTS()));
				data.setScene_Arr_Time_SpanMax(ITSUtils.parseInt(incident.getSceneArrTimeSpanMax()));
				data.setScene_arr_time_spanmod(ITSUtils.parseInt(incident.getSceneArrTimeSpanMod()));
				data.setScene_arrival_time(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(incident.getSceneArrTime(),
						tmf))));
				data.setScene_arrival_time_span(ITSUtils.parseInt(incident.getSceneArrTimeSpan()));
				data.setScene_ATS(ITSUtils.parseInt(incident.getSceneATS()));
				data.setScene_Depart_Time(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(incident.getSceneDepartTime(),
						tmf))));
				data.setSecondary_Incident(ITSUtils.parseInt(incident.getSecondaryIncident()));
				data.setSecondary_Incident_Log_Num(ITSUtils.parseInt(incident.getSecondaryIncidentLogNum()));
				data.setSkyway(ITSUtils.parseInt(incident.getSkyway()));
				// data.setSkyway_Act_Time(incident.getSkyway());
				// data.setSkyway_DeAct_Time(incident.getSkyway());
				data.setTCWS(ITSUtils.parseInt(incident.getTCWS()));
				// data.setTCWS_Act_Time(incident.getTransAlertX0020Act());
				// data.setTCWS_DeAct_Time(incident.getTransAlertX0020DeAct());
				data.setTotal_Clear_Time(ITSUtils.parseInt(incident.getTotalClearTime()));
				data.setTrans_Alert_Act(ITSUtils.parseInt(incident.getTransAlertX0020Act()));
				data.setTrans_Alert_DeAct(ITSUtils.parseInt(incident.getTransAlertX0020DeAct()));
				data.setVerification_time(ITSUtils.parseLong(DateUtils.convertDateToYYYYMMDDHHMMSS(DateUtils.convertStringToDate(incident.getVerifyTime(), tmf))));
				data.setWebsite_added_incident(ITSUtils.parseInt(incident.getWebsiteX0020AddedX0020Incident()));
				data.setWebsite_deleted_incident(ITSUtils.parseInt(incident.getWebsiteX0020DeletedX0020Incident()));

				incidentsList.add(data);
			}
			// save incidents
			incidentLogDao.saveIncidents(incidentsList);

		} catch (Exception e) {
			logger.error("Error occurred processing incident data : " + e.getMessage());
			e.printStackTrace();
		}
		return true;
	}
}
