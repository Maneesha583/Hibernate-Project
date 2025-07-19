package com.sample;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Project {
	
	@Id
	private int pId;
	private String pName;
	
	@ManyToMany
	private List<Developer> developer;

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

	public List<Developer> getDeveloper() {
		return developer;
	}

	public void setDeveloper(List<Developer> developer) {
		this.developer = developer;
	}

	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
