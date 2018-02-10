package edu.wbl.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



import edu.wbl.base.WBLBaseObject;

public class LoginPage extends WBLBaseObject{
	WebElement UN ;
	WebElement pwd;
	WebElement login ;
	
	
	public LoginPage(WebDriver driver) {
		super(driver);
	}

	public String login(String username, String password) throws IOException {
		driver.findElement(By.xpath("//*[@id=\'loginButton\']")).click();
		UN = driver.findElement(By.xpath("//*[@id=\'username\']"));
		enterText(UN, username, "Username Field");
		pwd = driver.findElement(By.xpath("//*[@id=\'password\']"));
		enterText(pwd, password, "PassWord Field");

		login = driver.findElement(By.xpath("//*[@id=\'login\']"));
		clickObj(login, "Login");

		return driver.getTitle();

	}

}
