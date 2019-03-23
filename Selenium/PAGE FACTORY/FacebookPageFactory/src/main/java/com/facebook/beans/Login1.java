package com.facebook.beans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1 {

	WebDriver driver;

	@FindBy(name = "email")
	WebElement mobile;

	@FindBy(name = "pass")
	WebElement password;

	@FindBy(name = "login")
	WebElement loginpage;

	public Login1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public void setMobile(String Mobile) {
		mobile.sendKeys(Mobile);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String Password) {
		password.sendKeys(Password);
	}

	public WebElement getLoginpage() {
		return loginpage;
	}

	public void setLoginpage() {
		loginpage.click();
	}

}
