package org.login;

import org.baseclass.BaseClassProjectEcom;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClassProjectEcom {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="login.username")
	private WebElement txtboxUsername;
	
	@FindBy(id="login.password")
	private WebElement txtboxPassword;
	
	@FindBy(xpath="//button[text()=normalize-space('Login')]")
	private WebElement btnLogin;
	
	public WebElement getTxtboxUsername() {
		return txtboxUsername;
	}

	public WebElement getTxtboxPassword() {
		return txtboxPassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}
}
