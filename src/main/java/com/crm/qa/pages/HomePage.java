package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//b[contains(text(),'Hey, testuser')]")
	WebElement usernNameLebel;
	
	@FindBy(xpath="//a[contains(text(),'Upcoming Events')]")
	WebElement upCominEventLinks;
	
	@FindBy(xpath="//span[contains(text(),'Profile')]")
	WebElement profilesLink;
	
	@FindBy(xpath="//span[contains(text(),'Members')]")
	WebElement membersLink;
	
	@FindBy(xpath="//span[contains(text(),'Search')]")
	WebElement searchLink;
	
	@FindBy(xpath="//span[contains(text(),'My Messages')]")
	WebElement myMessageLink;
	
	@FindBy(xpath="//a[contains(text(),'Send a message')]")
	WebElement sendmsgLink;
	
	@FindBy(xpath="//span[contains(text(),'Calendar')]")
	WebElement calendarsLink;
	
	// Initializing the HomePage Objects
	
	public HomePage(){
		PageFactory.initElements(driver, this);
		
	}
	
	public String verifyPageTitle(){
		return driver.getTitle();
		
	}
	
	public boolean verfyCorrectUserName(){
		return usernNameLebel.isDisplayed();
	}
	
	public TopicPage clickOnUpComingLink(){
		upCominEventLinks.click();
		return new TopicPage();
		
	}
	
	public  ProfileInformationPage clickOnProfilesLink(){
		profilesLink.click();
		return new ProfileInformationPage();
		
	}
	
	public  MemberPage clickOnMemberLink(){
		membersLink.click();
		return new MemberPage();
		
	}
	
	public  SearchPage clickOnSearchLink(){
		searchLink.click();
		return new SearchPage();
		
	}
	
	public  MyMessagePage clickOnMyMessage(){
		myMessageLink.click();
		return new MyMessagePage();
		
	}
	
	public  CalendarPage clickOnCalendar(){
		calendarsLink.click();
		return new CalendarPage();
		
	}
	
	public void clickOnSendAMessage(){
		Actions action = new Actions(driver);
		action.moveToElement(myMessageLink).build().perform();
		sendmsgLink.click();
	}
	
	

}
