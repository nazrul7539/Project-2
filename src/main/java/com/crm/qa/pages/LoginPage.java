package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	// Page Factory or Object Repository
	
	@FindBy(xpath="(//input[@name='user'])[1]")
	WebElement username;
	
	@FindBy(xpath="(//input[@name='passwrd'])[1]")
	WebElement psssword;
	
	@FindBy(xpath="(//input[@class='button_submit'])[1]")  
	WebElement loginButton;
	
	@FindBy(xpath="//*[@id='button_register']/a/span")
	WebElement registerButton;
	
	@FindBy(xpath="//*[@id='button_help']/a/span")
	WebElement helpButton;

	//Initializing the Page Object
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	// Action 
	public String validateLoginPage(){
		
		return driver.getTitle();
	}
	
	public HomePage login(String uname,String pswrd){
		username.sendKeys(uname);
		psssword.sendKeys(pswrd);
		loginButton.click();
		return new HomePage();
		
	}
	
	public RegistrationPage registrationPage(){
		registerButton.click();
		return new RegistrationPage();
	}
	
}
