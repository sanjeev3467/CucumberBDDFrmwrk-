package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.waitOperation;

public class LoginPageObjects {

	public WebDriver driver;
				
	@FindBy(id="user-name")
	WebElement username;
	
	@FindBy(id="user-password")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginbtn;
	
	public LoginPageObjects(WebDriver sdriver) {
		
		driver=sdriver;
		
		PageFactory.initElements(sdriver,this);
	}
	
	public void Enter_UserName(String uname1) {
		
		username.clear();
		username.sendKeys(uname1);
	}
	
	public void Enter_Password(String password1) {
		
		password.clear();
		password.sendKeys(password1);
	}
	
	public void Click_on_Loginbutton() throws InterruptedException {
		
			
		loginbtn.click();
		
		Thread.sleep(3000);
		
		
	}
	
}
