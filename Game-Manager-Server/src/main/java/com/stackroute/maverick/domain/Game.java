package com.stackroute.maverick.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "game")
public class Game {

	@Id
	private int gameId;
	private String gameImage;
	private String createdBy;
	private Date createdOn;
	private String gameType;
	private String gameDescription;
	private String gameRules;
	private int gamePopularity;
	private GameQuestionLevel questionLevels;
	private GameQuestionTime questionTime;
	private GameQuestionScore questionScore;
	private Topic topic;

	public Game() {
	}

	public Game(int gameId, String gameImage, String createdBy, Date createdOn, String gameType, String gameDescription,
			String gameRules, int gamePopularity, GameQuestionLevel questionLevels, GameQuestionTime questionTime,
			GameQuestionScore questionScore, Topic topic) {
		super();
		this.gameId = gameId;
		this.gameImage= gameImage;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.gameType = gameType;
		this.gameDescription = gameDescription;
		this.gameRules = gameRules;
		this.gamePopularity = gamePopularity;
		this.questionLevels = questionLevels;
		this.questionTime = questionTime;
		this.questionScore = questionScore;
		this.topic = topic;
	}

	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	public String getGameDescription() {
		return gameDescription;
	}

	public void setGameDescription(String gameDescription) {
		this.gameDescription = gameDescription;
	}

	public String getGameRules() {
		return gameRules;
	}

	public void setGameRules(String gameRules) {
		this.gameRules = gameRules;
	}

	public int getGamePopularity() {
		return gamePopularity;
	}

	public void setGamePopularity(int gamePopularity) {
		this.gamePopularity = gamePopularity;
	}

	public GameQuestionLevel getQuestionLevels() {
		return questionLevels;
	}

	public void setQuestionLevels(GameQuestionLevel questionLevels) {
		this.questionLevels = questionLevels;
	}

	public GameQuestionTime getQuestionTime() {
		return questionTime;
	}

	public void setQuestionTime(GameQuestionTime questionTime) {
		this.questionTime = questionTime;
	}

	public GameQuestionScore getQuestionScore() {
		return questionScore;
	}

	public void setQuestionScore(GameQuestionScore questionScore) {
		this.questionScore = questionScore;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}

	public String getGameImage() {
		return gameImage;
	}

	public void setGameImage(String gameImage) {
		this.gameImage = gameImage;
	}

	@Override
	public String toString() {
		return "Game [gameId=" + gameId + ", gameImage=" + gameImage + ", createdBy=" + createdBy + ", createdOn="
				+ createdOn + ", gameType=" + gameType + ", gameDescription=" + gameDescription + ", gameRules="
				+ gameRules + ", gamePopularity=" + gamePopularity + ", questionLevels=" + questionLevels
				+ ", questionTime=" + questionTime + ", questionScore=" + questionScore + ", topic=" + topic + "]";
	}
}
