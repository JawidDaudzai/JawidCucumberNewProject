package com.hrms.steps;

import com.hrms.testbase.BaseClass;
import com.hrms.utilis.CommonMethods;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
@Before
public void start(Scenario scenario) {
	System.out.println("Starting test "+scenario.getName());
	
	
	BaseClass.setUp();
}
	
	
	@After
	public void end(Scenario scenario) {
		System.out.println("Ending test "+scenario.getName());
		System.out.println(scenario.getStatus());
		
		byte[] pic;
		if (scenario.isFailed()) {
			pic=CommonMethods.takeScreenshot("failed\\"+scenario.getName());
		}else {
			pic=CommonMethods.takeScreenshot("passed\\"+scenario.getName());
		}
		scenario.attach(pic, "image\\png", scenario.getName());
		
		BaseClass.tearDown();
	}

}
