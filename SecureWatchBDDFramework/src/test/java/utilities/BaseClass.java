package utilities;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

public class BaseClass {
	
	public WebDriver driver;
	public Alert alert;
	
	public BaseClass(WebDriver sdriver) {
		
		driver=sdriver;
		
		PageFactory.initElements(sdriver,this);
	}
		
	public void alertoptions() {
		
		alert=driver.switchTo().alert();
		alert.accept();
		
	}
	
	public void actions(By element) {
		
		Actions action=new Actions(driver);
		
		action.moveToElement(driver.findElement(element)).click().build().perform();
		
	}
	
	
	public void windowHandle(By element) {
		
		 String MainWindow=driver.getWindowHandle();		
 		
	        // To handle all new opened window.				
	            Set<String> s1=driver.getWindowHandles();		
	        Iterator<String> i1=s1.iterator();		
	        		
	        while(i1.hasNext())			
	        {		
	            String ChildWindow=i1.next();		
	            		
	            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
	            {    		
	                 
	                    // Switching to Child window
	                    driver.switchTo().window(ChildWindow);	                                                                                                           
	                    driver.findElement(element).click();
	                    
				
	            }		
	        }		
	        
	        
	}

}
