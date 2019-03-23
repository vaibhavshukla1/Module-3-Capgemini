package com.amazon.Bean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login1 {

	WebDriver driver;

	@FindBy(name = "email")
	WebElement mobile;

	@FindBy(id = "continue")
	WebElement next;

	public Login1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getMobile() {
		return mobile;
	}

	public void setMobile(String Mobile) {
		mobile.sendKeys(Mobile);
	}

	public WebElement getNext() {
		return next;
	}

	public void setNext() {
		next.click();
	}

}
