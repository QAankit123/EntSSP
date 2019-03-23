package org.EnterpriseSSP.Page;

import java.util.ResourceBundle;

import org.EnterpriseSSP.Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class LoginPage {
    
    WebDriver driver;
    CommonMethods cmd= new CommonMethods(driver);
    @FindBy(id="txtUserName")
	WebElement username;
	@FindBy(xpath="//input[@name='txtPassword']")
	WebElement password;
	@FindBy(xpath="//input[@name='btnLogin']")
	WebElement loginbtn;
	ResourceBundle bundle = ResourceBundle.getBundle("Config");
	public LoginPage(WebDriver driver){
		
	this.driver=driver;
	}
	
	
	public void LoginToSystem() {
		  
		driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys(bundle.getString("user_name"));
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(bundle.getString("user_password"));
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

		}
	
//	public void EnterUsername(String username) {
//		
//     driver.findElement(By.xpath("//input[@name='txtUserName']")).sendKeys(username);	
//	} 
//	public void EnterPassword(String password) {
//		
//	driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(password);
//	}
//	public void ClickOnSingIn() {
//		
//		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
//		
//		cmd.waitforElement("//a[text()='Go to app']", 15);
//	}
        
	
}

