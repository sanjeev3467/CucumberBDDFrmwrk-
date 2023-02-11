package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features="E://Automation//CucumberPractice//src//test//resources//appFeatures//uber.feature",
		glue={"stepDefinitions","MyHooks"},
		tags="@Smoke or @Sanity or @Prod",
		plugin= {"pretty"}
)

public class UberTest {

}
