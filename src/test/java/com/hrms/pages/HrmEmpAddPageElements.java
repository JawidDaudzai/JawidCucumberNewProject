package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utilis.CommonMethods;
import com.hrms.utilis.ConfigsReader;


public class HrmEmpAddPageElements extends CommonMethods {

	//1. and 2. are for pim and add employ click
	
	//1.
	@FindBy(css="a[id='menu_pim_viewPimModule'] b")
	public WebElement pimBTN;
	
	//2.
	@FindBy(id="menu_pim_addEmployee")
	public WebElement addEmployeeBTN;
	
	// 3, 4, 5 and 6are for labels of words in addEmp page
	
	//3.
	@FindBy(css="div[id='content'] h1")
	public WebElement addEmployeeLabel;
	
	//4.
	@FindBy(xpath="//label[@class='hasTopFieldHelp']")
	public String fullNameLabel;
	
	
	//5.
	@FindBy(xpath="//label[@for='employeeId']")
	public String employeeIdLabel;
	
	//6.
	@FindBy(xpath="//label[@for='photofile']")
	public String photographLabel;
	
	// 7, 8 and 9 are the first, middle and last names
	
	//7.
	@FindBy(id="firstName")
	public WebElement empfirstName;
	
	//8.
	@FindBy (xpath="//input[@id='middleName']")
	public WebElement empmiddleName;
	
	//9.
	@FindBy(id="lastName")
	public WebElement emplastName;
	
	//10  for uploading or sending picture
	@FindBy(id="photofile")
	public WebElement empPhotograph;
	
	//11. for employee id
	@FindBy(id = "employeeId")
	public WebElement employeeId;
	
	//12. for first save button
	@FindBy(id="btnSave")
	public WebElement saveBTNF;
	
	//13 for name, middle and last name validation
	@FindBy(xpath="//div[@id='profile-pic']/h1")
	public WebElement empValidation;
	
//14. for clicking on check box 
		@FindBy(id = "chkLogin")
		public WebElement checkboxLoginDetails;
		
//15 username as SS employee
		@FindBy(id = "user_name")
		public WebElement username;
		
//16 password for SS employee
		@FindBy(id = "user_password")
		public WebElement password;
		
//17. confirming password for SS employee
		@FindBy(id = "re_password")
		public WebElement confirmPassword;
//18. cliking second save button; I need to check whether save 1st and 2nd whether they are the same or not
		@FindBy(id = "btnSave")
		public WebElement saveBtnS;
	

	public HrmEmpAddPageElements() {
		PageFactory.initElements(driver, this);
	}

	//19. This is the method for 16, 17 and 18 (SS employee creation)
	public void createEmpLoginCR(String uid, String pwd) {
			
		sendText(username, uid);
		sendText(password, pwd);
		sendText(confirmPassword, ConfigsReader.getProperty("empPassword"));
		click(saveBtnS);
	}
	
	
}
