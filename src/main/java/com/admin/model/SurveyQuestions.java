package com.admin.model;

public class SurveyQuestions {
	
	private long questionId;
	private int surveyId;
	private String questionTitle;
	public long getQuestionId() {
		return questionId;
	}
	
	
	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}
	public int getSurveyId() {
		return surveyId;
	}
	public void setSurveyId(int surveyId) {
		this.surveyId = surveyId;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	
	
	
	

}
