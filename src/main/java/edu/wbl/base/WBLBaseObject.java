package edu.wbl.base;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import edu.wbl.page.DemoPage;
import edu.wbl.page.FAQPage;
import edu.wbl.page.HomePage;
import edu.wbl.page.RecordingPage;
import edu.wbl.page.SchedulePage;

public class WBLBaseObject {
	
	// page factory to be used
	protected WebDriver driver;
    SocialLinks header;
    WebElement logo;
    WebElement home ;
	WebElement login;
	WebElement schedule;
	WebElement demo;
	WebElement recording;
	WebElement fqa;
	//WebElement freeStudentAccess; 
	//WebElement WBLPageLink;
	
	SocialLinks footer;
	
	ContactDetail con_header;
	ContactDetail con_footer;
	
	
	
	
	public WBLBaseObject(WebDriver driver) {
		this.driver = driver;
	}
	public HomePage logoClick() {
		logo = driver.findElement(By.xpath("//*[@id=\'logo\']"));
		clickObj(logo,"logo");
		return new HomePage(driver);
	}
	public HomePage homeClick() {
		home = driver.findElement(By.xpath("//*[@id=\'navbar-collapse\']/ul/li[1]/a"));
		clickObj(home, "homescreen");
		return new HomePage(driver);
	

	}

	public SchedulePage scheduleClick() {
		schedule = driver.findElement(By.xpath("//*[@id='navbar-collapse']/ul/li[2]/a"));
		clickObj(schedule, "Schedulescreen");
		return new SchedulePage(driver);
	}
	
	public RecordingPage recordingPage() {
		recording = driver.findElement(By.xpath("//*[@id=\'navbar-collapse\']/ul/li[4]/a"));
		return new RecordingPage(driver);
		
	}
	public DemoPage demoClick() {
		demo = driver.findElement(By.xpath("//*[@id=\'navbar-collapse\']/ul/li[3]/a"));
		return new DemoPage(driver);
		
		
	}
	
	public FAQPage fqaClick() {
		fqa = driver.findElement(By.xpath("//*[@id=\'navbar-collapse\']/ul/li[5]/a"));
		return new FAQPage(driver);
		
	}

	public static void enterText(WebElement obj, String textVal, String objName) throws IOException {
		if (obj.isDisplayed()) {
			obj.sendKeys(textVal);
			// Update_Report("Pass","enterText", textVal + " is entered in " +objName);
			System.out.println("Pass: " + textVal + " is entered in " + objName);
		} else {
			// Update_Report("Fail","enterText", objName + " field is not displayed, please
			// check your application.");
			System.out.println("Fail: " + objName + " field is not displayed, please check your application.");
		}

	}

	public static void clickObj(WebElement obj, String objName) {
		if (obj.isDisplayed()) {
			obj.click();
			System.out.println("Pass: " + objName + " is clicked.");
		} else {
			System.out.println("Fail: " + objName + " is not displayed, please check your application");
		}
	}

	public static void validateMsg(WebElement obj, String expectedText, String objName) {
		if (obj.isDisplayed()) {
			String actualText = obj.getText().trim();
			if (expectedText.equals(actualText)) {
				System.out.println("Pass: Actual message is matching with expected message " + actualText);
			} else {
				System.out.println("Fail: Actual message '" + actualText + "' is not matching with expected message '"
						+ expectedText + "'  ,Please check your application");
			}
		} else {
			System.out.println("Fail: " + objName + " is not displayed, please check your application");
		}
	}
}


