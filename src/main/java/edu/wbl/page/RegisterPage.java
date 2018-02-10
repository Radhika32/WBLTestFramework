package edu.wbl.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
import edu.wbl.base.WBLBaseObject;

public class RegisterPage extends WBLBaseObject {
	WebElement username1;
	WebElement password1;
	WebElement fullname1;
	WebElement phone1;
	WebElement address1;
	WebElement city1;
	WebElement zipcode1;
	WebElement message1;
	
	

public RegisterPage(WebDriver driver) {
	super(driver);}

	
	public String register(String username, String password, String fullname, String phone, String address, String city, String zip, String msg ) throws IOException
		{
		////  Page Factory to be implemented for web elements......
		username1= driver.findElement(By.xpath("//*[@id=\'registerform\']/div[1]/input"));
		enterText(username1, username, "Username Field");
		password1= driver.findElement(By.xpath("//*[@id=\'registerform\']/div[2]/input"));
		enterText(password1, password, "Password Field");
		fullname1= driver.findElement(By.xpath("//*[@id=\'registerform\']/div[3]/input"));
		enterText(fullname1, fullname, "UserName Field");
		phone1=driver.findElement(By.xpath("//*[@id=\'registerform\']/div[4]/input"));
		enterText(phone1, phone, "Phone Field");
		address1= driver.findElement(By.xpath("//*[@id=\'registerform\']/div[4]/input"));
		enterText(address1, address, "Address Field");
		city1=driver.findElement(By.xpath("//*[@id='registerform']/div[5]/input"));
		enterText(city1, city, "city Field");
		zipcode1= driver.findElement(By.xpath("//*[@id='registerform']/div[6]/input"));
		enterText(zipcode1, zip, "ZipCode Field");
		message1=driver.findElement(By.xpath("//*[@id=\'registerform\']/div[7]/input"));
		enterText(message1, msg , "Message Field");
		/// select country.
		//WebElement country=driver.findElement(By.xpath("//*[@id=\"registerform\"]/div[8]/select"));
		
//		Select select3=new Select(country);
//		select3.selectByVisibleText(cty);
//		WebElement add= driver.findElement(By.xpath("//*[@id='colselector_select_0_right']/img"));
//		add.click();
		
		driver.findElement(By.xpath("//*[@id='registerform']/button")).click();
	    return driver.getTitle();
		
	}
	
}


