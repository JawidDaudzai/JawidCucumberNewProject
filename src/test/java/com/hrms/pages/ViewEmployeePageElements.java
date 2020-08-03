package com.hrms.pages;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class ViewEmployeePageElements extends BaseClass {

	
	
	
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
		
		@FindBy(xpath="//a[contains(text(),'Adams')] ")
		public WebElement search;
		
		@FindBy(xpath="//a[@href='/humanresources/symfony/web/index.php/pim/viewJobDetails/empNumber/14457']")
		public WebElement job;
		
		@FindBy(id="btnSave")
		public WebElement edit;
		
//		@FindBy(name="empsearch[job_title]")
//		public List<WebElement> jobTitle;
		
		
		@FindBy(xpath="//*[@id=\"resultTable\"]")
		public List<WebElement> jobTitle;
		

		@FindBy (xpath="//*[@id='resultTable']//tbody/tr/td/a")
				public List <WebElement> JobTitlenames;
		
//		public List<Map<String, String>> getAllJobTitleDropDown(List<WebElement> namelist) {
//			List<Map<String, String>> jobTilelist = new ArrayList<>();
//			List<WebElement> jtlist = namelist;
//			for (WebElement row : jtlist) {
//				Map<String, String> storeJobTitles = new LinkedHashMap<>();
//				String tableName = row.getText();
//				storeJobTitles.put("job_title", tableName);
//				jobTilelist.add(storeJobTitles);
//			}
//			return jobTilelist;
//		}
		
		
		public List<Map<String, String>> getAllJobTitleDropDown(List<WebElement>JobTitlenames) {
			List<Map<String, String>> jobTilelist = new ArrayList<>();
			
			for (int i=0; i<JobTitlenames.size(); i++) {
				
				Map<String, String> storeJobTitles = new LinkedHashMap<>();
				String tableName=JobTitlenames.get(i).getText();
				storeJobTitles.put("job_title", tableName);
				jobTilelist.add(storeJobTitles);
			}
			return jobTilelist;
		}


		@FindBy(id="menu_admin_viewAdminModule")
		public WebElement adminBTN;
		
		@FindBy(id="menu_admin_viewJobTitleList")
		public WebElement Joblist;
		
		@FindBy(id="menu_admin_Job")
		public WebElement Jobmenue;
		
		
		public ViewEmployeePageElements() {
			PageFactory.initElements(BaseClass.driver, this);
		}

}
