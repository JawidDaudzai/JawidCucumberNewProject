package com.hrms.API.steps.practice;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class HardcodedExamples {

	/**
	 * Rest Assured
	 * given - prepare your request
	 * when - you are making the call to the endpoint
	 * then - validating
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		RestAssured.baseURI = "18.232.148.34/syntaxapi/api";
		
		/**
		 * JWT required for all calls - expires every 12 hours
		 */
		String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTUwOTQ4MTIsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NTEzODAxMiwidXNlcklkIjoiNDc1In0.KvBuG6CmgVWIc283V1LZVZ6d0vJwzIGSKj6N5j9STg4";
		
		/**
		 * Preparing /getOneEmployee.php request
		 */
		RequestSpecification getOneEmployeeRequest=given().header("Content-Type", "application/json").header("Authorization", token ).queryParam("employee_id", "16353A");

		
		Response getOneEmployeeResponse = getOneEmployeeRequest.when().get("/getOneEmployee.php");
		 
		/**
		 * Two ways to print response
		 */
		getOneEmployeeResponse.prettyPrint();
		//String response = getOneEmployeeResponse.body().asString();
		
	}
	
}
