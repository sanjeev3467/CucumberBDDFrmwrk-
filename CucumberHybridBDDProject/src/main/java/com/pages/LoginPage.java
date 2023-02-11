package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By username=By.name("userName");
	private By password=By.name("password");
	private By loginbutton=By.xpath("//button[@type='submit']");
	private By forgotlink=By.linkText("Forgot Password?");
	
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
	}
	
	public String getTitleOfPage() {
		
		return driver.getTitle();
	}
	
	public boolean forgotPwdlinkexist() {
		
		return driver.findElement(forgotlink).isDisplayed();
	}
	
	public void setUserName(String uName) {
		
		driver.findElement(username).sendKeys(uName);
		
	}
	
    public void setPassword(String pwd) {
		
    	driver.findElement(password).sendKeys(pwd);
		
	}
    
    public void clickLoginButton() {
    	
    	driver.findElement(loginbutton).click();
    }
    
   public void doLogin(String U1, String P1) {
	   
	   driver.findElement(username).sendKeys(U1);
	   driver.findElement(password).sendKeys(P1);
	   driver.findElement(loginbutton).click();
   }
	
}
