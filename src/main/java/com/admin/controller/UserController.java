package com.admin.controller;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.admin.model.Users;

@Controller
public class UserController {

	String REST_SERVICE_URI = "http://localhost:8080";

	@GetMapping("/profile")
	public String getProfile() {
		return "profile";
	}
	
	@GetMapping("/users")
	public String getUserData(Model model) {
		try {
			RestTemplate restTemplate = new RestTemplate();
			List<LinkedHashMap<String, Object>> usersMap = restTemplate.getForObject(REST_SERVICE_URI + "/users/",
					List.class);

			if (usersMap != null) {
				List<Users> userList = new ArrayList<>();
				int i = 1;
				for (LinkedHashMap<String, Object> map : usersMap) {
					System.out.println("User : id=" + map.get("userId") + ", Name=" + map.get("firstName") + ", Age="
							+ map.get("lastName") + ", Salary=" + map.get("email"));
					;
					Users user = new Users(Integer.toString(i), (String) map.get("email"),
							(String) map.get("firstName"), (String) map.get("lastName"),
							(String) map.get("accountType"), Integer.parseInt(map.get("score").toString()));
					userList.add(user);
					i++;
				}

				model.addAttribute("userData", userList);
				return "userSearch";

			} else {
				System.out.println("No user exist");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return "userSearch";
	}
}
