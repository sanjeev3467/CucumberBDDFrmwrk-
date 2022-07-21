package utilities;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitOperation {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	public waitOperation(WebDriver sdriver) {
		
		driver=sdriver;
		
		PageFactory.initElements(sdriver,this);
						
	}
	
      public void waithelper(By elemnt, long timeOutinSeconds) {
		
		wait=new WebDriverWait(driver,timeOutinSeconds);
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(elemnt));
		
	}


}
