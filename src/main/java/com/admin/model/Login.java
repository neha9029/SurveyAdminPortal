package com.admin.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

public class Login {

	
	@NotEmpty(message="Please enter your Email Id")
	@Email(message="Enter valid email")
	private String email;
	
	@NotEmpty(message="Please enter password")
	private String password;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
