package com.hrms.runners;

	
	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;


	@RunWith(Cucumber.class)
	@CucumberOptions (
			features = "src\\test\\resources\\features", 
			glue="com\\hrms\\API\\steps\\practice", 
			
			
			dryRun=false, //if set to true it will quickly scan that all gherkin steps have implementation code
						// if set to true no actual execution will happen
			monochrome = true
			,strict=true
		,tags= "@Mypractice"
			, plugin= { "pretty",
					"html:target\\cucumber-default-report",
					"json:target\\cucumber.json"	
		
}
)
	public class APIWorkflowRunner {

		
	}