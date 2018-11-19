package com.admin.dao;

import org.springframework.data.repository.CrudRepository;

import com.admin.entity.SurveyEntity;

public interface SurveyDao extends CrudRepository<SurveyEntity, Long >{
	SurveyEntity findSurveyBySurveyId(long surveyId);
	

}
