package com.admin.dao;

import org.springframework.data.repository.CrudRepository;

import com.admin.entity.SurveyQuestionsEntity;

public interface QuestionsDao extends CrudRepository<SurveyQuestionsEntity, Long>{
	
	SurveyQuestionsEntity findQuestionsByQuestionId(long surveyQuestionId);

}
