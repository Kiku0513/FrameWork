    package com.W3Schools.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.W3Schools.utils.SeWrappers;



public class HomePage extends SeWrappers 
{



	@FindBy(xpath="//div[text()='My learning']")
	WebElement myLearning;

	public void waitForLearning()
	{
		waitForMe(myLearning,20);
	}

}


