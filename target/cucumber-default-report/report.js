$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/empWorkExp.feature");
formatter.feature({
  "name": "Qualifications",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add employee work experience",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is logged with valid admin credentials",
  "keyword": "Given "
});
formatter.match({
  "location": "com.hrms.steps.AddEmpWorkExpSteps.user_is_logged_with_valid_admin_credentials()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to personal details page by using employee id \"14289\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddEmpWorkExpSteps.user_navigates_to_personal_details_page_by_using_employee_id(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can click on Qualifications",
  "keyword": "When "
});
formatter.match({
  "location": "com.hrms.steps.AddEmpWorkExpSteps.user_can_click_on_Qualifications()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can add \"Coding Tech\" And \"Scrum Master\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddEmpWorkExpSteps.user_can_add(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can add date \"1990-Jan-05\" And \"2020-Jun-05\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddEmpWorkExpSteps.user_can_add_date(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can click on save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.hrms.steps.AddEmpWorkExpSteps.user_can_click_on_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"Coding Tech\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hrms.steps.AddEmpWorkExpSteps.is_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});