package com.TestNGPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SecureWatchLogin {
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Launch browser");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("Login into app");
	}
	
	@Test(priority=1,enabled=true)
	public void DashboardTitle() {
		System.out.println("Dashboard Title");
	}
	
	@Test(priority=2)
	public void createRegion() {
		System.out.println("Region Creation");
	}
	
	@Test(priority=3)
	public void searchRegion() {
		System.out.println("Search Region");
	}
	
	@AfterMethod
	public void logoutApp() {
		System.out.println("Logout from App");
	}
	
	@AfterClass
	public void closeBrowser() {
		System.out.println("Close Browser");
	}

}
