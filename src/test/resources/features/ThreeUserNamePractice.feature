#Author: your.email@your.domain.com
@Positive
Feature: Functionality test

Scenario: positive test
Given user log in to HRMS application
When user enters "admin" and "Hum@nhrm123"
Then user validates "Welcome Admin" text is available

Scenario: negative test
Given user log in to HRMS application
When user enters "admin" and "Hum@nhrm1233"
Then user validates "Welcome Admin" text is available





  #Scenario Outline: Positive and Negative test
    #Given user opens HRMS application
    #When user provides "<username>" and "<password>"
    #And user click on log in button
    #Then user can log in with positive credentials and fail with negatvive credentials
    #
    #Examples:
    #
      #| username | password    |
      #| Jawid    | Daudzai     |
      #| admin    | Hum@nhrm123 |
      #| Admin    | Hum@nhrm123 |
