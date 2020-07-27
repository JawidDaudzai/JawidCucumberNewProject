package com.hrms.API.steps.practice;



import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
/**
 * importing JUnit packages
 */
import org.junit.*;
import org.junit.runners.MethodSorters;
/**
 * We may use below- please comment out for now
 * 
 *
 */
//import org.apache.hc.core5.http.ContentType;

/**
 * This @FixMethodOrder(MethodSorters.Name_Ascending) will execute @Test annotation in ascending 
 * alphabetical order
 *
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

public class HardcodedExamples {

		/**
		 * Rest Assured
		 * given - prepare your request
		 * when - you are making the call to the endpoint
		 * then - validating
		 * 
		 * @param args
		 */
		
		
		
		static String baseURI= RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
		String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTU3Njk3OTcsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NTgxMjk5NywidXNlcklkIjoiNDc1In0.0-6zWGC458i-jmot6ynS_8qeUZaJy2KgfQEQxUMPExE";
		public static String employeeID;
		
		
		public static void main(String[] args) {
			/**
			 * BaseURI for all calls
			 */
			
			RestAssured.baseURI = "http://18.232.148.34/syntaxapi/api";
			
			/**
			 * JWT required for all calls - expires every 12 hours
			 */
			String token = "Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpYXQiOjE1OTU3OTU0NTAsImlzcyI6ImxvY2FsaG9zdCIsImV4cCI6MTU5NTgzODY1MCwidXNlcklkIjoiNDc1In0.4OKj08h7aWCaZexyGe9VZfjQXTqAMfg2-uhgRQ-ZvB4";
			
			/**
			 * Preparing /getOneEmployee.php request
			 */
			RequestSpecification getOneEmployeeRequest=given().header("Content-Type", "application/json")
					.header("Authorization", token ).queryParam("employee_id", "16353A");//.log().all();

			/**
			 * Storing response
			 */
			Response getOneEmployeeResponse = getOneEmployeeRequest.when().get("/getOneEmployee.php");
			 
			/**
			 * Two ways to print response preetyPrint() method converts JSON object into
			 * String and prints - no need to SOP
			 */
			getOneEmployeeResponse.prettyPrint();
			//String response = getOneEmployeeResponse.body().asString();
			//System.out.println(response);
			/**
			 * Verifying response status code is 200
			 */
			
			getOneEmployeeResponse.then().assertThat().statusCode(200);
			
		}
		
		@Test
		public void aPOSTcreateEmployee() {
			
			/**
			 * Preparing request for /createEmployee.php
			 */
			RequestSpecification createEmployeeRequest=given().header("Content-Type", "application/json")
					.header("Authorization", token ).body("{\r\n" + 
							"  \"emp_firstname\": \"syntaxFirstName\",\r\n" + 
							"  \"emp_lastname\": \"syntaxLastName\",\r\n" + 
							"  \"emp_middle_name\": \"syntaxMiddleName\",\r\n" + 
							"  \"emp_gender\": \"F\",\r\n" + 
							"  \"emp_birthday\": \"2000-07-11\",\r\n" + 
							"  \"emp_status\": \"Employee\",\r\n" + 
							"  \"emp_job_title\": \"Cloud Architect\"\r\n" + 
							"}");

			/**
			 * Storing response into createEmployeeResponse
			 */
			Response createEmployeeResponse = createEmployeeRequest.when().post("/createEmployee.php");
			 
			/**
			 * Printing response using prettyPrint() method
			 */
			createEmployeeResponse.prettyPrint();
			
			
			
			
			/**
			 * jsonPath() to view response body which lets us get the employee ID 
			 * We store employee ID as a global variable so that we may use it
			 * with our other calls
			 * 
			 */
			employeeID=createEmployeeResponse.body().jsonPath().getString("Employee[0].employee_id");
			/** Optional to print employee ID*/
			System.out.println(employeeID);
			
			/**
			 * Verifying response status code is 201
			 */
			
			createEmployeeResponse.then().assertThat().statusCode(201);
			/**
			 * Verifying message using equalTo() method - manually import static package
			 * import static org.hamcrest.Matchers.*;
			 */
			
			createEmployeeResponse.then().assertThat().body("Message", equalTo("Entry Created"));
			
			/**
			 * Verifying created first name
			 */
			createEmployeeResponse.then().assertThat().body("Employee[0].emp_firstname", equalTo("syntaxFirstName"));
			/**
			 * Verifying Sever using then()assertThat().header()
			 */
			createEmployeeResponse.then().assertThat().header("Server", "Apache/2.4.39 (Win64) PHP/7.2.18");
			/**
			 * Verifying Content-Type using then()assertThat().header()
			 */
			createEmployeeResponse.then().assertThat().header("Content-Type", "application/json");
			/**
			 * Verifying Sever using then()assertThat().header()
			 */
			createEmployeeResponse.then().assertThat().header("Access-Control-Allow-Methods", "POST");
			
			}
		
		@Test
		public void bGETcreatedEmployee() {
			
			/**
			 * Preparing request for /getCreatedEmployee.php
			 * Using log().all() to see all information being sent with request
			 */
			RequestSpecification getCreatedEmployeeRequest=given().header("Content-Type", "application/json")
					.header("Authorization", token ).queryParam("employee_id", employeeID).log().all();

			/**
			 * Making call to retrieve created employee
			 */
			Response getCreatedEmployeeResponse = getCreatedEmployeeRequest.when().get("/getOneEmployee.php");
			 
			/**
			 * Printing response using prettyPrint() method
			 */
			String response= getCreatedEmployeeResponse.prettyPrint();
			
			
			
			
			/**
			 * Storing response employeeID into empID which will be use for verification
			 * against stored global employee ID
			 */
			String empID=getCreatedEmployeeResponse.body().jsonPath().getString("employee[0].employee_id");
			/**
			 * Matching exact employeeID's
			 */
			boolean verifyingEmployeeIDsMatch=empID.contentEquals(employeeID);
			System.out.println("Employee ID's match: "+ verifyingEmployeeIDsMatch);
			/**
			 * Asserting employee ID's match
			 */
			Assert.assertTrue(verifyingEmployeeIDsMatch);
			
				/**
			 * Verifying response status code is 200
			 */
			
			getCreatedEmployeeResponse.then().assertThat().statusCode(200);
			
			
			JsonPath js = new JsonPath(response);
			
			String emplID= js.get("employee[0].employee_id");
			String firstName= js.get("employee[0].emp_firstname");
			String middleName= js.get("employee[0].emp_middle_name");
			String lastName= js.get("employee[0].emp_lastname");
			String emp_bday= js.get("employee[0].emp_birthday");
			String gender= js.get("employee[0].emp_gender");
			String jobTitle= js.get("employee[0].emp_job_title");
			String empStatus= js.get("employee[0].emp_status");
			
			System.out.println(emplID);
			System.out.println(firstName);
			
			/** Verifying employee ID's match */
			Assert.assertTrue(emplID.contentEquals(employeeID));
			/**
			 * Second way of asserting
			 */
			Assert.assertEquals(employeeID, emplID);
			
			/**
			 * Verifying expected first name matches actual first name
			 */
			Assert.assertTrue(firstName.contentEquals("syntaxFirstName"));
			/**
			 * Verifying expected middle name matches actual middle name
			 */
			Assert.assertTrue(middleName.contentEquals("syntaxMiddleName"));
			/**
			 * Verifying expected last name matches actual last name
			 */
			Assert.assertTrue(lastName.contentEquals("syntaxLastName"));
			/**
			 * Verifying expected birthday matches actual birth day
			 */
			Assert.assertTrue(emp_bday.contentEquals("2000-07-11"));
			/**
			 * Verifying expected gender matches actual gender
			 */
			Assert.assertTrue(gender.contentEquals("Female"));
			/**
			 * Verifying expected job title matches actual job title
			 */
			Assert.assertTrue(jobTitle.contentEquals("Cloud Architect"));
			
			/**
			 * Verifying expected employee status matches actual employee status
			 */
			Assert.assertTrue(empStatus.contentEquals("Employee"));
		}
		
		
		@Test
		public void cGETallEmployees() {
			
			/**
			 * Preparing request for /getAllEmployees.php
			 */
			RequestSpecification getAllEmployeesRequest=given().header("Content-Type", "application/json")
					.header("Authorization", token );

			/**
			 * Storing response into getAllEmployeesResponse 
			 */
			Response getAllEmployeesResponse = getAllEmployeesRequest.when().get("/getAllEmployees.php");
			 
			/**
			 * Printing all employees using prettyPrint() method
			 */
			//String response= getAllEmployeesResponse.prettyPrint();
			
			String allEmployees =getAllEmployeesResponse.body().asString();
			/**
			 * The below will pass but incorrect
			 */
		//	allEmployees.contains(employeeID);
			/**
			 * ---------------Do Research ----------------
			 */
			
			//allEmployees.matches(employeeID);
			
			
			JsonPath js = new JsonPath(allEmployees);
			/**
			 * Retrieving size of Employees list
			 */
			int sizeOfList= js.getInt("Employees.size()");
			System.out.println(sizeOfList);
			
			/**
			 * Printing all employee IDs
			 */
			
//			for (int i=0; i<sizeOfList; i++) {
//				String allEmployeeIDs=js.getString("Employees["+ i + "].employee_id");
//				//System.out.println(allEmployeeIDs);
//				
//				/**
//				 * If statement inside for loop to find stored employee ID and brake the loop
//				 * when found
//				 */
//				if(allEmployeeIDs.contentEquals(employeeID)) {
//					System.out.println("Employee ID: " + employeeID + "is present in body");
//					String employeeFirstName=js.getString("Employees["+ i + "].emp_firstname");
//					System.out.println(employeeFirstName);
//					break;
//					
//				}
			}
			
			
		
		
		@Test
		public void dPUTupdateCreatedEmployee() {
			
			/**
			 * Preparing request for /updateEmployee.php
			 */
			RequestSpecification updateCreatedEmployeesRequest=given().header("Content-Type", "application/json")
					.header("Authorization", token ).body("{\r\n" + 
							"  \"employee_id\": \""+employeeID+"\",\r\n" + 
							"  \"emp_firstname\": \"Fawad\",\r\n" + 
							"  \"emp_lastname\": \"Farhad\",\r\n" + 
							"  \"emp_middle_name\": \"Jahan\",\r\n" + 
							"  \"emp_gender\": \"M\",\r\n" + 
							"  \"emp_birthday\": \"2007-07-11\",\r\n" + 
							"  \"emp_status\": \"Worker\",\r\n" + 
							"  \"emp_job_title\": \"IT Support Manager\"\r\n" + 
							"}");

			/**
			 * Storing response into updatedCreatedEmployeeResponse 
			 */
			Response updateCreatedEmployeeResponse = updateCreatedEmployeesRequest.when().put("/updateEmployee.php");
			 
			/**
			 * Printing all employees using prettyPrint() method
			 */
			//String response= updateCreatedEmployeeResponse.prettyPrint();
			/**
			 * Asserting using hamcrest matchers equalTo() method to verify employee is updated
			 */
			
			updateCreatedEmployeeResponse.then().assertThat().body("Message", equalTo("Entry updated"));
			/**
			 * Retrieving response body employee ID using jsonPAth()
			 */
			String empID=updateCreatedEmployeeResponse.body().jsonPath().getString("employee[0].employee_id");
		
			/**
			 * Asserting that response body employee ID matches globally stored employee ID
			 */
			
			Assert.assertTrue(empID.contentEquals(employeeID));
		}
		
		
		
		//@Test
		public void eGETUpdatedEmployee() {
			
			/**
			 * Preparing request to get updated employee

			 */
			RequestSpecification getUpdatedEmployeeRequest=given().header("Content-Type", "application/json")
					.header("Authorization", token ).queryParam("employee_id", employeeID);

			/**
			 * Storing response into getUpdatedEmployeeResponse 
			 */
			Response getUpdatedEmployeeResponse = getUpdatedEmployeeRequest.when().get("/getOneEmployee.php");
			 
			/**
			 * Printing response of updated employee using prettyPrint() method
			 */
			//String response= getUpdatedEmployeeResponse.prettyPrint();
			/**
			 * Asserting expected fist name
			 */
			getUpdatedEmployeeResponse.then().assertThat().body("employee[0].emp_firstname", equalTo("syntaxFirstName"));
			/**
			 * Verifying response employee ID is equal to globally stored employee ID
			 */
			getUpdatedEmployeeResponse.then().assertThat().body("employee[0].employee_id", equalTo(employeeID));
		}
		
		
		@Test
		public void fPATCHpartiallyUpdatedEmployee() {
			
			/**
			 * Preparing request for /updatePartialEmplyeesDetails.php


			 */
			RequestSpecification partiallyUpdatingEmployeeRequest=given().header("Content-Type", "application/json")
					.header("Authorization", token ).body("{\r\n" + 
							"  \"employee_id\": \""+employeeID+"\",\r\n" + 
							"  \"emp_firstname\": \"Ahmet\"\r\n" + 
							"}");

			/**
			 * Storing response into  partiallyUpdatingEmployeeResponse 
			 */
			Response partiallyUpdatingEmployeeResponse = partiallyUpdatingEmployeeRequest.when().patch("/updatePartialEmplyeesDetails.php");

			 
			/**
			 * Printing all employees using prettyPrint() method
		
		 */
			//String response= getUpdatedEmployeeResponse.prettyPrint();
			partiallyUpdatingEmployeeResponse.then().assertThat().body("employee[0].employee_id", equalTo(employeeID));

		}
		
		
		@Test
		public void gDELETEemployee() {
			
			/**
			 * Preparing request for /deleteEmployee.php


			 */
			RequestSpecification deleteEmployeeRequest=given().header("Content-Type", "application/json")
					.header("Authorization", token ).queryParam("employee_id", employeeID);

			/**
			 * Storing response into deleteEmployeeResponse
			 */
			Response deleteEmployeeResponse = deleteEmployeeRequest.when().delete("/deleteEmployee.php");

			 
			/**
			 * Printing all employees using prettyPrint() method
		
		 */
			deleteEmployeeResponse.prettyPrint();
			
			
			deleteEmployeeResponse.then().assertThat().body("message", equalTo("Entry deleted"));
			/**
			 * Verifying response status code is 201
			 */
			
			deleteEmployeeResponse.then().assertThat().statusCode(201);
		}
		
}

