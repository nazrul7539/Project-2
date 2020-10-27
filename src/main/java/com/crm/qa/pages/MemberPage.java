package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class MemberPage extends TestBase {
	
	
	@FindBy(xpath="//span[@class='floatleft']")
		WebElement membersList;
	
	@FindBy(xpath="//span[contains(text(),'View All Members')]")
		WebElement viewAllMembers;
	
	@FindBy(xpath="//a[contains(text(),'Position')]")
		WebElement positionLink;
	
	@FindBy(xpath="//span[contains(text(),'Forum of PeopleNTech')]")
		WebElement forumPntLink;
	
	
	public MemberPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean verifyMemberList(){
		return membersList.isDisplayed();

	}
	
	public boolean verifyViewAllMembers(){
		return viewAllMembers.isDisplayed();
	}
	
	public boolean verifyPositionLink(){
		return positionLink.isDisplayed();
		
	}
	
	public HomePage verifyForumPntLink(){
		forumPntLink.click();
		return new HomePage();
	}
}
