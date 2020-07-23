package com.hrms.testbase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import com.hrms.utilis.ConfigsReader;
import com.hrms.utilis.Constants;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
public static WebDriver setUp() {
	System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "true");
	ConfigsReader.readProperties(Constants.CONFIGURATION_FILEPATH);
	
	String headless = ConfigsReader.getProperty("headless");
	
	switch(ConfigsReader.getProperty("browser").toLowerCase()) {
	
	
	
	case"chrome":
		WebDriverManager.chromedriver().setup();//version("81")ayrlayabilirz
	
	ChromeOptions cOption =new ChromeOptions();
	if(headless.equalsIgnoreCase("true")) {
		
		cOption.setHeadless(true);
		driver=new ChromeDriver(cOption);
		
		
	}else {
		driver=new ChromeDriver();
	}
	break;
	
	case"firefox":
		
		
		
		WebDriverManager.firefoxdriver().setup();
//		FirefoxOptions fOption =new FirefoxOptions();
//		if (headless.equalsIgnoreCase("true")) {
//			fOption.setHeadless(true);
//			driver=new FirefoxDriver(fOption);
//		}else {
			driver=new FirefoxDriver();
			
//		}
		
		
		break;
		default:
			throw new RuntimeException("Browser is not supported");
			
			}
	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT_TIME, TimeUnit.SECONDS);
		
	driver.get(ConfigsReader.getProperty("url"));	

	PagesInitializer.intialize();
	return driver;
	
		}

	public static void tearDown() {
		if(driver!=null) {
			driver.quit();
	}}}
