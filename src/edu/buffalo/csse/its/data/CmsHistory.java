package edu.buffalo.csse.its.data;

import java.io.Serializable;

public class CmsHistory implements Serializable{
	
	private static final long serialVersionUID = 8274622112525621920L;
	
	private long seq_no;
	private long local_update_time;
	private long univeral_update_time;
	private String device_type;
	private int device_id;
	private int number_of_phases;
	private String static_text1;
	private String static_text2;
	private String static_text3;
	private String phase1_line1_text;
	private String phase1_line2_text;
	private String phase1_line3_text;
	private String phase2_line1_text;
	private String phase2_line2_text;
	private String phase2_line3_text;
	
	private java.sql.Timestamp lastModifiedTime;
	private String lastUser;
	public long getSeq_no() {
		return seq_no;
	}
	public void setSeq_no(long seq_no) {
		this.seq_no = seq_no;
	}
	public long getLocal_update_time() {
		return local_update_time;
	}
	public void setLocal_update_time(long local_update_time) {
		this.local_update_time = local_update_time;
	}
	public long getUniveral_update_time() {
		return univeral_update_time;
	}
	public void setUniveral_update_time(long univeral_update_time) {
		this.univeral_update_time = univeral_update_time;
	}
	public String getDevice_type() {
		return device_type;
	}
	public void setDevice_type(String device_type) {
		this.device_type = device_type;
	}
	public int getDevice_id() {
		return device_id;
	}
	public void setDevice_id(int device_id) {
		this.device_id = device_id;
	}
	public int getNumber_of_phases() {
		return number_of_phases;
	}
	public void setNumber_of_phases(int number_of_phases) {
		this.number_of_phases = number_of_phases;
	}
	public String getStatic_text1() {
		return static_text1;
	}
	public void setStatic_text1(String static_text1) {
		this.static_text1 = static_text1;
	}
	public String getStatic_text2() {
		return static_text2;
	}
	public void setStatic_text2(String static_text2) {
		this.static_text2 = static_text2;
	}
	public String getStatic_text3() {
		return static_text3;
	}
	public void setStatic_text3(String static_text3) {
		this.static_text3 = static_text3;
	}
	public String getPhase1_line1_text() {
		return phase1_line1_text;
	}
	public void setPhase1_line1_text(String phase1_line1_text) {
		this.phase1_line1_text = phase1_line1_text;
	}
	public String getPhase1_line2_text() {
		return phase1_line2_text;
	}
	public void setPhase1_line2_text(String phase1_line2_text) {
		this.phase1_line2_text = phase1_line2_text;
	}
	public String getPhase1_line3_text() {
		return phase1_line3_text;
	}
	public void setPhase1_line3_text(String phase1_line3_text) {
		this.phase1_line3_text = phase1_line3_text;
	}
	public String getPhase2_line1_text() {
		return phase2_line1_text;
	}
	public void setPhase2_line1_text(String phase2_line1_text) {
		this.phase2_line1_text = phase2_line1_text;
	}
	public String getPhase2_line2_text() {
		return phase2_line2_text;
	}
	public void setPhase2_line2_text(String phase2_line2_text) {
		this.phase2_line2_text = phase2_line2_text;
	}
	public String getPhase2_line3_text() {
		return phase2_line3_text;
	}
	public void setPhase2_line3_text(String phase2_line3_text) {
		this.phase2_line3_text = phase2_line3_text;
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
