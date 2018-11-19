package com.admin.service;

import java.util.List;

import com.admin.dao.SurveyDto;
import com.admin.entity.SurveyEntity;
import com.admin.entity.SurveyOptionsEntity;
import com.admin.entity.SurveyQuestionsEntity;
import com.admin.model.Surveys;

public interface SurveyService {
    void saveSurvey(Surveys surveys);
    SurveyEntity findSurveyBySurveyId(long surveyId);
    SurveyEntity saveSurveyGetEntity(Surveys surveys);
    List<SurveyDto> getSurvey();
	Iterable<SurveyEntity> findAll();
	Iterable<SurveyQuestionsEntity> findAllQuestions();
	Iterable<SurveyOptionsEntity> findAllOptions();

}
