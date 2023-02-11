package urlsCheck;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class URLCheck {

	//public static String URL="https://testing4.riskwatch.com/platform";
	
	public static String browName="chrome";
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException, InterruptedException {
		
		String path="E://Automation//URLTesting//URLS.xlsx";
		
		File file =new File(path);
		
		System.out.println("path value is ..."+file);
		
		FileInputStream inputStream = new FileInputStream(file);
		
		System.out.println("stream value is ..."+inputStream);
		
		XSSFWorkbook w1=new XSSFWorkbook(inputStream);
		//System.out.println("book value is ..."+w1);
		
		XSSFSheet sh=w1.getSheetAt(0);
			
	//	System.out.println("sheet value is ..."+sh);
				
		for(int i=872; i<=1557; i++) {
			
		XSSFRow row=sh.getRow(i);
		
		System.out.println("row value is ..."+row);
		
		for(int j=0; j<1;j++) {
			
		XSSFCell s1=row.getCell(j);
		XSSFCell s2=row.getCell(j+1);
		
		System.out.println("s1 value is ..."+s1);
	
		String str2 = s1.getStringCellValue().trim();
		
		
		System.out.println("str2 is...."+str2);
		
				
		if(browName.equalsIgnoreCase("firefox")) {

            
	         System.setProperty("webdriver.gecko.driver","E:\\AutomationSoft\\geckodriver.exe");
		
	         driver=new FirefoxDriver();
	
	       	
		} else if(browName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","E:\\AutomationSoft\\chromedriver.exe");
			
			driver=new ChromeDriver();
			
							
		}else if(browName.equalsIgnoreCase("EDGE")) {
			
			System.setProperty("webdriver.edge.driver","E:\\AutomationSoft\\msedgedriver.exe");
			
			driver=new EdgeDriver();
			
								
		}else if(browName.equalsIgnoreCase("IE")) {
			
			System.setProperty("webdriver.ie.driver","E:\\AutomationSoft\\IEDriverServer.exe");
			
			driver=new InternetExplorerDriver();
			
									
		} else {
			
			
			System.out.println("Browser not matched");
		}
			
		String str3="https://";
		String str4=str3.concat(str2);

		System.out.println("Str4 is.. "+str4);
		
		Thread.sleep(3000);
		driver.get(str4);
		System.out.println("URL Launching in "+browName+" browser");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
				
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
		Thread.sleep(10000);
				
//		WebElement uName=driver.findElement(By.id("user-name"));
	//	WebElement pwd=driver.findElement(By.id("user-password"));
		try {
			
	   if(driver.findElement(By.name("userName")).isEnabled() && driver.findElement(By.name("password")).isEnabled())
		  
		  
		{
		
	        System.out.println("Login Page Opened Successfully  "+str4);
			
			String P1="Pass";
			System.out.println(" Test..."+P1);
			//s2.setCellValue(str2);
			s2.setCellValue(P1);
											
		} } catch(NoSuchElementException noe) {
			
			noe.toString();
									
			String F1="Fail";
			System.out.println(" Test..."+F1);
			System.out.println("Login Page Not Opened  "+str4);
			//s2.setCellValue(str2);
			s2.setCellValue(F1);
			
					
		} 
		
		FileOutputStream fos =new FileOutputStream(new File(path));
		w1.write(fos);
        fos.close();
		
		
		} 
		
		Thread.sleep(10000);
		
		driver.quit();
		
		}
		
		
				
		
		
	}

	
}
