package org.EnterpriseSSP.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SelfServicePage {

	WebDriver driver;
	
	public SelfServicePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void VerifySelfServiceLink() {
		
      driver.findElement(By.xpath("//a[text()='Go to Self Service']"));
      
	}
}
