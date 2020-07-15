package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ViewEmployeePageElements {

	
	
	
	@FindBy(id = "addWorkExperience")
	public WebElement AddBTN;

		@FindBy(id = "empsearch_employee_name_empName")
		public WebElement empName;

		@FindBy(id = "empsearch_id")
		public WebElement empID;
		
		
		@FindBy(id = "searchBtn")
		public WebElement searchBtn;
		
		@FindBy(css="td[class='left']")
		public WebElement empIdValidation;
		
		
		@FindBy(xpath="//*[@id=\"resultTable\"]/tbody/tr/td[3]")
		public WebElement empNameValidation;
		
	   
		

		public ViewEmployeePageElements() {
			PageFactory.initElements(BaseClass.driver, this);
		}

}
