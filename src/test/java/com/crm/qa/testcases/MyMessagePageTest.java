package com.crm.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MyMessagePage;

public class MyMessagePageTest extends TestBase{
	
	HomePage homePage;
	LoginPage logingPage;
	MyMessagePage mymessagePage;
	
	public MyMessagePageTest(){
		super();
	}
	
	
	@BeforeMethod
	public void setup(){
		initialization();
		logingPage = new LoginPage();
		mymessagePage = new MyMessagePage();
		homePage=logingPage.login(prop.getProperty("username"), prop.getProperty("password"));
		
	}
	
	@Test(priority=1)
	public void sendMessageTest(){
		homePage.clickOnSendAMessage();
		mymessagePage.sendaMessage("testuser1", "Test Message for the Selenium Learning ", "Good Afternoon from AC");
		
		
	}
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	
}
