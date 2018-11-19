package com.admin.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;


@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
@Entity(name="SurveyQuestionsEntity")
public class SurveyQuestionsEntity {
	
	@Id
	private long questionId;

	@ManyToOne(cascade = CascadeType.ALL )
	@JoinColumn(name="survey_id", nullable=false)
	@JsonBackReference
	private SurveyEntity surveyEntity;
	
	@OneToMany(mappedBy="surveyQuestionsEntity", cascade=CascadeType.ALL)
	@JsonManagedReference
    private List<SurveyOptionsEntity> surveyOptionsEntity;
	
	@Column(length = 2000)
	private String questionTitle;

	public SurveyEntity getSurveyEntity() {
		return surveyEntity;
	}

	public void setSurveyEntity(SurveyEntity surveyEntity) {
		this.surveyEntity = surveyEntity;
	}

	public List<SurveyOptionsEntity> getSurveyOptions() {
		return surveyOptionsEntity;
	}

	public void setSurveyOptions(List<SurveyOptionsEntity> surveyOptionsEntity) {
		this.surveyOptionsEntity = surveyOptionsEntity;
	}

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
