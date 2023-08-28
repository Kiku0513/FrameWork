package com.W3Schools.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.W3Schools.utils.Reports;
import com.W3Schools.utils.SeWrappers;
import com.W3Schools.utils.W3Wrappers;

public class MyLearningTest extends SeWrappers
{
	W3Wrappers w3=new W3Wrappers();
	SeWrappers se= new SeWrappers();

	
	@Test
	
	public void validatingMyLearning()
	{
		
		try
		{
			Reports.setTCDesc("Validating  My Learning From W3Schools");
			LoginTest lg=new LoginTest();
			lg.loginWithValidCredentials();
		     w3.myLearning("Learn Java");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			System.out.println("Fail to validate the My Learning Profile");
		}
	}

}
