package Testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	
	
	@RunWith(Cucumber.class)
	
	@CucumberOptions(features="src/test/resources/feature/CovidTest.feature",tags="@Testcase1", glue= {"com.API.Automation.Stepdefinition" })
	
	
	
	
	public class TestRunner {
	
	
	

}
