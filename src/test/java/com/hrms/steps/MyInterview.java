package com.hrms.steps;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyInterview {
	
	
	

	@Test 
	public void practice() {
		
		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
		
		driver.manage().window().maximize();

}
}