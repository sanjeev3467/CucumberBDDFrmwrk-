package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Basics {
	
	//Pre-Condition annotations- starting with @Before
	@BeforeSuite
	public void setup() {
	
		System.out.println("@BeforeSuite--system property setup for chrome");
	}
	@BeforeTest
	public void launchBrowser() {
		System.out.println("@BeforeTest--Launching the browser");
	}
	
	@BeforeClass
	public void login() {
		
		System.out.println("@BeforeClass--Do Login");
	}

	@BeforeMethod
	public void enterUrl() {
		
		System.out.println("@BeforeMethod--Url redirection");
	}
	
	//Test Cases-- Starting with @Test
	
	@Test
	public void googleTitle() {
		
		System.out.println("@Test--1--Google title confirmation");
	}
	
	@Test
	public void searchText() {
		System.out.println("@Test-2--Google search text");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("@Test-3--Google logo Test");
	}
	
	//Post Conditions annotations - Starting with @After
	
	@AfterMethod
	public void logout() {
		
		System.out.println("@AfterMethod--Logout app");
	}
	
	@AfterClass
	public void deleteAllCookies() {
		System.out.println("@AfterClass--Delete all cookies");
	}
	
	@AfterTest
	public void closeBrowser() {
		System.out.println("@AfterTest--Browser close");
	}
	
	@AfterSuite
	public void generateTestReport() {
		System.out.println("@AfterSuite--Generate Test Report");
	}
	
	//Sequence follow like these when had multiple @Test
	//@Before Method
	//@Test--1
	//@After Method
	
	//@Before Method
	//@Test--2
	//@After Method
		
	//@Before Method
	//@Test--3
	//@After Method
	
	
 /*@BeforeSuite--system property setup for chrome
   @BeforeTest--Launching the browser
   @BeforeClass--Do Login
   @BeforeMethod--Url redirection
   @Test-3--Google logo Test
   @AfterMethod--Logout app
   @BeforeMethod--Url redirection
   @Test--1--Google title confirmation
   @AfterMethod--Logout app
   @BeforeMethod--Url redirection
   @Test-2--Google search text
   @AfterMethod--Logout app
   @AfterClass--Delete all cookies
   @AfterTest--Browser close */
	 
		
}
