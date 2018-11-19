package com.admin.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name="SurveyOptionsEntity")
public class SurveyOptionsEntity {

	@ManyToOne(cascade= {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name="survey_question_id")
	@JsonBackReference
	private SurveyQuestionsEntity surveyQuestionsEntity;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(length = 2000)
	private String optionTitle;
	
	public SurveyQuestionsEntity getSurveyQuestionsEntity() {
		return surveyQuestionsEntity;
	}

	public void setSurveyQuestionsEntity(SurveyQuestionsEntity surveyQuestionsEntity) {
		this.surveyQuestionsEntity = surveyQuestionsEntity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOptionTitle() {
		return optionTitle;
	}

	public void setOptionTitle(String optionTitle) {
		this.optionTitle = optionTitle;
	}
	
	
	
}
