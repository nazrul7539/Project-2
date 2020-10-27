package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class MyMessagePage extends TestBase {
	
	@FindBy(xpath="//span[contains(text(),'My Messages')]")
	WebElement myMessageLink;
	
	@FindBy(xpath="//a[contains(text(),'Send a message')]")
	WebElement sendmsgLink;
	
	@FindBy(id="to_control")
	WebElement messageto;
	
	@FindBy(xpath="//input[@name='subject']")
	WebElement subjectheading;
	
	@FindBy(xpath="//textarea[@id='message']")
	WebElement messagesummery;
	
	@FindBy(xpath="//input[@type='submit' and @value='Send message']")
	WebElement clicksendmessageBtn;
		
	public MyMessagePage(){
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void sendaMessage(String MsgTo, String subject, String msgsummery){
		
		messageto.sendKeys(MsgTo);
		subjectheading.clear();
		subjectheading.sendKeys(subject);
		messagesummery.sendKeys(msgsummery);
		clicksendmessageBtn.click();
		
		
	}

}
