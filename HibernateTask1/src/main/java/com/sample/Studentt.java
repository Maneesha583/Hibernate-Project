package com.sample;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Studentt {

	@Id
	private int sId;
	private String sName;
	private long sContact;
	
	@Embedded
	private Course course;
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public long getSContact() {
		return sContact;
	}
	public void setSContact(long sContact) {
		this.sContact = sContact;
	}
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Studentt() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Studentt(int sId, String sName, long sContact) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sContact = sContact;
	}
	
	

}
