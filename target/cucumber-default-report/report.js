$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/GetjobTitles.feature");
formatter.feature({
  "name": "Employee List Job Title Drop Down.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "View Job Title Drop Down Data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Jawid"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Login to the HRMS Application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.US39Steps.user_Login_to_the_HRMS_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to Admin and job page",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.US39Steps.user_navigate_to_Admin_and_job_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get the JobTitle data",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.US39Steps.get_the_JobTitle_data()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/US39.feature");
formatter.feature({
  "name": "Employee List Job Title Drop Down.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "View Job Title Drop Down Data",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Jawid"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User Login to the HRMS Application",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.US39Steps.user_Login_to_the_HRMS_Application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to Employee List",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.US39Steps.user_navigate_to_Employee_List()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate to Admin and job page",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.US39Steps.user_navigate_to_Admin_and_job_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User will See All the values available in Database for Job Title Drop Down",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.US39Steps.user_will_See_All_the_values_available_in_Database_for_Job_Title_Drop_Down()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});