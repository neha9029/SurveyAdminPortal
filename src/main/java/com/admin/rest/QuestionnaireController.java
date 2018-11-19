package com.admin.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.dao.SurveyDao;
import com.admin.dao.SurveyDto;
import com.admin.entity.SurveyEntity;
import com.admin.entity.SurveyOptionsEntity;
import com.admin.entity.SurveyQuestionsEntity;
import com.admin.model.Surveys;
import com.admin.service.SurveyService;


@RestController
public class QuestionnaireController {
	
	@Autowired
	private SurveyService surveyService;
	
	@Autowired
	private SurveyDao surveyDao;
	
	@GetMapping("/surveys")
		public List<Surveys> getSurvey() {
	    
		List<Surveys> survey = new ArrayList<>();
		
		List<SurveyDto> getSurvey =  surveyService.getSurvey();
		
		for(SurveyDto surveyDto: getSurvey) {
			Surveys surveyDetails = new Surveys();
			BeanUtils.copyProperties(surveyDto, surveyDetails);
			survey.add(surveyDetails);
		}
		  return survey;
	}
	
	@GetMapping("/surveys/questions")
	Iterable<SurveyEntity> read(){
		return surveyService.findAll();
	}
	
	
	@GetMapping("/options")
	Iterable<SurveyOptionsEntity> readOptions(){
		return surveyService.findAllOptions();
	}
	
	
	@GetMapping("/questions")
	Iterable<SurveyQuestionsEntity> readQuestions(){
		return surveyService.findAllQuestions();
	}
	
	

}
