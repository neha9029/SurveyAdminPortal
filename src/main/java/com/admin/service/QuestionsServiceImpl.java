package com.admin.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.OptionsDao;
import com.admin.dao.QuestionsDao;
import com.admin.entity.SurveyEntity;
import com.admin.entity.SurveyOptionsEntity;
import com.admin.entity.SurveyQuestionsEntity;
import com.admin.model.MultipleOptions;
import com.admin.model.SurveyQuestions;

@Service
public class QuestionsServiceImpl implements QuestionsService{

	@Autowired
	QuestionsDao questionsDao;
	
	@Autowired
	OptionsDao optionsDao;
	
	@Autowired
	SurveyService surveyService;
	
	@Autowired
	QuestionsService questionsService;
	
	@Override
	public void saveQuestions(SurveyQuestions surveyQuestions) {
		// TODO Auto-generated method stub
		SurveyQuestionsEntity surveyQuestionsEntity = new SurveyQuestionsEntity();
		
		SurveyEntity surveyEntity = surveyService.findSurveyBySurveyId(surveyQuestions.getSurveyId());
		surveyQuestionsEntity.setSurveyEntity(surveyEntity);
		BeanUtils.copyProperties(surveyQuestions, surveyQuestionsEntity);	
		
		questionsDao.save(surveyQuestionsEntity);
	}


	@Override
	public void saveOptions(MultipleOptions multipleOptions) {
		// TODO Auto-generated method stub
		SurveyOptionsEntity surveyOptionsEntity = new SurveyOptionsEntity();
		
		SurveyQuestionsEntity surv = questionsService.findQuestionsByQuestionId(multipleOptions.getQuestionsId());
		
		surveyOptionsEntity.setSurveyQuestionsEntity(surv);
		BeanUtils.copyProperties(multipleOptions, surveyOptionsEntity);	
		
		optionsDao.save(surveyOptionsEntity);
	}


	@Override
	public SurveyQuestionsEntity findQuestionsByQuestionId(long surveyQuestionId) {
		// TODO Auto-generated method stub
		return questionsDao.findQuestionsByQuestionId(surveyQuestionId);
	}
	
	

}
