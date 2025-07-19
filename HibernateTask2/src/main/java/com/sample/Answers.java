package com.sample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Answers {
	
	@Id
	private int aId;
	private String answer;
	
	@ManyToOne
	private Question q;

	public int getaId() {
		return aId;
	}

	public void setaId(int aId) {
		this.aId = aId;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getQ() {
		return q;
	}

	public void setQ(Question q) {
		this.q = q;
	}

	public Answers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Answers(int aId, String answer, Question q) {
		super();
		this.aId = aId;
		this.answer = answer;
		this.q = q;
	}
	
	

}
