package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTitleTest {

	private WebDriver driver;
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
	
	@Test
	public void googleTitle() {
		String title=driver.getTitle();
		System.out.println("Google title is :::"+title);
		Assert.assertEquals(title,"Google","Google Title is matched");
	}
	
	
	@Test
	public void googleImageDisplay() {
		
		boolean b=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/img")).isDisplayed();
		Assert.assertTrue(b);
	}
	
	/*
	@Test(priority=3,groups="google")
	public void mailLink() {
		
		boolean b1=driver.findElement(By.linkText("Gmail")).isDisplayed();
	} */
	
	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}

}
