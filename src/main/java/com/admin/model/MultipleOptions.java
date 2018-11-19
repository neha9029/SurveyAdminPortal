package com.admin.model;


public class MultipleOptions {

	
	private long questionsId;
	public long getQuestionsId() {
		return questionsId;
	}

	public void setQuestionsId(long questionsId) {
		this.questionsId = questionsId;
	}

	private String optionTitle;

	public String getOptionTitle() {
		return optionTitle;
	}

	public void setOptionTitle(String optionTitle) {
		this.optionTitle = optionTitle;

	}

	public MultipleOptions() {

	}

	public MultipleOptions(String optionTitle) {
		this.optionTitle = optionTitle;
	}

	@Override
	public String toString() {
		return "MultipleOptions [optionTitle=" + optionTitle + "]";
	}

}
