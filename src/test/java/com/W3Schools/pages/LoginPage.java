package com.W3Schools.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.W3Schools.utils.SeWrappers;
public class LoginPage extends SeWrappers
{

	//Stored all the webelements inside the page class
	@FindBy(name="email")
	WebElement email;

	@FindBy(id="current-password")
	WebElement password;

	@FindBy(xpath="//span[text()='Log in']")
	WebElement login;

	//converting all the user actions in that specific page into user defined methods

	public void setEmail(String emailId)
	{
		typeText(email,emailId);
	}

	public void setPassword(String pwd)
	{
		typeText(password,pwd);
	}

	public void clickLogin()
	{
		click(login);
	}



}

