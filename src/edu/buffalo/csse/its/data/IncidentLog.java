package edu.buffalo.csse.its.data;

import java.io.Serializable;

public class IncidentLog implements Serializable {

	private static final long serialVersionUID = -658450630413119375L;

	private int id;
	private long incident_date;
	private long incident_time;
	private int dow;
	private String linkId;
	private long detection_time;
	private long verification_time;
	private long scene_arrival_time;
	private long closed_time;
	private String operators;
	private String operator_response;
	private String caller_org;
	private String caller_phone;
	private String caller_name;
	private String event;
	private String owning_agency;
	private int scene_arrival_time_span;
	private int scene_arr_time_spanmod;
	private int Scene_Arr_Time_SpanMax;
	private long lane_block_clear_time;
	private int Lane_Block_Clear_Time_Span;
	private int Lane_Block_Clear_Time_Span_Mod;
	private int Lan_Block_Clear_Time_Span_Max;
	private long Clear_Time;
	private long Scene_Depart_Time;
	private long Ret_Norm_Time;
	private int Ret_Norm_Time_Span;
	private int Ret_Norm_Time_Span_Mod;
	private int Ret_Norm_Time_Span_Max;
	private int Total_Clear_Time;
	private int DMS;
	private long DMS_Act_Time;
	private long DMS_DeAct_Time;
	private int PVMS;
	private long PVMS_Act_Time;
	private long PVMS_DeAct_Time;
	private int HAR;
	private long HAR_Act_Time;
	private long HAR_DeAct_Time;
	private int CARS_active;
	private int CARS_deactive;
	private int CARS_Man_Act;
	private int CARS_Man_DeAct;
	private int Website_added_incident;
	private int Website_deleted_incident;
	private int Lane_Blocked;
	private long Mod_Time;
	private int Full_Road_Closure;
	private String DMS_Active_List;
	private int Trans_Alert_Act;
	private int Trans_Alert_DeAct;
	private int TCWS;
	private long TCWS_Act_Time;
	private long TCWS_DeAct_Time;
	private int Skyway;
	private long Skyway_Act_Time;
	private long Skyway_DeAct_Time;
	private int Charms_Event_No_Action;
	private int HICF_Sent;
	private int HAR_Slot;
	private int CRDMS_Act;
	private int CRDMS_DeAct;
	private int CR_Fax_Email_Act;
	private int CR_Fax_Email_De_Act;
	private int CR_Web_Act;
	private int CR_Web_DeAct;
	private int Num_Lanes_Blocked;
	private int HICF_Final_Sent;
	private int Scene_ATS;
	private int Lane_BCTS;
	private int Ret_NTS;
	private int Exclude_From_Rep;
	private int Secondary_Incident;
	private int Secondary_Incident_Log_Num;
	private int Inc_Severity;
	private int Inc_Severity_Mod;
	private int Inc_Severity_Maj;
	private String CR_Event_ID;
	private int closed;
	private int locked;
	private int idKey;
	private String crossStreet;
	private String directionDesc;
	private String route;
	private String municipality;
	private String eventDescription;
	private String genEvent;
	private String detectMethod;
	
	private java.sql.Timestamp lastModifiedTime;
	private String lastUser;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getIncident_date() {
		return incident_date;
	}
	public void setIncident_date(long incident_date) {
		this.incident_date = incident_date;
	}
	
