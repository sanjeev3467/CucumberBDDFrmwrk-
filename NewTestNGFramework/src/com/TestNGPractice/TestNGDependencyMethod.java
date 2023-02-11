package com.TestNGPractice;

import org.testng.annotations.Test;

public class TestNGDependencyMethod {
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homeTest() {
		System.out.println("Home Test");
	}

}
