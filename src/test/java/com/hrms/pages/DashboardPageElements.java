package com.hrms.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.utilis.CommonMethods;

public class DashboardPageElements extends CommonMethods{
	
	@FindBy(id = "welcome")
	public WebElement welcome;
	
	@FindBy(css ="div[id='branding'] a img")
	public WebElement logo;
	
	@FindBy(xpath ="//a[@id='menu_pim_viewPimModule']")
	public WebElement PIM;
	
	@FindBy(xpath = "//a[@id='menu_pim_addEmployee']")
	public WebElement addEmp;
	
	@FindBy(xpath="//div[@class='menu']/ul/li")
	public List<WebElement> dashMenu;
	
	@FindBy(id="menu_pim_viewEmployeeList")
	public WebElement empListPage;
	
	
	@FindBy(xpath="//table[@id='resultTable']/tbody/tr/td/a[1]")
	public WebElement Idclick;
	
	
	@FindBy(xpath="//table[@class='table hover']/tbody/tr")
	public List<WebElement> EmpWorkVerfication;
	

	
	
	public DashboardPageElements() {
		PageFactory.initElements(driver, this);	}
	
	public void navigateToAddemployee() {
		//PIM.click();
		waitAndClick(PIM);
		waitAndClick(addEmp);
	}
}
