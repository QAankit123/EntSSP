package org.EnterpriseSSP.Base;

import java.util.ResourceBundle;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseData {
    
	public WebDriver driver;
	@BeforeMethod
	@Parameters("browser")
	public void initiateBrowser(String browser_name) throws InterruptedException {
	//to read the data from property file
	ResourceBundle bundle = ResourceBundle.getBundle("Config");
	
	if(browser_name.equalsIgnoreCase("Chrome"))
	{
	WebDriverManager.chromedriver().setup();
	
	driver=new ChromeDriver();
	}
	
	else if(browser_name.equalsIgnoreCase("Firefox"))
	{
		
	WebDriverManager.firefoxdriver().setup();
	
	driver=new FirefoxDriver();
		
	}
	//passing application URL from config file.
	driver.get(bundle.getString("Application_URl"));
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	Thread.sleep(4000);
	
	System.out.println("Before has executed");
	
// test
	}
	
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
		System.out.println("After method has executed");
       
	}
	
	
}
     