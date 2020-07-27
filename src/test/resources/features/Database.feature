#Author: Parcatice by Hassan

@dbTesting
Feature: SyntaxHrms database testing

Background:
Given I create connection with SyntaxHrms database
And I create a statement


  @tag1
  Scenario: Title Validation for syntaxHrms
  When  I reterive all job titles from database
 Then I validate results from Job Titles
 
   		| job_title                         |
      | Cloud Architect                   |
      | Cloud Consultant                  |
      | Cloud Product and Project Manager |
      | IT Analyst                        |
      | Network Administrator             |
      | IT Support Manager                |
      | Data Quality Manager              |
      | Database Administrator            |
      | Application Developer             |
      | Developer                         |
      | Accountant                        |
      | Chief Financial Officer           |
      | Controller                        |
      | Production Manager                |
      | Jr Production Manager             |
      | Sales&Marketing Manager           |
      | Jr Sales Manager                  |
      | Graphic Designer                  |
      | Pilot                             |
      | Machine technician                |
      | Bakery Chef                       |
      | QA Tester                         |
      | Quality Assurance Tester          |
      | Freelancer                        |
      | ttttt                             |
      | dsd                               |
      | Automation engineer               |
      | Film Director                     |
      | CEO                               |
    And I close all connections