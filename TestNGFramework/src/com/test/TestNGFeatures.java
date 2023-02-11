package com.test;

import org.testng.annotations.Test;

public class TestNGFeatures {
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
		int s=9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void homeTest() {
		System.out.println("Home Test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void searchTest() {
		System.out.println("Search Test");
	}
	
	@Test(dependsOnMethods="loginTest")
	public void registartionTest() {
		System.out.println("Registration Test");
	}

}
