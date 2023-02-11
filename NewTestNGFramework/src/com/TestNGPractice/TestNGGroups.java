package com.TestNGPractice;

import org.testng.annotations.Test;

public class TestNGGroups {
			
	@Test(priority=1,groups="login")
	public void googleTitle() {
	
		System.out.println("Google title match");
	}
	
	@Test(priority=2,groups="google")
	public void googleImageDisplay() {
		
		System.out.println("Google image display");
	}
	
	@Test(priority=3,groups="google")
	public void mailLink() {

      System.out.println("Gmail link display");
	}

}
