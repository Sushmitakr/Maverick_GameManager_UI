package com.stackroute.maverick.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "gamequestiontime")
public class GameQuestionTime {

	@Id
	private int gqTimeId;
	private int easyQuestionsTime;
	private int mediumQuestionsTime;
	private int advanceQuestionsTime;

	public GameQuestionTime() {
		// TODO Auto-generated constructor stub
	}

	public GameQuestionTime(int gqTimeId, int easyQuestionsTime, int mediumQuestionsTime, int advanceQuestionsTime) {
		super();
		this.gqTimeId = gqTimeId;
		this.easyQuestionsTime = easyQuestionsTime;
		this.mediumQuestionsTime = mediumQuestionsTime;
		this.advanceQuestionsTime = advanceQuestionsTime;
	}

	public int getGqTimeId() {
		return gqTimeId;
	}

	public void setGqTimeId(int gqTimeId) {
		this.gqTimeId = gqTimeId;
	}

	public int getEasyQuestionsTime() {
		return easyQuestionsTime;
	}

	public void setEasyQuestionsTime(int easyQuestionsTime) {
		this.easyQuestionsTime = easyQuestionsTime;
	}

	public int getMediumQuestionsTime() {
		return mediumQuestionsTime;
	}

	public void setMediumQuestionsTime(int mediumQuestionsTime) {
		this.mediumQuestionsTime = mediumQuestionsTime;
	}

	public int getAdvanceQuestionsTime() {
		return advanceQuestionsTime;
	}

	public void setAdvanceQuestionsTime(int advanceQuestionsTime) {
		this.advanceQuestionsTime = advanceQuestionsTime;
	}

	@Override
	public String toString() {
		return "GameQuestionTime [gqTimeId=" + gqTimeId + ", easyQuestionsTime=" + easyQuestionsTime
				+ ", mediumQuestionsTime=" + mediumQuestionsTime + ", advanceQuestionsTime=" + advanceQuestionsTime
				+ "]";
	}

}
