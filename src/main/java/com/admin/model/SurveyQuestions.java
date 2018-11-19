package com.admin.model;

import java.util.List;

public class SurveyQuestions {
	
	private long surveyId;
	
	private int answer;
	
	public long getSurveyId() {
		return surveyId;
	}

	public void setSurveyId(long surveyId) {
		this.surveyId = surveyId;
	}

	private long questionId;
	private String questionTitle;
	
	public List<MultipleOptions> multipleOptions;
    
	public List<MultipleOptions> getMultipleOptions() {
		return multipleOptions;
	}

	public void setMultipleOptions(List<MultipleOptions> multipleOptions) {
		this.multipleOptions = multipleOptions;
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

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {
		this.answer = answer;
	}


	

	
	
	
	
	

}
