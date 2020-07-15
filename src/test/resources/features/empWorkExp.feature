#Author: Jawid
Feature: Qualifications
  
  

 @Smoke
  Scenario: Add employee work experience
  
  
    Given user is logged with valid admin credentials
    And user navigates to personal details page by using employee id "14289"
 
    When user can click on Qualifications
    And user can add "Coding Tech" And "Scrum Master"
    And user can add date "1990-Jan-05" And "2020-Jun-05"
    And user can click on save button
   
    Then "Coding Tech" is displayed
    
  

  