package testRunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		glue={"stepDefinitions","appHooks"},
		plugin= {"pretty","json:target/MyReports/Report.json",
				          "html:target/MyReports/Report.html",
				          "rerun:target/failedrerun.txt",
				          "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome=false,
		dryRun=false,
		publish=true,
		features="@target/failedrerun.txt"
)
public class FailedTestsRerun extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider
	public Object[][] scenarios(){
		
		return super.scenarios();
	}
	
}
