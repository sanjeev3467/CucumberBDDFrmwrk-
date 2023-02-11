package com.TestNGPractice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestsRetry {
	
	@Test
	public void googleTitle() {
	
		System.out.println("Google title match");
		Assert.assertEquals(true, false);
	}
	//(retryAnalyzer=com.analyser.RetryAnalyzer.class)
	@Test
	public void googleImageDisplay() {
		
		System.out.println("Google image display");
		Assert.assertEquals(true, false);
	}
	
	@Test
	public void mailLink() {

      System.out.println("Gmail link display");
      Assert.assertEquals(true, false);
	}

}
