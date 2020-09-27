package com.hrms.API.steps.practice;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

import com.hrms.API.utils.PayloadConstants;
import static org.hamcrest.Matchers.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.junit.Assert;

public class MyPracticeSteps {

	static String BaseUrl = RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
	public static String token;
	public static RequestSpecification request;
	public static Response response;
	public static String employeeID;

	@Given("Generate token")
	public void generate_token() {

		request = given().header("Content-Type", "application/json").body(PayloadConstants.userIDtoGenerateToken());

		response = request.when().post("/generateToken.php");

		// generateTokenResponse.prettyPrint();
		token = "Bearer " + response.body().jsonPath().getString("token");
		System.out.println(token);

	}

	@Given("To prepare a request for creating an employee")
	public void to_prepare_a_request_for_creating_an_employee() {
		request = given().header("Content-Type", "application/json").header("authorization", token)
				.body(PayloadConstants.createEmployeeBody());
	}

	@When("Create post call for creating an employee")
	public void create_post_call_for_creating_an_employee() {

		response = request.when().post("/createEmployee.php");

//response.prettyPrint();
	}

	@Then("Validate status code is {int}")
	public void validate_status_code_is(int statusCode) {

		response.then().assertThat().statusCode(statusCode);
		System.out.println("I am the here:: " + statusCode);

	}

	@Then("The response contains key {string} and value {string}")
	public void the_response_contains_key_and_value(String key, String value) {

		response.then().assertThat().body(key, equalTo(value));
	}

	@Then("store created employee id {string} as global variable to be used in other calls")
	public void store_created_employee_id_as_global_variable_to_be_used_in_other_calls(String empID) {

		employeeID = response.body().jsonPath().getString(empID);

		System.out.println(employeeID);
	}

	@Given("A request is prepared to retrive the created employee")
	public void a_request_is_prepared_to_retrive_the_created_employee() {
		request = given().header("Content-Type", "appliation/json").header("authorization", token)
				.queryParam("employee_id", employeeID);
	}

	@When("Get call is made")
	public void get_call_is_made() {

		response = request.when().get("/getOneEmployee.php");

	}

	@Then("status code for retrieved employee is {int}")
	public void status_code_for_retrieved_employee_is(int RstatusCode) {
		response.then().assertThat().statusCode(RstatusCode);

	}

	@Then("id for retrieved employee is matching the globally stored id")
	public void id_for_retrieved_employee_is_matching_the_globally_stored_id() {
		String retrivedEmplID = response.body().jsonPath().getString("employee[0].employee_id");
		Assert.assertTrue(retrivedEmplID.contentEquals(employeeID));

	}


	@Then("Retrieved employee data is matching the created employee data")
	public void retrieved_employee_data_is_matching_the_created_employee_data(DataTable dataTable) {

		// List<Map<String, String>> listMaps= new ArrayList<>();

		List<Map<String, String>> expectedData = dataTable.asMaps();
		
		for (Map<String, String> keys:expectedData) {
			
			
		Set<String> key=keys.keySet();
		System.out.println("I am keys from expectedData :: "+key);
		}
		
		
		
		for(Map<String, String> values: expectedData) {
			
			Collection <String> value=values.values();
				System.out.println("I am value of the expected Data :: "+ value);
		}
		
		for (Map<String, String> keys2:expectedData) {
			
			
			Set<Entry<String, String>> key1=keys2.entrySet();
			System.out.println("I am entry set from expectedData :: "+key1);
		
		
		}
		
		List<Map<String, String>> actualData = response.body().jsonPath().get("employee");
		
		
		for (Map<String, String> actualDatakeys : actualData) {
			
		Set<Entry<String, String>> actualDatakey=actualDatakeys.entrySet();
		System.out.println("I am entry set from  actual Data :: "+actualDatakey);
		
		}
		
		int index=0;
		
		for (Map<String, String> map : expectedData) {
			
			Set<String> keys= map.keySet();
			
			for(String key:keys) {
				
			String expectedValue=	map.get(key);
			
			String actualValue= actualData.get(index).get(key);
		
		System.out.println("Yes ::"+expectedValue);
		System.out.println("really:: "+actualValue);
			
				Assert.assertEquals(expectedValue, actualValue);
			}
			
			index ++;
			
			
		}

	}
	
	
}
