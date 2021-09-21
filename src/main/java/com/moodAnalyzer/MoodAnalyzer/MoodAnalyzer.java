package com.moodAnalyzer.MoodAnalyzer;


public class MoodAnalyzer {
	String msg;
	public MoodAnalyzer() {
		
	}
	
	public MoodAnalyzer(String msg) {
		this.msg = msg;
	}
	
	public String analyzeMood() {
		if(msg.equals("I am in sad mood")) {
			return "SAD";
		}
		else {
			return "HAPPY";
		}
	}
}
