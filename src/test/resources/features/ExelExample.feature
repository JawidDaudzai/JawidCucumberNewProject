#Author: your.email@your.domain.com

@ExcelExample1
Feature: Add multiple employees
Scenario: Using excel sheet with multi data
Given user lot in to hrms appliction
When user uses excel path of "C:\Users\User\eclipse-workspace\ZJawidCucumberNewProject2\src\test\resources\testdata\PracticeExcelFile.xlsx" and sheet from "JawidSheet"
Then user vlaid invalide and valid message
