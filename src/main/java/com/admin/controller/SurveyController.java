package com.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.admin.entity.Survey;

@Controller
public class SurveyController {
	
	@GetMapping("/survey/add")
	public String getAddSurvey(Model model) {
		Survey survey = new Survey();
		model.addAttribute("survey",survey);
		return "addSurvey";
	}

}
