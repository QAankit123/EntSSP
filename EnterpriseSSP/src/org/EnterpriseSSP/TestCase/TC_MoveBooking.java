package org.EnterpriseSSP.TestCase;

import org.EnterpriseSSP.Base.BaseData;
import org.EnterpriseSSP.Page.LoginPage;
import org.testng.annotations.Test;

public class TC_MoveBooking extends BaseData {

	LoginPage objLoginPage= new LoginPage(driver);
	@Test
	public void Tc_002() {
	objLoginPage.LoginToSystem();
	

	}
	
}
