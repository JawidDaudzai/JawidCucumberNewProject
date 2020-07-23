$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AddEmloyee.feature");
formatter.feature({
  "name": "Add new Employee",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sprint6"
    },
    {
      "name": "@addEmployee"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
  "name": "user navigates to AddEmployeePage",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Add Employee with first and lastname",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sprint6"
    },
    {
      "name": "@addEmployee"
    },
    {
      "name": "@jawid"
    }
  ]
});
formatter.step({
  "name": "user enters employees \"John\" and \"Doe\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "user clicks save button",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "\"John Doe\" is added successfully",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.after({
  "status": "passed"
});
});