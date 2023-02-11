package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	
	public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver= new ThreadLocal<>();
	
	/**
	 * This is used to get the driver with Thread Local on the basis of given browser
	 * @param browser
	 * @return
	 */
	public WebDriver init_driver(String browser) {
		
		System.out.println("Browser value is: "+browser);
		
		if(browser.contentEquals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			tlDriver.set(new ChromeDriver());
			
		}else if(browser.contentEquals("firefox")) {
			
			WebDriverManager.firefoxdriver().setup();
			tlDriver.set(new FirefoxDriver());
			
		}else if(browser.contentEquals("edge")) {
			
			WebDriverManager.edgedriver().setup();
			tlDriver.set(new EdgeDriver());
			
		} else {
			
			System.out.println("Please enter correct browser value: "+browser);
			
		}
		
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		
		return getDriver();
	}

	/**
	 * This is used to get the driver with Thread Local
	 * @return
	 * synchronized
	 */
	public static synchronized WebDriver getDriver(){
		
		return tlDriver.get();
				
	}
	
	
}
