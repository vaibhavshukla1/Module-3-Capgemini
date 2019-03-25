package com.hotelBooking.Beans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	@FindBy(name = "userName")
	WebElement userloginname;

	@FindBy(name = "userPwd")
	WebElement userloginpassword;

	@FindBy(xpath = "//*[@id=\"mainCnt\"]/div/div[1]/form/table/tbody/tr[4]/td[2]/input")
	WebElement next;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUserloginname() {
		return userloginname;
	}

	public void setUserloginname(String Userloginname) {
		userloginname.sendKeys(Userloginname);
	}

	public WebElement getUserloginpassword() {
		return userloginpassword;
	}

	public void setUserloginpassword(String Userloginpassword) {
		userloginpassword.sendKeys(Userloginpassword);
	}

	public WebElement getNext() {
		return next;
	}

	public void setNext() {
		next.click();
	}

}
