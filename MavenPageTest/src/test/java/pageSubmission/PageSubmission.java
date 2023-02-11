package pageSubmission;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PageSubmission {
	
public WebDriver driver;
	
	public static ThreadLocal<WebDriver> tlDriver= new ThreadLocal<>();
	
	/**
	 * This is used to get the driver with Thread Local on the basis of given browser
	 * @param browser
	 * @return
	 */
	
	public static String browser="chrome";
	
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
	 */
	public static synchronized WebDriver getDriver(){
		
		return tlDriver.get();
				
	}

	
	
	public static void main(String []args){
		
		PageSubmission s1=new PageSubmission();
		
		s1.init_driver(browser);
		s1.getDriver().get("https://bestbuycanada-fsm-tst.ifs.cloud/WebClient/auth/login?auth=fsm&logintype=default");
		s1.getDriver().findElement(By.id("Personid")).sendKeys("test");
		s1.getDriver().findElement(By.id("Password")).sendKeys("Test@123");
		s1.getDriver().findElement(By.name("Login")).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String ExpecteddashboardTitle="Test";
		
		SoftAssert assertion=new SoftAssert();
		
		//Dashboard title match
		
		assertion.assertEquals(ExpecteddashboardTitle,s1.getDriver().getTitle());
		
		
		s1.getDriver().findElement(By.xpath("Searchbox")).sendKeys("Test@123");
		
		s1.getDriver().findElement(By.linkText("Receiving")).click();
		
		s1.getDriver().findElement(By.name("Newbutton")).click();
		
		//window handle
		
		String MainWindow=s1.getDriver().getWindowHandle();		
		
        // To handle all new opened window.				
            Set<String> s2=s1.getDriver().getWindowHandles();		
        java.util.Iterator<String> i1=s2.iterator();		
        		
        while(i1.hasNext())			
        {		
            String ChildWindow=i1.next();		
            		
            if(!MainWindow.equalsIgnoreCase(ChildWindow))			
            {    		
                 
                    // Switching to Child window
            	s1.getDriver().switchTo().window(ChildWindow);	                                                                                                           
            	s1.getDriver().findElement(By.id("RMA ID")).sendKeys("RMAID"); 
            	s1.getDriver().findElement(By.name("searchicon")).click(); 
                
                s1.getDriver().findElement(By.id("ShipmentID")).sendKeys("SHIPMENTID"); 
              	s1.getDriver().findElement(By.name("searchicon")).click(); 

                s1.getDriver().findElement(By.id("ReceivePlace")).sendKeys("ReceivingPlace"); 
              	s1.getDriver().findElement(By.name("searchicon")).click(); 

                s1.getDriver().findElement(By.id("POID")).sendKeys("POID"); 
              	s1.getDriver().findElement(By.name("searchicon")).click(); 
                s1.getDriver().findElement(By.name("POID")).click();
                System.out.println("Form saved successfully");
            	
                
		
		//close child window
            	s1.getDriver().close();
            }
		
		
	}
	}
	
}
