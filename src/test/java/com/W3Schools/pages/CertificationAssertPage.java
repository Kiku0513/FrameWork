package com.W3Schools.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CertificationAssertPage
{
	@FindBy(xpath="//h1[@class='product-title']")
	static
	WebElement text;
	
	public static void getText()
	{
		text.getText();
	}
}
