package com.hrms.steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HassanpracticeDatabaseSteps {
private Connection conn;
private Statement st;
private ResultSet rs;
	
	@Given("I create connection with SyntaxHrms database")
	public void i_create_connection_with_SyntaxHrms_database() {
		
		String dbUsername = "syntax_hrm";
		String dbPassword = "syntaxhrm123";
		String dbUrl="jdbc:mysql://166.62.36.207:3306/syntaxhrm_mysql";
		try {
			conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		}
		
	@Given("I create a statement")
	public void i_create_a_statement() {
	  
		try {
			st= conn.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	
	}

	@When("I reterive all job titles from database")
	public void i_reterive_all_job_titles_from_database() {
		try {
			rs = st.executeQuery("select distinct(job_title) from ohrm_job_title");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Then("I validate results from Job Titles")
	public void i_validate_results_from_Job_Titles(io.cucumber.datatable.DataTable dataTable) throws SQLException {
	   
		List<Map<String, String>> expResults = dataTable.asMaps();
		
		Iterator<Map<String, String>> it=expResults.iterator();
		
		rs.next();
		
		
		while(it.hasNext()) {
			
			Map<String, String> expRes=it.next();
			String expJobTitle=expRes.get("job_title");
			rs.next();
			String actJobTitle=rs.getString("job_title");
			
			Assert.assertEquals(expJobTitle, actJobTitle);
			
		}
		
	}

	@Then("I close all connections")
	public void i_close_all_connections() {
	  

		try {
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			st.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
