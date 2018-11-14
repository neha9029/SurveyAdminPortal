package com.admin.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.admin.model.Login;

@Controller
public class LoginController {

	
	@GetMapping("/")
	public String getLoginPage(Model model) {
		Login login = new Login();
		model.addAttribute("loginDetails", login);
		
		return "login";
	}

	
	@PostMapping("/login")
	public String postLogin(@Valid @ModelAttribute("loginDetails") Login adminLoginDetails, BindingResult bindingResult) {
	
		if(!adminLoginDetails.getEmail().equals("admin@gmail.com") && adminLoginDetails.getPassword().equals("admin")){
		    bindingResult.rejectValue("email", "error.loginDetails", "Invalid Details");

		}
	    if(bindingResult.hasErrors()) {
			return "login";
		}
		else {
			return "addSurvey";
		}
	
	}	
	
	@GetMapping("/users")
	public String getUsers() {
		return "userSearch";
	}

}
