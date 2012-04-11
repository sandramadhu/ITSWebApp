package edu.buffalo.csse.its.data;

import java.io.Serializable;

public class TrafficEventHistory implements Serializable{

	private static final long serialVersionUID = 3843926454318659570L;
	
	private long seq_no;
	private long universalUpdateTime;
	private long localUpdateTime;
	private String action;
	private int ateid;
	private String tetype;
	private String state;
	private String owner;
	private String cause;
	private String subcause;
	private int severity;
	private String district;
	private String town;
	private String longdesc;
	private String vehicles_involved;
	private String head_long_road_name;
	private String head_loc_string;
	private String tail_long_road_name;
	private String tail_loc_string;
	private double distance_covered;
	private long detectionTime;
	private long confirmationTime;
	private long notificationTime;
	private String estimatedDuration;
	private String confirmationSource;
	private String source;
	private int headvdsid;
	private int tailvdsid;
	private int queueid;
	private int incident_id;
	private String blocked_lane;
	private String left_shoulder;
	private String right_shoulder;
	private String full_closure;
	private String secondary;
	private String injuries;
	private long occurence_time;
	private long initial_notification_time;
	private long verification_time;
	private long normal_traffic_flow_time;
	private String wrecker_clears_lanes;
	private String areas;
	private String transittype;
	
	private java.sql.Timestamp lastModifiedTime;
	private String lastUser;
	public long getSeq_no() {
		return seq_no;
	}
	public void setSeq_no(long seq_no) {
		this.seq_no = seq_no;
	}
	public long getUniversalUpdateTime() {
		return universalUpdateTime;
	}
	public void setUniversalUpdateTime(long universalUpdateTime) {
		this.universalUpdateTime = universalUpdateTime;
	}
	public long getLocalUpdateTime() {
		return localUpdateTime;
	}
	public void setLocalUpdateTime(long localUpdateTime) {
		this.localUpdateTime = localUpdateTime;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public int getAteid() {
		return ateid;
	}
	public void setAteid(int ateid) {
		this.ateid = ateid;
	}
	public String getTetype() {
		return tetype;
	}
	public void setTetype(String tetype) {
		this.tetype = tetype;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public String getSubcause() {
		return subcause;
	}
	public void setSubcause(String subcause) {
		this.subcause = subcause;
	}
	public int getSeverity() {
		return severity;
	}
	public void setSeverity(int severity) {
		this.severity = severity;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getTown() {
		return town;
	}
	public void setTown(String town) {
		this.town = town;
	}
	public String getLongdesc() {
		return longdesc;
	}
	public void setLongdesc(String longdesc) {
		this.longdesc = longdesc;
	}
	public String getVehicles_involved() {
		return vehicles_involved;
	}
	public void setVehicles_involved(String vehicles_involved) {
		this.vehicles_involved = vehicles_involved;
	}
	public String getHead_long_road_name() {
		return head_long_road_name;
	}
	public void setHead_long_road_name(String head_long_road_name) {
		this.head_long_road_name = head_long_road_name;
	}
	public String getHead_loc_string() {
		return head_loc_string;
	}
	public void setHead_loc_string(String head_loc_string) {
		this.head_loc_string = head_loc_string;
	}
	public String getTail_long_road_name() {
		return tail_long_road_name;
	}
	public void setTail_long_road_name(String tail_long_road_name) {
		this.tail_long_road_name = tail_long_road_name;
	}
	public String getTail_loc_string() {
		return tail_loc_string;
	}
	public void setTail_loc_string(String tail_loc_string) {
		this.tail_loc_string = tail_loc_string;
	}
	public double getDistance_covered() {
		return distance_covered;
	}
	public void setDistance_covered(double distance_covered) {
		this.distance_covered = distance_covered;
	}
	public long getDetectionTime() {
		return detectionTime;
	}
	public void setDetectionTime(long detectionTime) {
		this.detectionTime = detectionTime;
	}
	public long getConfirmationTime() {
		return confirmationTime;
	}
	public void setConfirmationTime(long confirmationTime) {
		this.confirmationTime = confirmationTime;
	}
	public long getNotificationTime() {
		return notificationTime;
	}
	public void setNotificationTime(long notificationTime) {
		this.notificationTime = notificationTime;
	}
	public String getEstimatedDuration() {
		return estimatedDuration;
	}
	public void setEstimatedDuration(String estimatedDuration) {
		this.estimatedDuration = estimatedDuration;
	}
	public String getConfirmationSource() {
		return confirmationSource;
	}
	public void setConfirmationSource(String confirmationSource) {
		this.confirmationSource = confirmationSource;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public int getHeadvdsid() {
		return headvdsid;
	}
	public void setHeadvdsid(int headvdsid) {
		this.headvdsid = headvdsid;
	}
	public int getTailvdsid() {
		return tailvdsid;
	}
	public void setTailvdsid(int tailvdsid) {
		this.tailvdsid = tailvdsid;
	}
	public int getQueueid() {
		return queueid;
	}
	public void setQueueid(int queueid) {
		this.queueid = queueid;
	}
	public int getIncident_id() {
		return incident_id;
	}
	public void setIncident_id(int incident_id) {
		this.incident_id = incident_id;
	}
	public String getBlocked_lane() {
		return blocked_lane;
	}
	public void setBlocked_lane(String blocked_lane) {
		this.blocked_lane = blocked_lane;
	}
	public String getLeft_shoulder() {
		return left_shoulder;
	}
	public void setLeft_shoulder(String left_shoulder) {
		this.left_shoulder = left_shoulder;
	}
	public String getRight_shoulder() {
		return right_shoulder;
	}
	public void setRight_shoulder(String right_shoulder) {
		this.right_shoulder = right_shoulder;
	}
	public String getFull_closure() {
		return full_closure;
	}
	public void setFull_closure(String full_closure) {
		this.full_closure = full_closure;
	}
	public String getSecondary() {
		return secondary;
	}
	public void setSecondary(String secondary) {
		this.secondary = secondary;
	}
	public String getInjuries() {
		return injuries;
	}
	public void setInjuries(String injuries) {
		this.injuries = injuries;
	}
	public long getOccurence_time() {
		return occurence_time;
	}
	public void setOccurence_time(long occurence_time) {
		this.occurence_time = occurence_time;
	}
	public long getInitial_notification_time() {
		return initial_notification_time;
	}
	public void setInitial_notification_time(long initial_notification_time) {
		this.initial_notification_time = initial_notification_time;
	}
	public long getVerification_time() {
		return verification_time;
	}
	public void setVerification_time(long verification_time) {
		this.verification_time = verification_time;
	}
	public long getNormal_traffic_flow_time() {
		return normal_traffic_flow_time;
	}
	public void setNormal_traffic_flow_time(long normal_traffic_flow_time) {
		this.normal_traffic_flow_time = normal_traffic_flow_time;
	}
	public String getWrecker_clears_lanes() {
		return wrecker_clears_lanes;
	}
	public void setWrecker_clears_lanes(String wrecker_clears_lanes) {
		this.wrecker_clears_lanes = wrecker_clears_lanes;
	}
	public String getAreas() {
		return areas;
	}
	public void setAreas(String areas) {
		this.areas = areas;
	}
	public String getTransittype() {
		return transittype;
	}
	public void setTransittype(String transittype) {
		this.transittype = transittype;
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
	
}
