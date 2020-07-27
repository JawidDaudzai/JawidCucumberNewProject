package com.hrms.API.steps.practice;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class TokenGenerationSteps {

	
	/**
	 * Storing token as static variable
	 */
	public static String token;
	/**
	 * BaseURI
	 */
	static String baseURI= RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
   
	
	@Given("a JWT is generated")
	public void a_JWT_is_generated() {
	 
System.out.println("Good");
		
	RequestSpecification generateTokenRequest=	given().header("Content-Type", "application/json")
			.body("{\r\n" + 
					"  \"email\": \"jawid.kabul@gmail.com\",\r\n" + 
					"  \"password\": \"GoodToGo3#@\"\r\n" + 
					"}");
	
	Response generateTokenResponse=generateTokenRequest.when().post("/generateToken.php");
		
	//generateTokenResponse.prettyPrint();
	
	token="Bearer " + generateTokenResponse.body().jsonPath().getString("token");
	/**
	 * Optional to print out token
	 */
	System.out.println(token);
	}
	
	

}



