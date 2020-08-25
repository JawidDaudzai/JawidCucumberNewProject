package com.hrms.runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (
		features = "src\\test\\resources\\features", 
		glue="com\\hrms\\steps", 
		//dryRun=true, 
		monochrome = true,
		strict=true
	,tags= "@Jawid"
	
		, plugin= { "pretty",
				"html:target\\cucumber-default-report",
				"json:target\\cucumber.json"
				//,
				//"retun:target\\failed.txt"
				
		}
		)
		
		
	public class SmokeRunner{
		
	}	
	


