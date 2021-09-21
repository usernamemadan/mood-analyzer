package com.moodAnalyzer.MoodAnalyzer;

public class MoodAnalyzer {
	
	public String analyzeMood(String msg) {
		if(msg.equals("I am in sad mood")) {
			return "SAD";
		}
		else {
			return "HAPPY";
		}
	}
}
