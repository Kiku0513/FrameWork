package com.W3Schools.test;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.W3Schools.utils.W3Wrappers;
import com.W3Schools.utils.Reports;
import com.W3Schools.utils.SeWrappers;

public class LoginTest extends SeWrappers
{
	W3Wrappers w3=new W3Wrappers();
	SeWrappers se= new SeWrappers();

	@Test
	public void loginWithValidCredentials()
	{
		try
		{
			Reports.setTCDesc("Validating login functionality with valid credentials");
			launchBrowser("https://profile.w3schools.com/");
			w3.loginW3Schools("bv.nirmal@gmail.com","Testing@123");
			String pageTitle="My learning | W3Schools";
			String actualTitle=se.getTitle();
			Assert.assertTrue(driver.getTitle().equals(pageTitle));
			//Assert.assertEquals(actualTitle,pageTitle);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	
	@Test
	public void loginWithInvalidEmail()
	{
		try
		{
			Reports.setTCDesc("Valid login functionality with invalid username");
			launchBrowser("https://profile.w3schools.com/");
			w3.loginW3Schools("bv.nirmal23333444@gmail.com","Testing@123");
			/*
			 * write the assertion code to validate for invalid email
			 */
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			Reports.reportStep("FAIL", "Problem while login");
		}
	}

}
