package com.W3Schools.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.W3Schools.utils.SeWrappers;

public class CertificatePage extends SeWrappers
{
	@FindBy(xpath="//a[text()='Certificates']")
	WebElement certificatebtn;

	@FindBy(xpath="//span[contains(text(),'Browse exams')]")
	WebElement browseExam;

	@FindBy(name="q")
	WebElement search;

	@FindBy(xpath="//img[@alt='Java Certification Exam']")
	WebElement clickCertificate;




	public void certificate()
	{
		click(certificatebtn);
	}

	public void browseExam()
	{
		click(browseExam);
	}
	public void searchText(String str)
	{
		typeText(search,str);
	}

	public void clickCerti()
	{
		click(clickCertificate);
	}
}
