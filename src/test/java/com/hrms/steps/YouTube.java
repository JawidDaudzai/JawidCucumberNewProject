package com.hrms.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class YouTube {
	
	@Given("user opens YouTube page")
	public void user_opens_YouTube_page() {
		
		System.setProperty("webdriver.chrom.driver", "drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		
	    
	}

}
