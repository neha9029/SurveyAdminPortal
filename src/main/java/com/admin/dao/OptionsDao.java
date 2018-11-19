package com.admin.dao;

import org.springframework.data.repository.CrudRepository;

import com.admin.entity.SurveyOptionsEntity;
import com.admin.model.MultipleOptions;

public interface OptionsDao extends CrudRepository<SurveyOptionsEntity, Long>{

	//void save(SurveyOptionsEntity surveyOptionsEntity);
	

}
