package com.sample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class Person {
	
	
	@Id
	private int pId;
	private String pName;
	
	@OneToOne
	private BloodGroup bg;
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public BloodGroup getBg() {
		return bg;
	}
	public void setBg(BloodGroup bg) {
		this.bg = bg;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Person(int pId, String pName, BloodGroup bg) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.bg = bg;
	}
	
	

}
