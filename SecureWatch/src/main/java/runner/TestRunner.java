package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

    @RunWith(Cucumber.class)
	@CucumberOptions(features="features",glue={"stepDefinitions"},format={"pretty","html:test-output"})
	
	public class TestRunner {	
	
	
	
    }
