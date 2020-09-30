package com.hrms.steps;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;

import com.hrms.utilis.CommonMethods;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ExcelExm1 extends CommonMethods {

	@Given("user lot in to hrms appliction")
	public void user_lot_in_to_hrms_appliction() throws IOException {

		List<Map<String, String>> newList = ExcelFileReading.list();

		for (Map<String, String> onebyonelist : newList) {

			String username = onebyonelist.get("Username");
			String password = onebyonelist.get("Password");

			driver.findElement(By.id("txtUsername")).sendKeys(username);

			driver.findElement(By.id("txtPassword")).sendKeys(password);
			driver.findElement(By.id("btnLogin")).click();

			System.out.println(onebyonelist.entrySet());
		}

	}

	@When("user uses excel path of {string} and sheet from {string}")
	public void user_uses_excel_path_of_and_sheet_from(String string, String string2) {

	}

	@Then("user vlaid invalide and valid message")
	public void user_vlaid_invalide_and_valid_message() {

	}

}
