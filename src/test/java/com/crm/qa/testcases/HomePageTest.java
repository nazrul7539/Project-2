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
import com.crm.qa.pages.CalendarPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.MemberListPage;
import com.crm.qa.pages.MemberPage;
import com.crm.qa.pages.MyMessagePage;
import com.crm.qa.pages.ProfileInformationPage;
import com.crm.qa.pages.SearchPage;
import com.crm.qa.pages.TopicPage;
//import com.crm.qa.util.TestUtil;

public class HomePageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;
	TopicPage topicPage;
	MemberPage memberPage;
	MemberListPage memberListPage;
	MyMessagePage myMessagePage;
	SearchPage searchPage;
	CalendarPage calendarPage;
	ProfileInformationPage profileInformationPage;
	//TestUtil testUtil;
	
	public HomePageTest(){
		super();
	
	}
	
	@BeforeMethod
	public void setUp(){
		initialization();
		//testUtil = new TestUtil();
		loginPage = new LoginPage();
		topicPage = new TopicPage();
		searchPage = new SearchPage();
		memberPage = new MemberPage();
		myMessagePage = new MyMessagePage();
		memberListPage = new MemberListPage();
		calendarPage = new CalendarPage();
		profileInformationPage = new ProfileInformationPage();
		homePage=loginPage.login(prop.getProperty("username"), prop.getProperty("password"));		
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest(){
		String homePageTitle = homePage.verifyPageTitle();
		AssertJUnit.assertEquals(homePageTitle, "Forum of PeopleNTech - Index","Home page title is not correct");
	}
	
	@Test(priority=2)
	public void verifyUserNameTest(){
		//testUtil.switchToFrame();
		AssertJUnit.assertTrue(homePage.verfyCorrectUserName());
		
	}
	
	@Test(priority=3)
	public void upcomingEventLinkTest(){
		topicPage = homePage.clickOnUpComingLink();
	}
	
	@Test(priority=4)
	public void profileInformationLinkTest(){
		profileInformationPage = homePage.clickOnProfilesLink();
	}
	
	@Test(priority=5)
	public void membersButtonClikTest(){
		memberPage = homePage.clickOnMemberLink();
	
	}
	
	@Test(priority=6)
	public void searchBtnLinkTest(){
		searchPage = homePage.clickOnSearchLink();
	}
	
	@Test(priority=7)
	public void myMessageBtnTest(){
		myMessagePage = homePage.clickOnMyMessage();
		
	}
	
	@Test(priority=8)
	public void clikOnCalendarTest(){
		calendarPage = homePage.clickOnCalendar();
	}
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
	

}
