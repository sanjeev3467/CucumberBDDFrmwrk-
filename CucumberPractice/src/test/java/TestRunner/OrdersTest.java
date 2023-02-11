package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features="E://Automation//CucumberPractice//src//test//resources//appFeatures//Order.feature",
		glue={"stepDefinitions","MyHooks"},
		plugin= {"pretty","json:target/MyReports/Report.json",
				          "html:target/MyReports/Report.html"},
		tags="@All",
		monochrome=false,
		dryRun=false
)

public class OrdersTest {

}
