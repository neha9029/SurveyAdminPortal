package com.admin.model;


public class Surveys {

	private long surveyId;
	private String surveyName;
	private String surveyDescription;
	private String accountType;


	public long getSurveyId() {
		return surveyId;
	}
	
	public void setSurveyId(long surveyId) {
		this.surveyId = surveyId;
	}
	
	public String getSurveyName() {
		return surveyName;
	}
	
	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}

	public String getAccountType() {
		return accountType;
	}
	
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public String getSurveyDescription() {
		return surveyDescription;
	}
	
	public void setSurveyDescription(String surveyDescription) {
		this.surveyDescription = surveyDescription;
	}

	@Override
	public String toString() {
		return "Surveys [surveyId=" + surveyId + ", surveyName=" + surveyName + ", surveyDescription="
				+ surveyDescription + ", accountType=" + accountType + "]";
	}

	
}
