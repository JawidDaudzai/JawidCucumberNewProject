package com.hrms.steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;

import com.hrms.pages.ViewEmployeePageElements;
import com.hrms.utilis.CommonMethods;
import com.hrms.utilis.ConfigsReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US39Steps extends CommonMethods{
	
	@Given("User Login to the HRMS Application")
	public void user_Login_to_the_HRMS_Application() {
		
		
		sendText(login.username, ConfigsReader.getProperty("username"));
		sendText(login.password, ConfigsReader.getProperty("password"));
		click(login.logInButton);
	}

	@When("User navigate to Employee List")
	public void user_navigate_to_Employee_List() {
		
		//navigate to employee list page
		jsClick(dashboard.PIM);
		jsClick(dashboard.empListPage);
	}
	

	@When("User navigate to Admin and job page")
	public void user_navigate_to_Admin_and_job_page() {
	   
		waitAndClick(viewEmp.adminBTN);
		waitAndClick(viewEmp.Jobmenue);
		waitAndClick(viewEmp.Joblist);
		
		
	}
	@Then("Get the JobTitle data")
	public void get_the_JobTitle_data() {
		//viewEmp.getAllJobTitleDropDown();
		
		System.out.println(viewEmp.getAllJobTitleDropDown());
		System.out.println("above From UI");
	}

	@Then("User will See All the values available in Database for Job Title Drop Down")
	public void user_will_See_All_the_values_available_in_Database_for_Job_Title_Drop_Down() throws SQLException {
		
		
		Connection 	connection = DriverManager.getConnection(ConfigsReader.getProperty("dbUrl"),
				ConfigsReader.getProperty("dbUsername"), ConfigsReader.getProperty("dbPassword"));
		Statement st = connection.createStatement();
		String query = "select job_title from ohrm_job_title where job_title =is_deleted order by job_title";
		ResultSet rs = st.executeQuery(query);
		
		ResultSetMetaData rsMetaData = rs.getMetaData();
		List<Map<String, String>> listData = new ArrayList<>();
		Map<String, String> mapData;
		

		
		while(rs.next()) {
			mapData = new LinkedHashMap<>();
			for(int i = 1; i <= rsMetaData.getColumnCount(); i++) {
				mapData.put(rsMetaData.getColumnName(i), rs.getObject(i).toString());
			}
			listData.add(mapData);
		}
		

		
		
		
		//viewEmp.getAllJobTitleDropDown(viewEmp.jobTitle);
					
		
	System.out.println("Following from db");
		System.out.println(listData);
	//}
		//System.out.println("job title from UI"+viewEmp.getAllJobTitleDropDown());
	
		
		
		//System.out.println(listData);
		
		//Assert.assertEquals(viewEmp.jobTitle, listData);
		
	//System.out.println("List"+viewEmp.getAllJobTitleDropDown(viewEmp.JobTitlenames));
		
		//System.out.println(US39DBSteps.JobTitledbData);
	//System.out.println("end of the test");
Assert.assertEquals(viewEmp.getAllJobTitleDropDown(),listData );
	}
	
	


	
	
	

}


		
	
