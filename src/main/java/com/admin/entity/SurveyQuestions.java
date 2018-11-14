package com.admin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="SurveyQuestions")
public class SurveyQuestions {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long questionId;
	
	@ManyToOne
	@JoinColumn(name="surveyId")
	private Survey Survey;
	
	
	public Survey getSurvey() {
		return Survey;
	}

	public void setSurvey(Survey survey) {
		Survey = survey;
	}
	
	
	private String questionTitle;
	
	
	public long getQuestionId() {
		return questionId;
	}
	
	public void setQuestionId(long questionId) {
		this.questionId = questionId;
	}
	public String getQuestionTitle() {
		return questionTitle;
	}
	public void setQuestionTitle(String questionTitle) {
		this.questionTitle = questionTitle;
	}
	
	
	
	

}
