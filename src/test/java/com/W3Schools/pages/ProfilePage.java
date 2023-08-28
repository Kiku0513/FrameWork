package com.W3Schools.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.W3Schools.utils.SeWrappers;

public class ProfilePage extends SeWrappers
{
	@FindBy(xpath="//a[text()='Profile']")
	WebElement profileButton;
	
	//1
	@FindBy(xpath="//input[@placeholder='Add your first name']")
	WebElement firstName;

	//2
	@FindBy(xpath="//input[@placeholder='Add your last name']")
	WebElement lastName;

	//3
	@FindBy(xpath="//span[@class='CheckBox_checkmark__9k9fk']")
	WebElement checkbox;

	//4
	@FindBy(xpath="//div[@class='Button_wrapper__lGxfQ'][1]")
	WebElement firstSaveButon;

	//5
	@FindBy(xpath="//span[contains(text(),'Edit')]")
	WebElement EditButton;

	//6
	@FindBy(xpath="//div[@class='PublicProfile_wrapper__1ZB8C SettingsPage_new_profile__Yj+2y']//input[@class='InputItem_item__Ebrl2'][1]")
	WebElement UrlText;

	//7
	@FindBy(xpath="//div[@class='Nick_url_wrapper__7V10D']//span[contains(text(),'Save')]")
	WebElement saveButton;

	//put webWait
//8
	@FindBy(xpath="//textarea[@placeholder='text here...']")
	WebElement Bio;

	//9
	@FindBy(xpath="//input[@placeholder='(+) number']")
	WebElement PhoneNo;

	//10
	@FindBy(xpath="//div[@class='InputItem_input_wrapper__Tv9Ui']//input[@placeholder='Username'][1]")
	WebElement Username;

	
	//put Waits

	
	
	//Interactions Methods
	
	public void clickProfile()
	{
		click(profileButton);
	}

	public void firstName(String fName)
	{
		typeText(firstName,fName);
	}

	public void lasttName(String lName)
	{
		typeText(lastName,lName);
	}
	public void checkBox() 
	{
	click(checkbox);	
	}
	
	public void saveBtn()
	{
		click(firstSaveButon);
	}
	public void editButton()
	{
		click(EditButton);
	}

	public void urlText(String urlText)
	{
		typeText(UrlText,urlText);
	}
	public void saveButton()
	{
		click(saveButton);
	}

	public void bioTetx(String bio)
	{
		typeText(Bio,bio);
	}

	public void phoneNo(String phoneNo)
	{
		typeText(PhoneNo,phoneNo);
	}

	
}
