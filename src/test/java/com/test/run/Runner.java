package com.test.run;

import org.testng.annotations.DataProvider;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = "./src/main/resources/Login.feature",
		glue = {"com.cucumber.bdd.login"},
		
		tags = "@Smoke or @Functional or @Regressional",
		monochrome = true,
		dryRun = true,
		plugin = {
			"pretty",
			"html:target/cucumber-report.html",
	        "json:target/cucumber.json",
			"junit:target/cucumber.xml"
		}
		)

public class Runner extends AbstractTestNGCucumberTests{
	
	@Override
	@DataProvider(parallel = true) // Optional: For parallel execution of scenarios
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
