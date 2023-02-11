package com.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterTest {
	
	private WebDriver driver;
	
	@Test
	@Parameters({"url","userName","password"})
	public void secureWatchLogin(String url,String userName,String password) {
		
		System.setProperty("webdriver.edge.driver","E:\\AutomationSoft\\edgedriver_win64\\msedgedriver.exe");
        driver=new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(url);
        driver.findElement(By.name("userName")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("/html/body/app-root/app-login/div/div/div[2]/section/div[1]/div/div/div[2]/div/form/button")).click();
        	
	}

}
