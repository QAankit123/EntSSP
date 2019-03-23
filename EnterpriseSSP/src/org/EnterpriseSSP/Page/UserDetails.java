package org.EnterpriseSSP.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserDetails {

	WebDriver driver;
	
	public UserDetails(WebDriver driver)
	{
		this.driver=driver;
	}
	
	 public void Verify_UserDetails() {
	 driver.findElement(By.xpath("//h1[@class='cn-ico-user']"));
	 
	}
	
}
