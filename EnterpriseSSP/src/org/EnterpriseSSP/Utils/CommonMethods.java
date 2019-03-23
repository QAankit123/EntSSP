package org.EnterpriseSSP.Utils;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods {

	WebDriver driver;
	ResourceBundle bundle = ResourceBundle.getBundle("Config");
	public void waitforElement(String xpath,int timeInSecond) {
		
     WebDriverWait wait = new WebDriverWait(driver,timeInSecond);
     WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
     Boolean status =element.isDisplayed();
     System.out.println(element.getText()+ " "+status);
     
	}
	
	public CommonMethods(WebDriver driver){
		 
		this.driver=driver;
	}
	
	public void LoginToSystem() {
	  
	driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys(bundle.getString("user_name"));
	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(bundle.getString("user_password"));
	driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

	}
}
