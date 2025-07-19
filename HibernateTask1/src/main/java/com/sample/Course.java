package com.sample;

import javax.persistence.Embeddable;

@Embeddable
public class Course {
	

	private int cid;
	private String cName;
	private String cDuration;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public String getcDuration() {
		return cDuration;
	}
	public void setcDuration(String cDuration) {
		this.cDuration = cDuration;
	}
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Course(int cid, String cName, String cDuration) {
		super();
		this.cid = cid;
		this.cName = cName;
		this.cDuration = cDuration;
	}

	
}
