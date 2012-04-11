package edu.buffalo.csse.its.data;

import java.io.Serializable;

public class DeviceHistory implements Serializable{

	private static final long serialVersionUID = 1512512104176045932L;
	
	private long seq_no;
	private long universalUpdateTime;
	private long localUpdateTime;
	private String action;
	private String deviceType;
	private int deviceId;
	private int deviceComponentId;
	private String description;
	private String sourceType;
	private String sourceId;
	private String state;
	private String status;
	
	private java.sql.Timestamp lastModifiedTime;
	private String lastUser;
	
	public DeviceHistory(){}

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

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public int getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(int deviceId) {
		this.deviceId = deviceId;
	}

	public int getDeviceComponentId() {
		return deviceComponentId;
	}

	public void setDeviceComponentId(int deviceComponentId) {
		this.deviceComponentId = deviceComponentId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
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