	public String getLinkId() {
		return linkId;
	}
	public void setLinkId(String linkId) {
		this.linkId = linkId;
	}
	public long getIncident_time() {
		return incident_time;
	}
	public void setIncident_time(long incident_time) {
		this.incident_time = incident_time;
	}
	public long getDetection_time() {
		return detection_time;
	}
	public void setDetection_time(long detection_time) {
		this.detection_time = detection_time;
	}
	public long getVerification_time() {
		return verification_time;
	}
	public void setVerification_time(long verification_time) {
		this.verification_time = verification_time;
	}
	public long getScene_arrival_time() {
		return scene_arrival_time;
	}
	public void setScene_arrival_time(long scene_arrival_time) {
		this.scene_arrival_time = scene_arrival_time;
	}
	public long getClosed_time() {
		return closed_time;
	}
	public void setClosed_time(long closed_time) {
		this.closed_time = closed_time;
	}
	public String getOperators() {
		return operators;
	}
	public void setOperators(String operators) {
		this.operators = operators;
	}
	public String getOperator_response() {
		return operator_response;
	}
	public void setOperator_response(String operator_response) {
		this.operator_response = operator_response;
	}
	public String getCaller_org() {
		return caller_org;
	}
	public void setCaller_org(String caller_org) {
		this.caller_org = caller_org;
	}
	public String getCaller_phone() {
		return caller_phone;
	}
	public void setCaller_phone(String caller_phone) {
		this.caller_phone = caller_phone;
	}
	public String getCaller_name() {
		return caller_name;
	}
	public void setCaller_name(String caller_name) {
		this.caller_name = caller_name;
	}
	public String getEvent() {
		return event;
	}
	public void setEvent(String event) {
		this.event = event;
	}
	public String getOwning_agency() {
		return owning_agency;
	}
	public void setOwning_agency(String owning_agency) {
		this.owning_agency = owning_agency;
	}
	public int getScene_arrival_time_span() {
		return scene_arrival_time_span;
	}
	public void setScene_arrival_time_span(int scene_arrival_time_span) {
		this.scene_arrival_time_span = scene_arrival_time_span;
	}
	public int getScene_arr_time_spanmod() {
		return scene_arr_time_spanmod;
	}
	public void setScene_arr_time_spanmod(int scene_arr_time_spanmod) {
		this.scene_arr_time_spanmod = scene_arr_time_spanmod;
	}
	public int getScene_Arr_Time_SpanMax() {
		return Scene_Arr_Time_SpanMax;
	}
	public void setScene_Arr_Time_SpanMax(int scene_Arr_Time_SpanMax) {
		Scene_Arr_Time_SpanMax = scene_Arr_Time_SpanMax;
	}
	public long getLane_block_clear_time() {
		return lane_block_clear_time;
	}
	public void setLane_block_clear_time(long lane_block_clear_time) {
		this.lane_block_clear_time = lane_block_clear_time;
	}
	public int getLane_Block_Clear_Time_Span() {
		return Lane_Block_Clear_Time_Span;
	}
	public void setLane_Block_Clear_Time_Span(int lane_Block_Clear_Time_Span) {
		Lane_Block_Clear_Time_Span = lane_Block_Clear_Time_Span;
	}
	public int getLane_Block_Clear_Time_Span_Mod() {
		return Lane_Block_Clear_Time_Span_Mod;
	}
	public void setLane_Block_Clear_Time_Span_Mod(int lane_Block_Clear_Time_Span_Mod) {
		Lane_Block_Clear_Time_Span_Mod = lane_Block_Clear_Time_Span_Mod;
	}
	public int getLan_Block_Clear_Time_Span_Max() {
		return Lan_Block_Clear_Time_Span_Max;
	}
	public void setLan_Block_Clear_Time_Span_Max(int lan_Block_Clear_Time_Span_Max) {
		Lan_Block_Clear_Time_Span_Max = lan_Block_Clear_Time_Span_Max;
	}
	public long getClear_Time() {
		return Clear_Time;
	}
	public void setClear_Time(long clear_Time) {
		Clear_Time = clear_Time;
	}
	public long getScene_Depart_Time() {
		return Scene_Depart_Time;
	}
	public void setScene_Depart_Time(long scene_Depart_Time) {
		Scene_Depart_Time = scene_Depart_Time;
	}
	public long getRet_Norm_Time() {
		return Ret_Norm_Time;
	}
	public void setRet_Norm_Time(long ret_Norm_Time) {
		Ret_Norm_Time = ret_Norm_Time;
	}
	public int getRet_Norm_Time_Span() {
		return Ret_Norm_Time_Span;
	}
	public void setRet_Norm_Time_Span(int ret_Norm_Time_Span) {
		Ret_Norm_Time_Span = ret_Norm_Time_Span;
	}
	public int getRet_Norm_Time_Span_Mod() {
		return Ret_Norm_Time_Span_Mod;
	}
	public void setRet_Norm_Time_Span_Mod(int ret_Norm_Time_Span_Mod) {
		Ret_Norm_Time_Span_Mod = ret_Norm_Time_Span_Mod;
	}
	public int getRet_Norm_Time_Span_Max() {
		return Ret_Norm_Time_Span_Max;
	}
	public void setRet_Norm_Time_Span_Max(int ret_Norm_Time_Span_Max) {
		Ret_Norm_Time_Span_Max = ret_Norm_Time_Span_Max;
	}
	public int getTotal_Clear_Time() {
		return Total_Clear_Time;
	}
	public void setTotal_Clear_Time(int total_Clear_Time) {
		Total_Clear_Time = total_Clear_Time;
	}
	public int getDMS() {
		return DMS;
	}
	public void setDMS(int dMS) {
		DMS = dMS;
	}
	public long getDMS_Act_Time() {
		return DMS_Act_Time;
	}
	public void setDMS_Act_Time(long dMS_Act_Time) {
		DMS_Act_Time = dMS_Act_Time;
	}
	public long getDMS_DeAct_Time() {
		return DMS_DeAct_Time;
	}
	public void setDMS_DeAct_Time(long dMS_DeAct_Time) {
		DMS_DeAct_Time = dMS_DeAct_Time;
	}
	public int getPVMS() {
		return PVMS;
	}
	public void setPVMS(int pVMS) {
		PVMS = pVMS;
	}
	public long getPVMS_Act_Time() {
		return PVMS_Act_Time;
	}
	public void setPVMS_Act_Time(long pVMS_Act_Time) {
		PVMS_Act_Time = pVMS_Act_Time;
	}
	public long getPVMS_DeAct_Time() {
		return PVMS_DeAct_Time;
	}
	public void setPVMS_DeAct_Time(long pVMS_DeAct_Time) {
		PVMS_DeAct_Time = pVMS_DeAct_Time;
	}
	public int getHAR() {
		return HAR;
	}
	public void setHAR(int hAR) {
		HAR = hAR;
	}
	public long getHAR_Act_Time() {
		return HAR_Act_Time;
	}
	public void setHAR_Act_Time(long hAR_Act_Time) {
		HAR_Act_Time = hAR_Act_Time;
	}
	public long getHAR_DeAct_Time() {
		return HAR_DeAct_Time;
	}
	public void setHAR_DeAct_Time(long hAR_DeAct_Time) {
		HAR_DeAct_Time = hAR_DeAct_Time;
	}
	public int getCARS_active() {
		return CARS_active;
	}
	public void setCARS_active(int cARS_active) {
		CARS_active = cARS_active;
	}
	public int getCARS_deactive() {
		return CARS_deactive;
	}
	public void setCARS_deactive(int cARS_deactive) {
		CARS_deactive = cARS_deactive;
	}
	public int getCARS_Man_Act() {
		return CARS_Man_Act;
	}
	public void setCARS_Man_Act(int cARS_Man_Act) {
		CARS_Man_Act = cARS_Man_Act;
	}
	public int getCARS_Man_DeAct() {
		return CARS_Man_DeAct;
	}
	public void setCARS_Man_DeAct(int cARS_Man_DeAct) {
		CARS_Man_DeAct = cARS_Man_DeAct;
	}
	public int getWebsite_added_incident() {
		return Website_added_incident;
	}
	public void setWebsite_added_incident(int website_added_incident) {
		Website_added_incident = website_added_incident;
	}
	public int getWebsite_deleted_incident() {
		return Website_deleted_incident;
	}
	public void setWebsite_deleted_incident(int website_deleted_incident) {
		Website_deleted_incident = website_deleted_incident;
	}
	public int getLane_Blocked() {
		return Lane_Blocked;
	}
	public void setLane_Blocked(int lane_Blocked) {
		Lane_Blocked = lane_Blocked;
	}
	public long getMod_Time() {
		return Mod_Time;
	}
	public void setMod_Time(long mod_Time) {
		Mod_Time = mod_Time;
	}
	public int getFull_Road_Closure() {
		return Full_Road_Closure;
	}
	public void setFull_Road_Closure(int full_Road_Closure) {
		Full_Road_Closure = full_Road_Closure;
	}
	public String getDMS_Active_List() {
		return DMS_Active_List;
	}
	public void setDMS_Active_List(String dMS_Active_List) {
		DMS_Active_List = dMS_Active_List;
	}
	public int getTrans_Alert_Act() {
		return Trans_Alert_Act;
	}
	public void setTrans_Alert_Act(int trans_Alert_Act) {
		Trans_Alert_Act = trans_Alert_Act;
	}
	public int getTrans_Alert_DeAct() {
		return Trans_Alert_DeAct;
	}
	public void setTrans_Alert_DeAct(int trans_Alert_DeAct) {
		Trans_Alert_DeAct = trans_Alert_DeAct;
	}
	public int getTCWS() {
		return TCWS;
	}
	public void setTCWS(int tCWS) {
		TCWS = tCWS;
	}
	public long getTCWS_Act_Time() {
		return TCWS_Act_Time;
	}
	public void setTCWS_Act_Time(long tCWS_Act_Time) {
		TCWS_Act_Time = tCWS_Act_Time;
	}
	public long getTCWS_DeAct_Time() {
		return TCWS_DeAct_Time;
	}
	public void setTCWS_DeAct_Time(long tCWS_DeAct_Time) {
		TCWS_DeAct_Time = tCWS_DeAct_Time;
	}
	public int getSkyway() {
		return Skyway;
	}
	public void setSkyway(int skyway) {
		Skyway = skyway;
	}
	public long getSkyway_Act_Time() {
		return Skyway_Act_Time;
	}
	public void setSkyway_Act_Time(long skyway_Act_Time) {
		Skyway_Act_Time = skyway_Act_Time;
	}
	public long getSkyway_DeAct_Time() {
		return Skyway_DeAct_Time;
	}
	public void setSkyway_DeAct_Time(long skyway_DeAct_Time) {
		Skyway_DeAct_Time = skyway_DeAct_Time;
	}
	public int getCharms_Event_No_Action() {
		return Charms_Event_No_Action;
	}
	public void setCharms_Event_No_Action(int charms_Event_No_Action) {
		Charms_Event_No_Action = charms_Event_No_Action;
	}
	public int getHICF_Sent() {
		return HICF_Sent;
	}
	public void setHICF_Sent(int hICF_Sent) {
		HICF_Sent = hICF_Sent;
	}
	public int getHAR_Slot() {
		return HAR_Slot;
	}
	public void setHAR_Slot(int hAR_Slot) {
		HAR_Slot = hAR_Slot;
	}
	public int getCRDMS_Act() {
		return CRDMS_Act;
	}
	public void setCRDMS_Act(int cRDMS_Act) {
		CRDMS_Act = cRDMS_Act;
	}
	public int getCRDMS_DeAct() {
		return CRDMS_DeAct;
	}
	public void setCRDMS_DeAct(int cRDMS_DeAct) {
		CRDMS_DeAct = cRDMS_DeAct;
	}
	public int getCR_Fax_Email_Act() {
		return CR_Fax_Email_Act;
	}
	public void setCR_Fax_Email_Act(int cR_Fax_Email_Act) {
		CR_Fax_Email_Act = cR_Fax_Email_Act;
	}
	public int getCR_Fax_Email_De_Act() {
		return CR_Fax_Email_De_Act;
	}
	public void setCR_Fax_Email_De_Act(int cR_Fax_Email_De_Act) {
		CR_Fax_Email_De_Act = cR_Fax_Email_De_Act;
	}
	public int getCR_Web_Act() {
		return CR_Web_Act;
	}
	public void setCR_Web_Act(int cR_Web_Act) {
		CR_Web_Act = cR_Web_Act;
	}
	public int getCR_Web_DeAct() {
		return CR_Web_DeAct;
	}
	public void setCR_Web_DeAct(int cR_Web_DeAct) {
		CR_Web_DeAct = cR_Web_DeAct;
	}
	public int getNum_Lanes_Blocked() {
		return Num_Lanes_Blocked;
	}
	public void setNum_Lanes_Blocked(int num_Lanes_Blocked) {
		Num_Lanes_Blocked = num_Lanes_Blocked;
	}
	public int getHICF_Final_Sent() {
		return HICF_Final_Sent;
	}
	public void setHICF_Final_Sent(int hICF_Final_Sent) {
		HICF_Final_Sent = hICF_Final_Sent;
	}
	public int getScene_ATS() {
		return Scene_ATS;
	}
	public void setScene_ATS(int scene_ATS) {
		Scene_ATS = scene_ATS;
	}
	public int getLane_BCTS() {
		return Lane_BCTS;
	}
	public void setLane_BCTS(int lane_BCTS) {
		Lane_BCTS = lane_BCTS;
	}
	public int getRet_NTS() {
		return Ret_NTS;
	}
	public void setRet_NTS(int ret_NTS) {
		Ret_NTS = ret_NTS;
	}
	public int getExclude_From_Rep() {
		return Exclude_From_Rep;
	}
	public void setExclude_From_Rep(int exclude_From_Rep) {
		Exclude_From_Rep = exclude_From_Rep;
	}
	public int getSecondary_Incident() {
		return Secondary_Incident;
	}
	public void setSecondary_Incident(int secondary_Incident) {
		Secondary_Incident = secondary_Incident;
	}
	public int getSecondary_Incident_Log_Num() {
		return Secondary_Incident_Log_Num;
	}
	public void setSecondary_Incident_Log_Num(int secondary_Incident_Log_Num) {
		Secondary_Incident_Log_Num = secondary_Incident_Log_Num;
	}
	public int getInc_Severity() {
		return Inc_Severity;
	}
	public void setInc_Severity(int inc_Severity) {
		Inc_Severity = inc_Severity;
	}
	public int getInc_Severity_Mod() {
		return Inc_Severity_Mod;
	}
	public void setInc_Severity_Mod(int inc_Severity_Mod) {
		Inc_Severity_Mod = inc_Severity_Mod;
	}
	public int getInc_Severity_Maj() {
		return Inc_Severity_Maj;
	}
	public void setInc_Severity_Maj(int inc_Severity_Maj) {
		Inc_Severity_Maj = inc_Severity_Maj;
	}
	public String getCR_Event_ID() {
		return CR_Event_ID;
	}
	public void setCR_Event_ID(String cR_Event_ID) {
		CR_Event_ID = cR_Event_ID;
	}
	public int getClosed() {
		return closed;
	}
	public void setClosed(int closed) {
		this.closed = closed;
	}
	public int getLocked() {
		return locked;
	}
	public void setLocked(int locked) {
		this.locked = locked;
	}
	public int getIdKey() {
		return idKey;
	}
	public void setIdKey(int idKey) {
		this.idKey = idKey;
	}
	public String getCrossStreet() {
		return crossStreet;
	}
	public void setCrossStreet(String crossStreet) {
		this.crossStreet = crossStreet;
	}
	public String getDirectionDesc() {
		return directionDesc;
	}
	public void setDirectionDesc(String directionDesc) {
		this.directionDesc = directionDesc;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getMunicipality() {
		return municipality;
	}
	public void setMunicipality(String municipality) {
		this.municipality = municipality;
	}
	public String getEventDescription() {
		return eventDescription;
	}
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}
	public String getGenEvent() {
		return genEvent;
	}
	public void setGenEvent(String genEvent) {
		this.genEvent = genEvent;
	}
	public String getDetectMethod() {
		return detectMethod;
	}
	public void setDetectMethod(String detectMethod) {
		this.detectMethod = detectMethod;
	}
	public java.sql.Timestamp getLastModifiedTime() {
		return lastModifiedTime;
	}
	public void setLastModifiedTime(java.sql.Timestamp lastModifiedTime) {
		this.lastModifiedTime = lastModifiedTime;
	}
	public String getLastUser() {
		return lastUser;
	}
	public void setLastUser(String lastUser) {
		this.lastUser = lastUser;
	}
	public int getDow() {
		return dow;
	}
	public void setDow(int dow) {
		this.dow = dow;
	}
	
}
