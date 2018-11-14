package com.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/survey")
public class Survey {
	
	@GetMapping("/add")
	public String addSurvey(Model model) {
		Survey survey = new Survey();
		model.addAttribute(survey);
		return "addSurvey";
	}

}
