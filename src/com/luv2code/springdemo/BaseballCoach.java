package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	@Override
	public String getDailyWorkout() {
		return "spend 30mins on batting practice";
	}
}
