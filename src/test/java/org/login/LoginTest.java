package org.login;

import org.baseclass.BaseClassProjectEcom;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends BaseClassProjectEcom{
	
	@BeforeMethod
	private void beforeMethod() {

		launchBrowser("chrome");
		launchURL("https://www.ubuy.com.sg/");

	}
	
	@Test
	private void login() {
		
		HomePage hp = new HomePage();
		hp.getLinkAccountManage().click();
		hp.getLinkSignIn().click();
		
		LoginPage lp = new LoginPage();
		lp.getTxtboxUsername().sendKeys("prakashjothi22@gmail.com");
		lp.getTxtboxPassword().sendKeys("selenium123");
		lp.getBtnLogin().click();

	}
	
	
	
	

}
