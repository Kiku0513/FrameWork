package com.W3Schools.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.W3Schools.utils.W3Wrappers;
import com.W3Schools.pages.CertificatePage;
import com.W3Schools.utils.Reports;
import com.W3Schools.utils.SeWrappers;

public class CertificateTest  extends SeWrappers
{
	W3Wrappers w3=new W3Wrappers();
	SeWrappers se= new SeWrappers();

	@Test
	public void clickOnCertiFicates()
	{
		try
		{
			Reports.setTCDesc("Validating login functionality with valid credentials");
			launchBrowser("https://profile.w3schools.com/");
			LoginTest lg=new LoginTest();
			lg.loginWithValidCredentials();
			w3.certificatePage("Learn Java");
			String Expected="Java Certification Exam";
			Assert.assertEquals("Java Certification Exam", Expected);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
}
}