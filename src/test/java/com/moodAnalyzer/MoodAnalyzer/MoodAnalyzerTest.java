package com.moodAnalyzer.MoodAnalyzer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MoodAnalyzerTest {
	MoodAnalyzer moodAnalyzer;
	
	@Before
	public void init() {
		moodAnalyzer = new MoodAnalyzer();
	}
	@Test
	public void isSadMood() {
		String mood = moodAnalyzer.analyzeMood("I am in sad mood");
		Assert.assertEquals(mood, "SAD");
	}
	
	@Test
	public void isHappyMood() {
		String mood = moodAnalyzer.analyzeMood("I am in any mood");
		Assert.assertEquals(mood, "HAPPY");
	}
}
