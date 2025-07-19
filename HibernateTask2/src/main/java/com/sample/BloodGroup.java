package com.sample;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BloodGroup {
    
	@Id
	private int bgId;
	private String bgName;
	public int getBgId() {
		return bgId;
	}
	public void setBgId(int bgId) {
		this.bgId = bgId;
	}
	public String getBgName() {
		return bgName;
	}
	public void setBgName(String bgName) {
		this.bgName = bgName;
	}
	public BloodGroup() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BloodGroup(int bgId, String bgName) {
		super();
		this.bgId = bgId;
		this.bgName = bgName;
	}
	
	
}
