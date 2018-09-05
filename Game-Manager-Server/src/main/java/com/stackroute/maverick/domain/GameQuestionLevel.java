package com.stackroute.maverick.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "gamequestionlevel")
public class GameQuestionLevel {

	@Id
	private int gqLevelId;
	private int easyLevel;
	private int mediumLevel;
	private int advancedLevel;

	public GameQuestionLevel() {

	}

	public GameQuestionLevel(int gqLevelId, int easyLevel, int mediumLevel, int advancedLevel) {
		super();
		this.gqLevelId = gqLevelId;
		this.easyLevel = easyLevel;
		this.mediumLevel = mediumLevel;
		this.advancedLevel = advancedLevel;
	}

	public int getGqLevelId() {
		return gqLevelId;
	}

	public void setGqLevelId(int gqLevelId) {
		this.gqLevelId = gqLevelId;
	}

	public int getEasyLevel() {
		return easyLevel;
	}

	public void setEasyLevel(int easyLevel) {
		this.easyLevel = easyLevel;
	}

	public int getMediumLevel() {
		return mediumLevel;
	}

	public void setMediumLevel(int mediumLevel) {
		this.mediumLevel = mediumLevel;
	}

	public int getAdvancedLevel() {
		return advancedLevel;
	}

	public void setAdvancedLevel(int advancedLevel) {
		this.advancedLevel = advancedLevel;
	}

	@Override
	public String toString() {
		return "GameQuestionLevel [gqLevelId=" + gqLevelId + ", easyLevel=" + easyLevel + ", mediumLevel=" + mediumLevel
				+ ", advancedLevel=" + advancedLevel + "]";
	}

}
