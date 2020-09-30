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

public class HrmsLoginValidation extends CommonMethods {
//	public static WebDriver driver;
	
	public static  String Actualtext;
	
	@Given("user enters hrms application")
	public void user_enters_hrms_application() {
	
		
		
		driver.get(ConfigsReader.getProperty("url"));

		
//System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.get("http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
		driver.findElement(By.id("txtUsername")).sendKeys("admin");

		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		
		
	   
	}

	@When("user get text of user as prove")
	public void user_get_text_of_user_as_prove() {
		
	WebElement welcomeText=	driver.findElement(By.id("welcome"));
		
	 Actualtext= welcomeText.getText();
	    
	}

	@Then("user validates texts {string}")
	public void user_validates_texts(String expectedText) {
	   
		
		Assert.assertEquals(expectedText, Actualtext);
		System.out.println(Actualtext);
		
	}



}
