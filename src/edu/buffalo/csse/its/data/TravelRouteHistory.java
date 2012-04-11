package edu.buffalo.csse.its.data;

import java.io.Serializable;

public class TravelRouteHistory implements Serializable{

	private static final long serialVersionUID = -8922705792318168322L;
	
	private long seq_no;
	private String routeName;
	private double travelTime;
	private String operatorMode;
	private long updateTime;
	private java.sql.Timestamp lastModifiedTime;
	private String lastUser;
	
	public long getSeq_no() {
		return seq_no;
	}
	public void setSeq_no(long seq_no) {
		this.seq_no = seq_no;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	public double getTravelTime() {
		return travelTime;
	}
	public void setTravelTime(double travelTime) {
		this.travelTime = travelTime;
	}
	public String getOperatorMode() {
		return operatorMode;
	}
	public void setOperatorMode(String operatorMode) {
		this.operatorMode = operatorMode;
	}
	public long getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(long updateTime) {
		this.updateTime = updateTime;
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
