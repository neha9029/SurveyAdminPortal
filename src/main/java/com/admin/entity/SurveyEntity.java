package com.admin.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity(name="SurveyEntity")
public class SurveyEntity {

		@Id
		private long surveyId;
		
		@Column(nullable=false)
		private String surveyName;
		
		@Column(nullable=false)
		private String accountType;
		
		private String surveyDescription;
		
		@OneToMany(mappedBy="surveyEntity", cascade=CascadeType.ALL)
		@JsonManagedReference
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

