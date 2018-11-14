package com.admin.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="SurveyAnswers")
public class SurveyAnswers {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int answerId;

	
	
}
