package testRunner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features="E://Automation//SecureWatchBDDFramework//Features/",
		glue="stepDefinitions",
		dryRun=false,
		publish=true,
		plugin= {"pretty","html:target/Cucumber-Reports.html"},
		monochrome=true,
		tags= "@regression and not @sanity"
		
		)


public class Test_Runner {
	
	

}
