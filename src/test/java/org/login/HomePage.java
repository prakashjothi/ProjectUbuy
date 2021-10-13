package org.login;

import org.baseclass.BaseClassProjectEcom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClassProjectEcom{
	
	public HomePage() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "acoount-manage")
	private WebElement linkAccountManage;
	
	@FindBy(xpath="//a[text()=normalize-space('Sign in')]")
	private WebElement linkSignIn;
	
	

	public WebElement getLinkAccountManage() {
		return linkAccountManage;
	}

	public WebElement getLinkSignIn() {
		return linkSignIn;
	}

	
	
	
	

}
