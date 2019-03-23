package com.loginform.bean;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginForm {

	WebDriver driver;

	public LoginForm(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "txtUName")
	WebElement userName;

	@FindBy(name = "txtPwd")
	WebElement password;

	@FindBy(id = "txtConfPassword")
	WebElement confirmPassword;

	@FindBy(name = "txtFN")
	WebElement firtname;

	@FindBy(name = "txtLN")
	WebElement lastname;

	@FindBy(id = "rbMale")
	WebElement male;

	@FindBy(id = "rbFemale")
	WebElement female;

	@FindBy(name = "DtOB")
	WebElement dob;

	@FindBy(name = "Email")
	WebElement userEmail;

	@FindBy(name = "Address")
	WebElement userAddress;

	@FindBy(xpath = "/html/body/form/table/tbody/tr[10]/td[2]/select/option[1]")
	WebElement mumbai;

	@FindBy(xpath = "/html/body/form/table/tbody/tr[10]/td[2]/select/option[2]")
	WebElement pune;

	@FindBy(xpath = "/html/body/form/table/tbody/tr[10]/td[2]/select/option[3]")
	WebElement banglore;

	@FindBy(xpath = "/html/body/form/table/tbody/tr[10]/td[2]/select/option[4]")
	WebElement Chennai;

	@FindBy(name = "Phone")
	WebElement mobile;

	@FindBy(xpath = "/html/body/form/table/tbody/tr[12]/td[2]/input[1]")
	WebElement music;

	@FindBy(xpath = "/html/body/form/table/tbody/tr[12]/td[2]/input[2]")
	WebElement reading;

	@FindBy(xpath = "/html/body/form/table/tbody/tr[12]/td[2]/input[3]")
	WebElement movies;

	@FindBy(name = "submit")
	WebElement submit;

	@FindBy(name = "reset")
	WebElement reset;

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(String UserName) {
		userName.sendKeys(UserName);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String Password) {
		password.sendKeys(Password);
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String ConfirmPassword) {
		confirmPassword.sendKeys(ConfirmPassword);
	}

	public WebElement getMale() {
		return male;
	}

	public void setMale() {
		male.click();
	}

	public WebElement getFemale() {
		return female;
	}

	public void setFemale() {
		female.click();
	}

	public WebElement getDob() {
		return dob;
	}

	public void setDob(String Dob) {
		dob.sendKeys(Dob);
	}

	public WebElement getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String UserEmail) {
		userEmail.sendKeys(UserEmail);
	}

	public WebElement getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String UserAddress) {
		userAddress.sendKeys(UserAddress);
	}

	public WebElement getMumbai() {
		return mumbai;
	}

	public void setMumbai() {
		mumbai.click();
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
		return Chennai;
	}

	public void setChennai() {
		Chennai.click();
	}

	public WebElement getMobile() {
		return mobile;
	}

	public void setMobile(String Mobile) {
		mobile.sendKeys(Mobile);
	}

	public WebElement getMusic() {
		return music;
	}

	public void setMusic() {
		music.click();
	}

	public WebElement getReading() {
		return reading;
	}

	public void setReading() {
		reading.click();
	}

	public WebElement getMovies() {
		return movies;
	}

	public void setMovies() {
		movies.click();
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit() {
		submit.click();
	}

	public WebElement getReset() {
		return reset;
	}

	public void setReset() {
		reset.click();
	}

	public WebElement getFirtname() {
		return firtname;
	}

	public void setFirtname(String Firtname) {
		firtname.sendKeys(Firtname);
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(String Lastname) {
		lastname.sendKeys(Lastname);
	}

}
