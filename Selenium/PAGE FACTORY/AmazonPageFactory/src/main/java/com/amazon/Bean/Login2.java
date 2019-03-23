package com.amazon.Bean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login2 {

	WebDriver driver;

	public Login2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "password")
	WebElement password;

	@FindBy(id = "signInSubmit")
	WebElement signin;

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String Password) {
		password.sendKeys(Password);
	}

	public WebElement getSignin() {
		return signin;
	}

	public void setSignin() {
		signin.click();
	}

}
