package com.hrms.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hrms.testbase.BaseClass;

public class QualificationsPageElements {

	@FindBy(xpath="//ul[@id='sidenav']/li[10]/a")
		public WebElement Qualifications;
	
	@FindBy(xpath="//input[@id='addWorkExperience']")
	public WebElement AddBTN;
	
	@FindBy(xpath="//input[@name='experience[employer]']")
	public	WebElement Campany;

	
	@FindBy(xpath="//input[@name='experience[jobtitle]']")
	public	WebElement JobTitle;
	
	@FindBy(id="experience_from_date")
	public WebElement ExpFrom;
	
	
	@FindBy(id="experience_to_date")
	public WebElement ExpTo;
	
	@FindBy(id="btnWorkExpSave")
	public WebElement SaveBtn;
	
	
	@FindBy(id="experience_comments")
	public WebElement Comment;
	
	
	@FindBy(xpath="//a[@class='edit']")
	public	WebElement CompVerfication;
	
	
	
	

	public QualificationsPageElements() {
	PageFactory.initElements(BaseClass.driver, this);
	}
}
