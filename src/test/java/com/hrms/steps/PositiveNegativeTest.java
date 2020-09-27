package com.hrms.steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hrms.utilis.CommonMethods;
import com.hrms.utilis.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class PositiveNegativeTest extends CommonMethods{

	@Given("user log in to HRMS application")
	public void user_log_in_to_HRMS_application() {

driver.get(ConfigsReader.getProperty("url"));

		
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String usernameCorrect, String passwordCorrect) {

		driver.findElement(By.id("txtUsername")).sendKeys(usernameCorrect);

		driver.findElement(By.id("txtPassword")).sendKeys(passwordCorrect);
		driver.findElement(By.id("btnLogin")).click();
	}

	@Then("user validates {string} text is available")
	public void user_validates_text_is_available(String text) {
	  
		String expectedname= text;
		
		WebElement ActualName=driver.findElement(By.xpath("//a[text()='Welcome Admin']"));
		String Name=ActualName.getText();
		System.out.println(Name);
		Assert.assertEquals(expectedname, Name);
		
//		
//		boolean name=  ActualName.isDisplayed();
//		
//		Assert.assertTrue(name);
		
	}

	
	
	
}
