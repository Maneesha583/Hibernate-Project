package com.sample;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Developer {
   
	@Id
	private int dId;
	private String dName;
	
	@ManyToMany
	private List<Project> project;

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Developer(int dId, String dName, List<Project> project) {
		super();
		this.dId = dId;
		this.dName = dName;
		this.project = project;
	}
	
	
}
