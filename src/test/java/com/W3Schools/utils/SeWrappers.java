package com.W3Schools.utils;

import java.io.File;
import java.time.Duration;
import java.util.Set;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class SeWrappers
{
	public WebDriver driver=null;

	//Launch browser for the specified url
	//parameter-> url
	public void launchBrowser(String url)
	{
		try
		{
			driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			driver.get(url);

		}
		catch(Exception ex)
		{
			System.out.println("Problem in launching the browser");
			ex.printStackTrace();
		}
	}

	//method to close all the browsers
	public void closeAllBrowsers()
	{
		try
		{
			driver.quit();
		}
		catch(Exception ex)
		{
			System.out.println("Problem in closing all the browsers");
			ex.printStackTrace();
		}
	}

	//methods to close the current active browser
	public void closeBrowser()
	{
		try
		{
			driver.close();
		}
		catch(Exception ex)
		{
			System.out.println("Problem in closing the browser");
			ex.printStackTrace();
		}
	}

	//Navigate Back
	public void navigateBack()
	{
		try
		{
			driver.navigate().back();
		}
		catch(Exception ex)
		{
			System.out.println("Problem  to navigate back");	
			ex.printStackTrace();
		}
	}
	//Navigate Forward
	public void navigateForward()
	{
		try
		{
			driver.navigate().forward();
		}
		catch(Exception ex)
		{
			System.out.println("Problem  to navigate forward");	
			ex.printStackTrace();
		}
	}
	
	//Navigate Refresh
	public void navigateRefresh()
	{
		try
		{
			driver.navigate().refresh();
		}
		catch(Exception ex)
		{
			System.out.println("Problem  in refresh the window");	
			ex.printStackTrace();
		}
	}

	//SendKeys
	public void typeText(WebElement ele, String text)
	{
		try
		{
			waitForMe(ele,20);
			ele.clear();
			ele.sendKeys(text);
		}
		catch(Exception ex)
		{
			System.out.println("Problem in SendKeys typeText Method");
			ex.printStackTrace();
		}

	}
	//click method
	public void click(WebElement ele)
	{
		try
		{
			waitForMe(ele,20);
			ele.click();
		}
		catch(Exception ex)
		{
			System.out.println("Problem in click operation ");
			ex.printStackTrace();
		}
	}

	//WebDriverWait for Particular Element
	public void waitForMe(WebElement ele, int timeout)
	{
		try
		{
			WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(timeout));
			wait.until(ExpectedConditions.visibilityOf(ele));

		}
		catch(Exception ex)
		{
			System.out.println("Problem in to load Particular WebElement by WebDriver Wait");
			ex.printStackTrace();
		}
	}

	//Fluent Wait
	public void pollingWait(WebElement ele, int timeout, int pollingFrequency)
	{
		try
		{
			FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					.withTimeout(Duration.ofSeconds(timeout))
					.pollingEvery(Duration.ofSeconds(pollingFrequency));
			wait.until(ExpectedConditions.visibilityOfAllElements(ele));
		}
		catch(Exception ex)
		{
			System.out.println("Problem in to load Particular WebElement by Fluent Wait by polling Frequency");
			ex.printStackTrace();
		}
	}

	//select by visibletext for Dropdown
	public void selectByVisibleText(WebElement ele, String visibleText)
	{
		try
		{
			Select sel = new Select(ele);
			sel.selectByVisibleText(visibleText);
		}
		catch(Exception ex)
		{
			System.out.println("Problem in to see  Select dropdown by Visible text");
			ex.printStackTrace();
		}

	}

	//SelectbyIndex for DropDown
	public void selectByIndex(WebElement ele, int value)
	{
		try
		{
			Select sel = new Select(ele);
			sel.selectByIndex(value);
		}
		catch(Exception ex)
		{

			System.out.println("Problem in to see select dropdown by Index");
			ex.printStackTrace();
		}
	}

	//SelectByValue for DropDown
	public void selectByValue(WebElement ele, String value)
	{
		try
		{
			Select sel = new Select(ele);
			sel.selectByValue(value);
		}
		catch(Exception ex)
		{
			System.out.println("Problem in to see select dropdown by Value");
			ex.printStackTrace();
		}
	} 
	//acceptAlert means Yes we select that accpet button
	public void acceptAlert()
	{
		try
		{
			Alert promptAlert= driver.switchTo().alert();
			promptAlert.accept();
		}
		catch(Exception ex)
		{
			System.out.println("Problem in to Accept the Alert");
			ex.printStackTrace();
		}
	}
	//dismissAlert or cancel
	public void dismissAlert()
	{
		try
		{
			Alert promptAlert= driver.switchTo().alert();
			promptAlert.dismiss();
		}
		catch(Exception ex)
		{
			System.out.println("Problem in Dismiss the Alert");
			ex.printStackTrace();
		}
	}
	//getTxtFromAlert
	public void getTextmethodFromAlert()
	{
		try
		{
			Alert alert= driver.switchTo().alert();

			String alertText=alert.getText();
			System.out.println(alertText);

		}
		catch(Exception ex)
		{
			System.out.println("Problem in to get text Message from Alert");
			ex.printStackTrace();
		}
	}

	//typeTextInAlert
	public void typeTextmethod(String text)
	{
		try
		{
			Alert alert= driver.switchTo().alert();
			alert.sendKeys(text);
			alert.accept();

		}
		catch(Exception ex)
		{
			System.out.println("Problem in to Type text or send keys Message from Alert");
			ex.printStackTrace();
		}
	}

	//Frames
	public void frameByWebElement(WebElement ele)
	{
		try
		{
			driver.switchTo().frame(ele);

		}
		catch(Exception ex)
		{
			System.out.println("Problem in to switch Frame by WebElement");
			ex.printStackTrace();
		}
	}
	//FrameByIndex
	public void frameByIndex(int frame)
	{
		try
		{
			driver.switchTo().frame(frame);

		}
		catch(Exception ex)
		{
			System.out.println("Problem in to switch Frame by index");
			ex.printStackTrace();
		}
	}

	//FrameByName or Value
	public void frameByIndex(String nameOrId)
	{
		try
		{
			driver.switchTo().frame(nameOrId);

		}
		catch(Exception ex)
		{
			System.out.println("Problem in to switch Frame by Name or Value");
			ex.printStackTrace();
		}
	}

	public boolean verifySelected(WebElement ele)
	{
		boolean retVal=false;
		try
		{
			if(ele.isSelected())
			{
				retVal=true;
				System.out.println("Element is selected");
			}
			else
			{
				retVal=false;
				System.out.println("Element is not selected");
			}
		}
		catch(Exception ex)
		{
			System.out.println("Problem in Verify Selected Method");
			ex.printStackTrace();
		}
		return retVal;
	}

	//isEnabled
	public boolean verifyEnabled(WebElement ele)
	{
		boolean retVal=false;
		try
		{
			if(ele.isSelected())
			{
				retVal=true;
				System.out.println("Element is Enabled");
			}
			else
			{
				retVal=false;
				System.out.println("Element is not Enabled");
			}
		}
		catch(Exception ex)
		{
			System.out.println("Problem in Verify Enabled Method");
			ex.printStackTrace();
		}
		return retVal;
	}

	//isDisplayed
	public boolean verifyDisplayed(WebElement ele)
	{
		boolean retVal=false;
		try
		{
			if(ele.isSelected())
			{
				retVal=true;
				System.out.println("Element is Displayed");
			}
			else
			{
				retVal=false;
				System.out.println("Element is not Displayed");
			}
		}
		catch(Exception ex)
		{
			System.out.println("Problem in Verify Displayed Method");
			ex.printStackTrace();
		}
		return retVal;
	}

	//Action click
	public void actionClick(WebElement ele)
	{
		try
		{
			Actions act = new Actions(driver);
			act.click(ele).build().perform();
		}
		catch(Exception ex)
		{
			System.out.println("Problem in actionClick Method");
			ex.printStackTrace();
		}
	}

	//Action Right Click
	public void rightClick(WebElement ele)
	{
		try
		{
			Actions act = new Actions(driver);
			act.contextClick(ele).build().perform();
		}
		catch(Exception ex)
		{
			System.out.println("Problem in rightClick Method");
			ex.printStackTrace();
		}
	}

	//Action Drag and Drop
	public void dragAndDrop(WebElement source, WebElement target)
	{
		try
		{
			Actions act = new Actions(driver);
			act.dragAndDrop(source, target).build().perform();
		}
		catch(Exception ex)
		{
			System.out.println("Problem in Drag ang Drop Method");
			ex.printStackTrace();
		}
	}

	//clickAndHold
	public void clickAndHold(WebElement ele)
	{
		try
		{
			Actions act = new Actions(driver);
			act.clickAndHold(ele).build().perform();
		}
		catch(Exception ex)
		{
			System.out.println("Problem in clickAndHold Method");
			ex.printStackTrace();
		}
	}
	//docubleClick
	public void doubleClick(WebElement ele)
	{
		try
		{
			Actions act = new Actions(driver);
			act.doubleClick(ele).build().perform();
		}
		catch(Exception ex)
		{
			System.out.println("Problem in Double Method");
			ex.printStackTrace();
		}
	}
	//moveToElement
	public void moveToElement(WebElement ele)
	{
		try
		{
			Actions act = new Actions(driver);
			act.moveToElement(ele).build().perform();
		}
		catch(Exception ex)
		{
			System.out.println("Problem in moveToElement Method");
			ex.printStackTrace();
		}
	}

	//Keyboard actions keyDown UpperCase

	public void upperCaseByKeyBoard(WebElement ele , String text)
	{
		try 
		{
			Actions act = new Actions(driver);
			act.keyDown(ele,Keys.SHIFT).sendKeys(text).build().perform();	
		}
		catch(Exception ex)
		{
			System.out.println("Problem in upper case by keyBoard");
			ex.printStackTrace();
		}
	}

	//Keyboard actions keyUp LowerCase
	public void lowerCaseByKeyBoard(WebElement ele , String text)
	{
		try 
		{
			Actions act = new Actions(driver);
			act.keyUp(ele,Keys.SHIFT).sendKeys(text).build().perform();	
		}
		catch(Exception ex)
		{
			System.out.println("Problem in lower case by keyBoard");
			ex.printStackTrace();
		}
	}

	//Vertical Scroll
	public void jsVerticalScroll(int y)
	{
		try
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo(0,"+y+";)");

		}
		catch(Exception ex)
		{
			System.out.println("Problem in verticalScroll down Method");
			ex.printStackTrace();
		}
	}
	//Horizontal Scroll
	public void jsHorizontalScroll(int x)
	{
		try
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("window.scrollTo("+x+",0);");

		}
		catch(Exception ex)
		{
			System.out.println("Problem in HorizontalScroll  Method");
			ex.printStackTrace();
		}
	}


	//jsClick
	public void jsClick(WebElement ele)
	{
		try
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("argument[0].click();", ele);	
		}
		catch(Exception ex)
		{
			System.out.println("Problem in Click By javaScript Method");
			ex.printStackTrace();

		}
	}
	//jstitle
	public void jaTitle()
	{
		try
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			System.out.println(	js.executeAsyncScript("return document.title"));
		}
		catch(Exception ex)
		{
			System.out.println("Problem in To get Title By JavaScript Exceutor Method");
			ex.printStackTrace();

		}
	}
	//typeTextwithout snedkeys
	public void sendKeysWithoutSendKeys(WebElement ele,String text) 
	{
		try 
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("argument[0],value="+text+";", ele);
		}
		catch(Exception e)
		{
			System.out.println("Problem in to sendKeys By JavScript method");
			e.printStackTrace();
		}
	}

	//scrollintoview

	public void jsScrollIntoView(WebElement ele) 
	{
		try 
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("argument[0],scrollIntoView(true);",ele );

		}
		catch(Exception e)
		{
			System.out.println("Problem in To ScrollInto View by JavaScript Exceutor Method");
			e.printStackTrace();
		}
	}

	//Scroll Top of the page

	public void topOfThePage()
	{
		try
		{
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("window,scrollTo(0,0);");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//Scroll Bottom of the WebPage
	public void scrollBottomOfThePage()
	{
		try
		{
			JavascriptExecutor js=((JavascriptExecutor)driver);
			js.executeScript("window,scrollTo(0,document.body.scrollHeight);");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	//Windows Handling
	public void switchWindows()
	{
		try
		{
			String parentWindow= driver.getWindowHandle();
			Set<String> allWindows= driver.getWindowHandles();

			for(String eachWindow:allWindows)
			{
				if(! parentWindow.equals(eachWindow))
				{
					driver.switchTo().window(eachWindow);
				}
			}

		}
		catch(Exception ex)
		{
			System.out.println("Problem in Switching Windows");
			ex.printStackTrace();
		}
	}

	//getCurrentUrl

	public void getUrlCurrent()
	{
		try
		{
			driver.getCurrentUrl();
		}
		catch(Exception ex)
		{
			System.out.println("Problem in getting current Url");
		}
	}

	//get Title

	//get Title
		public String getTitle()
		{
			String title="";
			try
			{
			title=driver.getTitle();
			System.out.println(title);
			}
			catch(Exception ex)
			{
				System.out.println("problem in getTitle method");
				ex.printStackTrace();
			}
			return title;
		}

	
	public void screenshot(String screenshotName)
	{
		try
		{
			File source= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest= new File(System.getProperty("user.dir")+"/screenshots/"+screenshotName+".png");
			FileUtils.copyFile(source, dest);
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
	

}


