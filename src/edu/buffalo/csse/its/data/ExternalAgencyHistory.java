package edu.buffalo.csse.its.data;

import java.io.Serializable;

public class ExternalAgencyHistory implements Serializable{

	private static final long serialVersionUID = -4473408068138005303L;
	
	private long seq_no;
	private int ateid;
	private long detectionTime;
	private String agency;
	private long notificationTime;
	private long arrivalTime;
	private long departureTime;
	private long universalUpdateTime;
	private long localUpdateTime;
	
	private java.sql.Timestamp lastModifiedTime;
	private String lastUser;
	
	
	public int getAteid() {
		return ateid;
	}
	public void setAteid(int ateid) {
		this.ateid = ateid;
	}
	public long getSeq_no() {
		return seq_no;
	}
	public void setSeq_no(long seq_no) {
		this.seq_no = seq_no;
	}
	public long getDetectionTime() {
		return detectionTime;
	}
	public void setDetectionTime(long detectionTime) {
		this.detectionTime = detectionTime;
	}
	public String getAgency() {
		return agency;
	}
	public void setAgency(String agency) {
		this.agency = agency;
	}
	public long getNotificationTime() {
		return notificationTime;
	}
	public void setNotificationTime(long notificationTime) {
		this.notificationTime = notificationTime;
	}
	public long getArrivalTime() {
		return arrivalTime;
	}
	public void setArrivalTime(long arrivalTime) {
		this.arrivalTime = arrivalTime;
	}
	public long getDepartureTime() {
		return departureTime;
	}
	public void setDepartureTime(long departureTime) {
		this.departureTime = departureTime;
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
