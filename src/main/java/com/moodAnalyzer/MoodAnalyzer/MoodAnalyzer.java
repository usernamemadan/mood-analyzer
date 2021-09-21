package com.moodAnalyzer.MoodAnalyzer;

public class MoodAnalyzer {
	String msg;

	public MoodAnalyzer() {
		msg = null;
	}

	public MoodAnalyzer(String msg) {
		this.msg = msg;
	}

	public String analyzeMood() throws MoodAnalysisException {
		try {
			if (msg == null) {
				throw new MoodAnalysisException("df");
			} else if (msg.equals("I am in sad mood")) {
				return "SAD";
			} else if (msg.equals("I am in happy mood")) {
				return "HAPPY";
			}
		} catch (MoodAnalysisException e) {
			return "HAPPY";
		}

		return "";
	}
}
