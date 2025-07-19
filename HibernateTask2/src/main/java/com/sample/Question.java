package com.sample;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Question {
	
	@Id
	private int qId;
	private String question;
	
	@OneToMany
	private List<Answers> ans;

	public int getqId() {
		return qId;
	}

	public void setqId(int qId) {
		this.qId = qId;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public List<Answers> getAns() {
		return ans;
	}

	public void setAns(List<Answers> ans) {
		this.ans = ans;
	}

	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Question(int qId, String question, List<Answers> ans) {
		super();
		this.qId = qId;
		this.question = question;
		this.ans = ans;
	}
	
	
	

}
