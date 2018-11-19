package com.admin.controller;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.admin.entity.SurveyEntity;
import com.admin.model.MultipleOptions;
import com.admin.model.SurveyQuestions;
import com.admin.model.Surveys;
import com.admin.service.QuestionsService;
import com.admin.service.SurveyService;

@Controller
public class SurveyController {

	@Autowired
	SurveyService surveyService;

	@Autowired
	QuestionsService questionsService;

	List<MultipleOptions> multipleOptions_ = new ArrayList<>();
	long surveyId_;

	@GetMapping("/survey/add")
	public String getAddSurvey(Model model) {
		Surveys surveys = new Surveys();
		model.addAttribute("survey", surveys);
		return "addSurvey";
	}

	@PostMapping("/survey/add")
	public String getSurveyModel(@ModelAttribute("survey") Surveys surveyDetails) {
		// System.out.println(">>>>"+surveyDetails.toString());
		surveyDetails.setSurveyId(System.currentTimeMillis());
		surveyService.saveSurvey(surveyDetails);

		SurveyEntity surveyEntity = surveyService.saveSurveyGetEntity(surveyDetails);

		Long surveyId = surveyEntity.getSurveyId();
		return "redirect:/questions/add/" + surveyId;
	}


	@GetMapping("/questions/add/{surveyId}")
	public String getQuestionModel(@PathVariable Long surveyId,
			@ModelAttribute("question") SurveyQuestions questionDetails, MultipleOptions multipleOptions, Model model) {
		surveyId_ = surveyId;
		questionDetails.setSurveyId(surveyId);
		model.addAttribute("questionDetails", questionDetails);
		return "addQuestions";
		// return new ModelAndView("addQuestions", "questionDetails", questionDetails);

	}

	@PostMapping(path = "/questions/add")
	public String postQuestionsModel(@ModelAttribute("questionDetails") SurveyQuestions questionDetails,
			MultipleOptions multipleOptions, Model model) {

		System.out.println("multipleOptions.getOptionTitle()>>>" + multipleOptions.getOptionTitle());

		JSONArray jArray = new JSONArray();
		String[] choices = multipleOptions.getOptionTitle().split(",");
		int rightAnswer = questionDetails.getAnswer();
		rightAnswer = rightAnswer - 1;

		System.out.println("answers: " + questionDetails.getAnswer());

		int pos = 0;

		for (String obj : choices) {
			try {
				if (pos == rightAnswer) {
					JSONObject jObj = new JSONObject();
					jObj.put("choice", obj);
					jObj.put("answer", true);
					jArray.put(jObj);
				} else {
					JSONObject jObj = new JSONObject();
					jObj.put("choice", obj);
					jObj.put("answer", false);
					jArray.put(jObj);
				}
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			pos++;
		}

		multipleOptions.setOptionTitle(jArray.toString());
		// multipleOptions_.add(new MultipleOptions(multipleOptions.getOptionTitle()));
		multipleOptions_.add(new MultipleOptions(jArray.toString()));

		questionDetails.setMultipleOptions(multipleOptions_);

		questionDetails.setSurveyId(surveyId_);

		long questionId = System.currentTimeMillis();
		questionDetails.setQuestionId(questionId);

		questionsService.saveQuestions(questionDetails);

		multipleOptions.setQuestionsId(questionId);
		questionsService.saveOptions(multipleOptions);

		return "redirect:/questions/add/" + surveyId_;
	}

}
