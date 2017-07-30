package com.selenium.pageobject.selenium_pageobject.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseDriver {
	
	WebDriver driver;
	
	@BeforeSuite
	 public void invokeBrowser(){
		
		System.setProperty("webdriver.chrome.driver", ".\\resource\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
	}
	
	@AfterSuite
	public void closeBrowser(){
		driver.quit();
	}

}
