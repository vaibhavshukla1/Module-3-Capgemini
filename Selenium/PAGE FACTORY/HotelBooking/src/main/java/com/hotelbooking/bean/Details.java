package com.hotelbooking.bean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Details {

	WebDriver driver;

	public Details(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "txtFirstName")
	WebElement firstname;

	@FindBy(name = "txtLN")
	WebElement lastname;

	@FindBy(name = "Email")
	WebElement useremail;

	@FindBy(name = "Phone")
	WebElement mobile;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[6]/td[2]/textarea")
	WebElement address;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[7]/td[2]/select/option[2]")
	WebElement pune;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[7]/td[2]/select/option[3]")
	WebElement banglore;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[7]/td[2]/select/option[4]")
	WebElement chennai;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[7]/td[2]/select/option[5]")
	WebElement hyderabad;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[8]/td[2]/select/option[2]")
	WebElement maharashtra;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[8]/td[2]/select/option[3]")
	WebElement karnataka;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[8]/td[2]/select/option[4]")
	WebElement tamilnadu;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[8]/td[2]/select/option[5]")
	WebElement telangana;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[10]/td[2]/select/option[2]")
	WebElement two;

	@FindBy(id = "txtCardholderName")
	WebElement cardholdrer;

	@FindBy(id = "txtDebit")
	WebElement cardnumber;

	@FindBy(id = "txtCvv")
	WebElement cvv;

	@FindBy(id = "txtMonth")
	WebElement expirymonth;

	@FindBy(id = "txtYear")
	WebElement expiryyear;

	@FindBy(id = "btnPayment")
	WebElement submit;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public void setFirstname(String Firstname) {
		firstname.sendKeys(Firstname);
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(String Lastname) {
		lastname.sendKeys(Lastname);
	}

	public WebElement getUseremail() {
		return useremail;
	}

	public void setUseremail(String Useremail) {
		useremail.sendKeys(Useremail);
	}

	public WebElement getMobile() {
		return mobile;
	}

	public void setMobile(String Mobile) {
		mobile.sendKeys(Mobile);
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(String Address) {
		address.sendKeys(Address);
	}

	public WebElement getPune() {
		return pune;
	}

	public void setPune() {
		pune.click();
	}

	public WebElement getBanglore() {
		return banglore;
	}

	public void setBanglore() {
		banglore.click();
	}

	public WebElement getChennai() {
		return chennai;
	}

	public void setChennai() {
		chennai.click();
	}

	public WebElement getHyderabad() {
		return hyderabad;
	}

	public void setHyderabad() {
		hyderabad.click();
	}

	public WebElement getMaharashtra() {
		return maharashtra;
	}

	public void setMaharashtra() {
		maharashtra.click();
	}

	public WebElement getKarnataka() {
		return karnataka;
	}

	public void setKarnataka() {
		karnataka.click();
	}

	public WebElement getTamilnadu() {
		return tamilnadu;
	}

	public void setTamilnadu() {
		tamilnadu.click();
	}

	public WebElement getTelangana() {
		return telangana;
	}

	public void setTelangana() {
		telangana.click();
	}

	public WebElement getTwo() {
		return two;
	}

	public void setTwo() {
		two.click();
	}

	public WebElement getCardholdrer() {
		return cardholdrer;
	}

	public void setCardholdrer(String CardHoldrer) {
		cardholdrer.sendKeys(CardHoldrer);
	}

	public WebElement getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(String Cardnumber) {
		cardnumber.sendKeys(Cardnumber);
	}

	public WebElement getCvv() {
		return cvv;
	}

	public void setCvv(String Cvv) {
		cvv.sendKeys(Cvv);
	}

	public WebElement getExpirymonth() {
		return expirymonth;
	}

	public void setExpirymonth(String Expirymonth) {
		expirymonth.sendKeys(Expirymonth);
	}

	public WebElement getExpiryyear() {
		return expiryyear;
	}

	public void setExpiryyear(String Expiryyear) {
		expiryyear.sendKeys(Expiryyear);
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit() {
		submit.click();
	}

}
