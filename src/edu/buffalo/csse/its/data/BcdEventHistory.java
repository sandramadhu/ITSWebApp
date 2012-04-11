package edu.buffalo.csse.its.data;

import java.io.Serializable;

public class BcdEventHistory implements Serializable{

	private static final long serialVersionUID = -697937888447148607L;

	private long seq_no;
	private long universalUpdateTime;
	private long localUpdateTime;
	private int id;
	private String owner;
	private String description;
	private String source;
	private long confirmationTime;
	private String state;
	private String action;
	private int linkId;
	private double peaceBridgeUsToCan;
	private double peaceBridgeCanToUs;
	private double rainbowBridgeUsToCan;
	private double rainbowBridgeCanToUs;
	private double qlBridgeUsToCan;
	private double qlBridgeCanToUs;
	
	private java.sql.Timestamp lastModifiedTime;
	private String lastUser;
	
	public BcdEventHistory(){}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getSeq_no() {
		return seq_no;
	}

	public void setSeq_no(long seq_no) {
		this.seq_no = seq_no;
	}

	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
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

	public long getConfirmationTime() {
		return confirmationTime;
	}

	public void setConfirmationTime(long confirmationTime) {
		this.confirmationTime = confirmationTime;
	}

	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public int getLinkId() {
		return linkId;
	}
	public void setLinkId(int linkId) {
		this.linkId = linkId;
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

	public double getPeaceBridgeUsToCan() {
		return peaceBridgeUsToCan;
	}

	public void setPeaceBridgeUsToCan(double peaceBridgeUsToCan) {
		this.peaceBridgeUsToCan = peaceBridgeUsToCan;
	}

	public double getPeaceBridgeCanToUs() {
		return peaceBridgeCanToUs;
	}

	public void setPeaceBridgeCanToUs(double peaceBridgeCanToUs) {
		this.peaceBridgeCanToUs = peaceBridgeCanToUs;
	}

	public double getRainbowBridgeUsToCan() {
		return rainbowBridgeUsToCan;
	}

	public void setRainbowBridgeUsToCan(double rainbowBridgeUsToCan) {
		this.rainbowBridgeUsToCan = rainbowBridgeUsToCan;
	}

	public double getRainbowBridgeCanToUs() {
		return rainbowBridgeCanToUs;
	}

	public void setRainbowBridgeCanToUs(double rainbowBridgeCanToUs) {
		this.rainbowBridgeCanToUs = rainbowBridgeCanToUs;
	}

	public double getQlBridgeUsToCan() {
		return qlBridgeUsToCan;
	}

	public void setQlBridgeUsToCan(double qlBridgeUsToCan) {
		this.qlBridgeUsToCan = qlBridgeUsToCan;
	}

	public double getQlBridgeCanToUs() {
		return qlBridgeCanToUs;
	}

	public void setQlBridgeCanToUs(double qlBridgeCanToUs) {
		this.qlBridgeCanToUs = qlBridgeCanToUs;
	}
	
}
