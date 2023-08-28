package com.W3Schools.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.W3Schools.utils.SeWrappers;

public class MyLearningPage extends SeWrappers
{

	@FindBy(xpath="//button[contains(text(),'Browse tutorials')]")
	WebElement BrowseTutorial;

	@FindBy(xpath="//input[@type='search']")
	WebElement Search;
	
	@FindBy(xpath="//div[@aria-label='Learn Java']//div[@class='TutorialCard_cardBody__mWuUz card-body']")
	WebElement learnJavaClick;
	
	@FindBy(xpath="//div[@class='TopicHeader_actions__pLjWv']//button[@aria-label='practice code']")
	WebElement practicebtn;
	
	
	public void browse()
	{
		click(BrowseTutorial);
	}
	
	
	public void search(String str)
	{
		typeText(Search,str);
	}
	
	public void clickLearnJava()
	{
		click(learnJavaClick);
	}
	
	public void clickPracticeButton()
	{
		click(practicebtn);
	}

}