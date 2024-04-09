package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)

@CucumberOptions (
		features="classpath:features",
		glue="classpath:stepDefinitions",
		tags="@CreateNewLead",
		plugin= {"pretty","html:/target/cucumber-reports/cucumber-pretty.html"},
		monochrome=true,
		publish=true
		)

public class TestRunner {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
