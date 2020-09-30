package com.hrms.steps;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.hrms.utilis.CommonMethods;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataTableExample extends CommonMethods{
	
	public static List<String> expectedList;
	public static List<String> actualList;
	
	
	@Given("user is on Hrms Login page")
	public void user_is_on_Hrms_login_page() {
		
		
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
		driver.findElement(By.id("btnLogin")).click();
		
		
		
		
		
		
		
	}
	
	@When("Dashboard has the following elements")
	public void dashboard_has_the_following_elements(DataTable dataTable) {
		
	expectedList=	dataTable.asList();
	
	
	
	List<WebElement> UIlist= driver.findElements(By.xpath("//div[@class='menu']/ul/li"));
	
	actualList= new ArrayList<>();
	
	
	
	for (WebElement list:UIlist) {
		String alllist=list.getText();
		
		actualList.add(alllist);
		
		
	}
		
		
	}

	@Then("UI containls all Dashboard elements")
	public void ui_containls_all_Dashboard_elements() {
	    Assert.assertEquals(expectedList, actualList);
	    
	    
	    System.out.println("Actual list from UI"+actualList);
	    System.out.println("Expected list in feature file"+expectedList);
	}

}
