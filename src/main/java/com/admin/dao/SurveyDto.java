package com.admin.dao;

import java.io.Serializable;
import java.util.List;
import com.admin.entity.SurveyQuestionsEntity;

public class SurveyDto implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5313772308908310468L;

	private long surveyId;
	
	private String surveyName;
	
	private String accountType;
	
	private String surveyDescription;
	
	private List<SurveyQuestionsEntity> surveyQuestionsEntity;
		
	public long getSurveyId() {
		return surveyId;
	}
	public void setSurveyId(long surveyId) {
		this.surveyId = surveyId;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	
	public List<SurveyQuestionsEntity> getSurveyQuestion() {
		return surveyQuestionsEntity;
	}
	
	public void setSurveyQuestion(List<SurveyQuestionsEntity> surveyQuestionsEntity) {
		this.surveyQuestionsEntity = surveyQuestionsEntity;
	}
	public String getSurveyDescription() {
		return surveyDescription;
	}
	public void setSurveyDescription(String surveyDescription) {
		this.surveyDescription = surveyDescription;
	}
	public String getSurveyName() {
		return surveyName;
	}
	public void setSurveyName(String surveyName) {
		this.surveyName = surveyName;
	}

	
}
