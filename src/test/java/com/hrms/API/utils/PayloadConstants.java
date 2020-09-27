package com.hrms.API.utils;

import org.json.JSONObject;
import com.hrms.API.steps.practice.HardcodedExamples;
import com.hrms.API.steps.practice.WorkflowAllSteps;

public class PayloadConstants {
/**
 * Create employee body
 * @return
 */
	public static String createEmployeeBody() {
		
		
		String createEmployeeBody="{\r\n" + 
						"  \"emp_firstname\": \"syntaxFirstName\",\r\n" + 
						"  \"emp_lastname\": \"syntaxLastName\",\r\n" + 
						"  \"emp_middle_name\": \"syntaxMiddleName\",\r\n" + 
						"  \"emp_gender\": \"F\",\r\n" + 
						"  \"emp_birthday\": \"2000-07-11\",\r\n" + 
						"  \"emp_status\": \"Employee\",\r\n" + 
						"  \"emp_job_title\": \"Cloud Architect\"\r\n" + 
						"}";
		/**
		 * Created method to return payload- to reduce messy code
		 */
				return createEmployeeBody;
	}
	
	/**
	 * Crating payload using JSON and returning it as a String
	 * @return
	 */
	public static String createEmployeePayload() {
		
		JSONObject obj= new JSONObject();
		obj.put("emp_firstname", "syntaxFirstName");
		obj.put("emp_lastname", "syntaxLastName");
		obj.put("emp_middle_name","syntaxMiddleName" );
		obj.put("emp_gender","F" );
		obj.put("emp_birthday", "2000-07-11");
		obj.put("emp_status","Employee" );
		obj.put("emp_job_title","Cloud Architect" );
		
	return	obj.toString();
	}
	
	/**
	 * Created method to return payload - to reduce messy code
	 * @return
	 */
	public static String updateCreatedEmpBody() {		
		String updateBody = "{\n" + "  \"employee_id\": \"" + HardcodedExamples.employeeID + "\",\n"
				+ "  \"emp_firstname\": \"syntaxUpdatedFirstName\",\n"
				+ "  \"emp_lastname\": \"syntaxUpdatedLastName\",\n"
				+ "  \"emp_middle_name\": \"syntaxUpdatedMiddleName\",\n" + "  \"emp_gender\": \"F\",\n"
				+ "  \"emp_birthday\": \"2000-07-11\",\n" + "  \"emp_status\": \"Employee\",\n"
				+ "  \"emp_job_title\": \"Cloud Consultant\"\n" + "}";
				return updateBody;
	}
	
	public static String updateCreatedEmployeePayload() {
		
		JSONObject obj= new JSONObject();
		obj.put("employee_id", WorkflowAllSteps.employeeID);
		obj.put("emp_firstname", "Jawid");
		obj.put("emp_lastname", "syntaxLastName");
		obj.put("emp_middle_name","syntaxMiddleName" );
		obj.put("emp_gender","F" );
		obj.put("emp_birthday", "2000-07-11");
		obj.put("emp_status","Employee" );
		obj.put("emp_job_title","Cloud Architect" );
		
	return	obj.toString();
	}
	
	
public static String PupdateCreatedEmployeePayload() {
		
		JSONObject obj= new JSONObject();
		obj.put("employee_id", WorkflowAllSteps.employeeID);
		obj.put("emp_firstname", "Jawid");
		obj.put("emp_lastname", "syntaxLastName");
		
		
	return	obj.toString();
	}


public static String userIDtoGenerateToken() {
	
	String IDToGenerateToken="{\r\n" + "  \"email\": \"jawid.kabul@gmail.com\",\r\n" + "  \"password\": \"GoodToGo3#@\"\r\n" + "}";
	
	return IDToGenerateToken;
	
	
	
}
}
