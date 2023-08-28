package com.W3Schools.utils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.W3Schools.pages.HomePage;
import com.W3Schools.pages.LoginPage;
import com.W3Schools.pages.ProfilePage;
import com.W3Schools.pages.MyLearningPage;
import com.W3Schools.pages.CertificatePage;
import com.W3Schools.pages.CertificationAssertPage;
public class W3Wrappers extends SeWrappers
{

	
		SeWrappers se= new SeWrappers();
		private WebElement saveButton;
		private WebElement saveBtn;
		
		//This class would contain all the reusable methods for W3Schools application
		
		public void loginW3Schools(String mailid, String pwd)
		{
			try
			{
				LoginPage lpPage= PageFactory.initElements(driver, LoginPage.class);
				HomePage home= PageFactory.initElements(driver, HomePage.class);
				
				lpPage.setEmail(mailid);
				lpPage.setPassword(pwd);
				lpPage.clickLogin();
				
				home.waitForLearning();
				
				
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		
		public void profilePage()
		{
			try {
			ProfilePage pfPage=PageFactory.initElements(driver, ProfilePage.class);
			se.frameByname("classic-menu");
			pfPage.clickProfile();
			driver.switchTo().defaultContent();
			pfPage.firstName("Komal");
			pfPage.lasttName("Nikame");
			pfPage.checkBox();
			se.waitForMeExplicit(saveBtn, 20);
			pfPage.saveBtn();
			pfPage.editButton();
			pfPage.urlText("NA");
			pfPage.saveButton();
	     	se.waitForMeExplicit(saveButton, 20);
			pfPage.bioTetx("NA");
			pfPage.phoneNo("9237118829");
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
		
		
		
		public void myLearning(String search)
		{
			try 
			{
				MyLearningPage mlPage=PageFactory.initElements(driver, MyLearningPage.class);
				mlPage.browse();
				mlPage.search(search);
				mlPage.clickLearnJava();
				mlPage.clickPracticeButton();
				
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}

		public void certificatePage(String str)
		{
			try
			{
				CertificatePage cPage=PageFactory.initElements(driver, CertificatePage.class);
				CertificationAssertPage caPage=PageFactory.initElements(driver, CertificationAssertPage.class);
				se.frameByname("classic-menu");
				cPage.certificate();
				cPage.browseExam();
				se.switchWindows();
				cPage.searchText(str);
				cPage.clickCerti();
				
				 caPage.getText();
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
			}
		}
	}


