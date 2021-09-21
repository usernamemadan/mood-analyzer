package com.moodAnalyzer.MoodAnalyzer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MoodAnalyzerTest {
	
	@Test
	public void testSadMood() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in sad mood");
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals(mood, "SAD");
	}
	
	@Test
	public void testHappyMood() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in happy mood");
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals(mood, "HAPPY");
	}
	
	@Test
	public void testNullMood() throws MoodAnalysisException {
		MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
		String mood = moodAnalyzer.analyzeMood();
		Assert.assertEquals(mood, "HAPPY");
	}
}
