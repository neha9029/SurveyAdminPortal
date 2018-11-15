package com.admin.model;


public class Users {
	
	private Object userId;
	private String email;
	private String firstName;
	private String lastName;
	private String accountType;
	private int score;

	
	
	



	public Object getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getAccountType() {
		return accountType;
	}



	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}



	public int getScore() {
		return score;
	}



	public void setScore(int score) {
		this.score = score;
	}






	public Users(Object userId, String email, String firstName, String lastName, String accountType, int score) {
		this.userId = userId;
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.accountType = accountType;
		this.score = score;
	}



	@Override
	public String toString() {
		return "Users [userId=" + userId + ", email=" + email + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", accountType=" + accountType + ", score=" + score + "]";
	}
	
	

}
