package org.EnterpriseSSP.TestCase;

import java.util.ResourceBundle;

import org.EnterpriseSSP.Base.BaseData;
import org.EnterpriseSSP.Page.LoginPage;
import org.EnterpriseSSP.Utils.CommonMethods;
import org.testng.annotations.Test;

public class TC_Login extends BaseData{
    
	

	
	@Test
	public void TC_001() {
		
		
		LoginPage login = new LoginPage(driver);
		login.LoginToSystem();
		
		
//		login.EnterUsername(resource.getString("user_name"));
//		login.EnterPassword(resource.getString("user_password"));
//        login.ClickOnSingIn();
	}
	
	
	
	
   
	
	
}
