package com.admin.service;

import com.admin.entity.SurveyQuestionsEntity;
import com.admin.model.MultipleOptions;
import com.admin.model.SurveyQuestions;

public interface QuestionsService {

	void saveQuestions(SurveyQuestions surveyQuestions);
	void saveOptions(MultipleOptions multipleOptions);
	
	SurveyQuestionsEntity findQuestionsByQuestionId(long surveyQuestionId);
}
