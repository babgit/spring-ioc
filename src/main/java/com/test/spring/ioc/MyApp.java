package com.test.spring.ioc;

public class MyApp {

	public static void main(String[] args) {

//		Coach coach = new BaseBallCoach();

		Coach coach = new TrackCoach(); // This object creation is hard coded.Need to avoid. 
		
		System.out.println(coach.getDailyWorkout());
	}

}
