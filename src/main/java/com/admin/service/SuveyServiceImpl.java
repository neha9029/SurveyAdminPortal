package com.admin.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.dao.OptionsDao;
import com.admin.dao.QuestionsDao;
import com.admin.dao.SurveyDao;
import com.admin.dao.SurveyDto;
import com.admin.entity.SurveyEntity;
import com.admin.entity.SurveyOptionsEntity;
import com.admin.entity.SurveyQuestionsEntity;
import com.admin.model.SurveyQuestions;
import com.admin.model.Surveys;

@Service
public class SuveyServiceImpl implements SurveyService{


	@Autowired
	SurveyDao surveyDao;
	
	@Autowired
	QuestionsDao questionsDao;
	

	@Autowired
	OptionsDao optionsDao;
	
	@Override
	public void saveSurvey(Surveys surveys) {
		// TODO Auto-generated method stub
		SurveyEntity surveyEntity = new SurveyEntity();
		BeanUtils.copyProperties(surveys, surveyEntity);

		surveyDao.save(surveyEntity);
	}

	@Override
	public SurveyEntity findSurveyBySurveyId(long surveyId) {
		// TODO Auto-generated method stub
		return surveyDao.findSurveyBySurveyId(surveyId);
	}

	
	@Override
	public SurveyEntity saveSurveyGetEntity(Surveys surveys) {
		// TODO Auto-generated method stub
		SurveyEntity surveyEntity = new SurveyEntity();
		BeanUtils.copyProperties(surveys, surveyEntity);

		return surveyEntity;
	}
	
	@Override
	public List<SurveyDto> getSurvey() {
		// TODO Auto-generated method stub
		
		List<SurveyDto> returnValue = new ArrayList<>();
		Iterable<SurveyEntity> surveyEntity= surveyDao.findAll();
		
		for(SurveyEntity surveyEntityDetails: surveyEntity) {
			SurveyDto surveyDto = new SurveyDto();
			BeanUtils.copyProperties(surveyEntityDetails, surveyDto);
			returnValue.add(surveyDto);
		}
		return returnValue;
	}

	@Override
	public Iterable<SurveyEntity> findAll() {
		// TODO Auto-generated method stub
		List<Surveys> returnValue = new ArrayList<>();

		Iterable<SurveyEntity> surveyEntity= surveyDao.findAll();


//		for(SurveyEntity surveyEntityDetails: surveyEntity) {
//			Surveys surveys = new Surveys();
//			BeanUtils.copyProperties(surveyEntityDetails, surveys);
//			returnValue.add(surveys);
//		}
//		
//		Iterable<SurveyQuestionsEntity> surveyQuestionsEntity= questionsDao.findAll();
//		for(SurveyQuestionsEntity surveyQuestionsEntityDetails: surveyQuestionsEntity) {
//			Surveys surveys = new Surveys();
//			BeanUtils.copyProperties(surveyQuestionsEntityDetails, surveys);
//			returnValue.add(surveys);
//		}
		
		
		return surveyEntity;
	}
	
	@Override
	public Iterable<SurveyOptionsEntity> findAllOptions() {
		// TODO Auto-generated method stub
		//List<SurveyQuestions> returnQuestions = new ArrayList<>();

		Iterable<SurveyOptionsEntity> surveyOptionsEntity= optionsDao.findAll();
		return surveyOptionsEntity;
	}

	@Override
	public Iterable<SurveyQuestionsEntity> findAllQuestions() {
		// TODO Auto-generated method stub
		//List<SurveyQuestions> returnQuestions = new ArrayList<>();

		Iterable<SurveyQuestionsEntity> surveyQuestionsEntity= questionsDao.findAll();
		return surveyQuestionsEntity;
	}
}
