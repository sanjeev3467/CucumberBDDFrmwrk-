package testRunner;


import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features="E:\\Automation\\CucumberHybridBDDProject\\src\\test\\resources\\com\\features",
		glue={"stepDefinitions","appHooks"},
		plugin= {"pretty","json:target/MyReports/Report.json",
				          "html:target/MyReports/Report.html",
				          "rerun:target/failedrerun.txt",
				          "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome=false,
		dryRun=false,
		publish=true
		//tags="not @skip"
)
public class TestRunnerTestNG extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider
	public Object[][] scenarios(){
		
		return super.scenarios();
	}
	
}
