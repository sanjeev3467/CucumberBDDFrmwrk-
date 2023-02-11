package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		
		System.setProperty("webdriver.edge.driver","E:\\AutomationSoft\\edgedriver_win64\\msedgedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com");
	}
	
	@Test(priority=1,groups="login")
	public void googleTitle() {
		String title=driver.getTitle();
		System.out.println("Google title is :::"+title);
	}
	
	@Test(priority=2,groups="google")
	public void googleImageDisplay() {
		
		boolean b=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
	}
	
	@Test(priority=3,groups="google")
	public void mailLink() {
		
		boolean b1=driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@Test(priority=4,groups="Tes")
	public void test1() {
		System.out.println("Testing1");
	}
	
	@Test(priority=5,groups="Tes")
	public void test2() {
		System.out.println("Testing2");
	}
	
	@Test(priority=6,groups="Tes")
	public void test3() {
		System.out.println("Testing3");
	}
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
