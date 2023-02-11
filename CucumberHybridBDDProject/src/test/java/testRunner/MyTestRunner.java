package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features="E:\\Automation\\CucumberHybridBDDProject\\src\\test\\resources\\com\\features",
		glue={"stepDefinitions","appHooks"},
		plugin= {"pretty","json:target/MyReports/Report.json",
				          "html:target/MyReports/Report.html",
				          "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		monochrome=false,
		dryRun=false,
		publish=true
)
public class MyTestRunner {

}
