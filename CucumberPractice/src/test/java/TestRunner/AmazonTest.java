package TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(
		
		features="E://Automation//CucumberPractice//src//test//resources//appFeatures/",
		glue="stepDefinitions",
		plugin= {"pretty"}
)

public class AmazonTest {

}
