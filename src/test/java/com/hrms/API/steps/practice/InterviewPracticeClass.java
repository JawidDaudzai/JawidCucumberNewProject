package com.hrms.API.steps.practice;

import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;


import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;


public class InterviewPracticeClass {

	static String  employeeID;
	

@Test
public void generateToken() {
	
	
RestAssured.baseURI= "http://18.232.148.34/syntaxapi/api";
String token =  "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE2MDAzMTA5OTksImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTYwMDM1NDE5OSwidXNlcklkIjoiNDc1In0.iSfv47VBbn0u63FMeSIk0_ebfhnycFnyKXSaSvd3Y0o";

	RequestSpecification createEmployeeRequest= given().header("Content-Type", "application/json").header("Authorization", token).body("{\r\n" + 
			"  \"emp_firstname\": \"syntaxFirstName\",\r\n" + 
			"  \"emp_lastname\": \"syntaxLastName\",\r\n" + 
			"  \"emp_middle_name\": \"syntaxMiddleName\",\r\n" + 
			"  \"emp_gender\": \"F\",\r\n" + 
			"  \"emp_birthday\": \"2000-07-11\",\r\n" + 
			"  \"emp_status\": \"Employee\",\r\n" + 
			"  \"emp_job_title\": \"Cloud Architect\"\r\n" + 
			"}");
	
	
	
	Response createEmployeeResponse = createEmployeeRequest.when().post("/createEmployee.php");
	
	createEmployeeResponse.prettyPrint();
	createEmployeeResponse.then().assertThat().statusCode(201);
	createEmployeeResponse.then().assertThat().body("Message", equalTo("Entry Created"));
	
	
	createEmployeeResponse.then().assertThat().body("Employee[0].emp_middle_name", equalTo("syntaxMiddleName"));
	
	
	employeeID= createEmployeeResponse.jsonPath().getString("Employee[0].employee_id");
	System.out.println(employeeID);
}






}
