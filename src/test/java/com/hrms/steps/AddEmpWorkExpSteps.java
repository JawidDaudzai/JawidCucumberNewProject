package com.hrms.steps;

import org.junit.Assert;

import com.hrms.testbase.BaseClass;
import com.hrms.utilis.CommonMethods;
import com.hrms.utilis.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddEmpWorkExpSteps extends CommonMethods {
	
	
	@Given("user is logged with valid admin credentials")
	public void user_is_logged_with_valid_admin_credentials() {
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.logInButton);
		
	}
	
	
	@When("user navigates to personal details page by using employee id {string}")
	public void user_navigates_to_personal_details_page_by_using_employee_id(String empId) {
		
		//navigate to employee list page
				jsClick(dashboard.PIM);
				jsClick(dashboard.empListPage);
				
				//enter user id in Employee List page
				sendText(viewEmp.empID, empId);
				
				//click on search button
				jsClick(viewEmp.searchBtn);
				wait(5);
				waitAndClick(dashboard.Idclick);
				

}
	
	
	@When("user can click on Qualifications")
	public void user_can_click_on_Qualifications() {
	click(viewQual.Qualifications);
	click(viewQual.AddBTN);
	
	
	   
	}
	
	
	@When("user can add {string} And {string}")
	public void user_can_add(String Company, String JobTitle) {
		sendText(viewQual.Campany, Company);
		sendText(viewQual.JobTitle, JobTitle);
	}

	@When("user can add date {string} And {string}")
	public void user_can_add_date(String ExpDateFrom, String ExpDateTo) {
		sendText(viewQual.ExpFrom, ExpDateFrom);
		sendText(viewQual.ExpTo, ExpDateTo);
	
	}
	@When("user can click on save button")
	public void user_can_click_on_save_button() {
		click(viewQual.SaveBtn);
	   
	}
	@Then("{string} is displayed")
	public void is_displayed(String Company) {
		
		
		
		String expectedCompName="Coding Tech Scrum Master 1990-Jan-05 2020-Jun-05";
		
		boolean verify=false;
		for(int x=1; x<dashboard.EmpWorkVerfication.size(); x++) {
			String companyName= dashboard.EmpWorkVerfication.get(x).getText();
			if (companyName.equalsIgnoreCase(expectedCompName)) {
				
				verify= true;
				break;
				
			}
			Assert.assertEquals("Company name is no displayed", expectedCompName, companyName);
			//Assert.assertTrue("Company name is no displayed", verify);
		}
		//Assert.assertEquals("Company name is not displayed", expectedCompName, viewQual.CompVerfication.getText());
	}
	  
	

}
