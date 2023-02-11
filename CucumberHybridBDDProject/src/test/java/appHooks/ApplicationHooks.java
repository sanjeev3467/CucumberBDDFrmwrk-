package appHooks;

import java.util.Properties;

import org.junit.Assume;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;
import com.qa.util.configReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	
	private configReader configread;
	private Properties prop;
	private WebDriver driver;
	private DriverFactory driverfact;
	
	@Before(value="@skip",order=0)
	public void skipScenarios(Scenario scenario) {

		System.out.println("Skipped Scenario:::"+scenario.getName());
		Assume.assumeTrue(false);
	}
	
	@Before(order=1)
	public void getPropery() {
		
		configread=new configReader();
		prop=configread.init_property();
		
	}
	
	@Before(order=2)
	public void LaunchBrowser() {
		
		String browserName=prop.getProperty("browser");
		driverfact=new DriverFactory();
		driver=driverfact.init_driver(browserName);
		
	}

	@After(order=0)
	public void QuitBrowser() {
		
		driver.quit();
		
	}
	
	@After(order=1)
	public void TearDown(Scenario scenario) {
		
		if(scenario.isFailed()){
			
			String ScreenshotName=scenario.getName().replaceAll("", "_");
			byte[] sourcepath=((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcepath,"image/png", ScreenshotName);
			
		}
		
	}
}
