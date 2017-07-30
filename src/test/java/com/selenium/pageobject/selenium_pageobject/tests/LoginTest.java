package com.selenium.pageobject.selenium_pageobject.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.selenium.pageobject.selenium_pageobject.pages.HomePage;
import com.selenium.pageobject.selenium_pageobject.pages.LoginPage;

public class LoginTest extends BaseDriver {
	
	@Test(priority = 1)
	public void loginTest(){
		HomePage homePage= new HomePage(driver);
		homePage.clickOnLogin();
		LoginPage login=new LoginPage(driver);
		login.login("hdfvvgvf", "hhhhhhh");
		Assert.assertTrue(login.errormsg.isDisplayed());
		
	}
	
	
}
