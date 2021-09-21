package com.moodAnalyzer.MoodAnalyzer;

public class MoodAnalyzer {
	String msg;

	public MoodAnalyzer() {

	}

	public MoodAnalyzer(String msg) {
		this.msg = msg;
	}

	public String analyzeMood() {
		try {
			if (msg.equals("I am in sad mood")) {
				return "SAD";
			} else if (msg.equals("I am in happy mode")) {
				return "HAPPY";
			}
		} catch (Exception e) {
			return "HAPPY";
		}
		
		return "HAPPY";
	}
}
