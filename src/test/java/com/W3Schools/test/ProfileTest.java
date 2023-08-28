package com.W3Schools.test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.W3Schools.utils.Reports;
import com.W3Schools.utils.SeWrappers;
import com.W3Schools.utils.W3Wrappers;

public class ProfileTest extends W3Wrappers
{
	W3Wrappers w3=new W3Wrappers();
	SeWrappers se=new SeWrappers();
	@Test

	public void profilePage()
	{
		try
		{
			Reports.startReport();
			Reports.setTCDesc("Validating Profile Section");
			LoginTest lg=new LoginTest();
			lg.loginWithValidCredentials();
			w3.profilePage();
			//se.closeBrowser();

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}



	}


}
