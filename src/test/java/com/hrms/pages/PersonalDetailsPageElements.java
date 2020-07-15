package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utilis.CommonMethods;

public class PersonalDetailsPageElements extends CommonMethods{


@FindBy(id = "personal_cmbNation")
public WebElement nationalityDD;

@FindBy(css ="personal[optGender]")
public WebElement genderRadioGroup;



@FindBy(xpath = "//div[@id='pdMainContainer']/div[1]/h1")
public WebElement lblPersonalDetails;


@FindBy(xpath = "//div[@id='profile-pic']/h1")
public WebElement verfFiNameLaName;

@FindBy(id = "personal_txtEmployeeId")
public WebElement employeeId;

@FindBy(id = "searchBtn")
public WebElement searchBtn;


@FindBy(xpath = "//td[@class='left']")
public WebElement clickonEmp;


@FindBy(id = "btnSave")
public WebElement editBtn;


@FindBy(xpath = "//form[@id='frmEmpPersonalDetails']/fieldset/ol/li")
public List<WebElement> empDetails;






public PersonalDetailsPageElements() {
	PageFactory.initElements(driver, this);	
	

	
}}
	