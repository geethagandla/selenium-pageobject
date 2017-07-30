package com.selenium.pageobject.selenium_pageobject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	@FindBy(xpath="//span[text()='Enter Email/Mobile number']/../preceding-sibling::input")
	WebElement username;
	@FindBy(xpath="//span[text()='Enter Password']/../preceding-sibling::input")
	WebElement password;
	@FindBy(xpath="//button/span[text()='Login']")
	WebElement login;
	@FindBy(xpath="//span[text()='Please enter valid Email ID/Mobile number']")
	public WebElement errormsg;
	
	public LoginPage(WebDriver driver)
	{
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
	}
	
	public void login(String username, String password){
		this.username.sendKeys(username);
		this.password.sendKeys(password);
		login.click();
	}

}
