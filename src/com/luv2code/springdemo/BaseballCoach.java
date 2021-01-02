package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	
	@Override
	public String getDailyWorkout() {
		return "spend 30mins on batting practice";
	}
	
	

	@Override
	public String getDailyFortune() {
		// use fortuneService to give fortune
		return fortuneService.getFortune();
	}
}
