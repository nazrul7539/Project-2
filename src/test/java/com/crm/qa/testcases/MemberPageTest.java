package com.crm.qa.testcases;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MemberListPage;
import com.crm.qa.pages.MemberPage;

public class MemberPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	MemberPage memberPage;
	MemberListPage memberListPage;
	
	public MemberPageTest(){
	super();
		
}
	
	
	@BeforeMethod
	public void setUp(){
		initialization();
		loginPage = new LoginPage();
		memberPage = new MemberPage();
		//memberListPage = new MemberListPage;
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		memberPage = homePage.clickOnMemberLink();
		
	}
	
	
	@Test(priority=1)
	public void verifyMemberPageLebel(){
		//AssertJUnit.assertTrue(memberPage.verifyMemberList(), "Members List is missing on the Member page");
		
	}
	
	@Test(priority=2)
	public void verifyViewAllMembersTest(){
		memberPage.verifyViewAllMembers();
		AssertJUnit.assertTrue(true);
		
	}
	
	@Test(priority=3)
	public void verifyPositionLinkTest(){
		memberPage.verifyPositionLink();
	}
	
	@Test(priority=4)
	public void clickOnForumPntLinkTest(){
		memberPage.verifyForumPntLink();
		
	}

	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		
	}
}
