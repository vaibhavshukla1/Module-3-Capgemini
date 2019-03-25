package com.hotelBooking.Beans;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;

	@FindBy(id = "txtFirstName")
	WebElement firstName;

	@FindBy(id = "txtLastName")
	WebElement lastName;

	@FindBy(id = "txtEmail")
	WebElement email;

	@FindBy(id = "txtPhone")
	WebElement mobile;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[6]/td[2]/textarea")
	WebElement address;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[7]/td[2]/select/option[2]")
	WebElement pune;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[7]/td[2]/select/option[3]")
	WebElement bangalore;

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

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[10]/td[2]/select/option[3]")
	WebElement three;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[10]/td[2]/select/option[4]")
	WebElement four;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[10]/td[2]/select/option[5]")
	WebElement five;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[10]/td[2]/select/option[6]")
	WebElement six;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[10]/td[2]/select/option[7]")
	WebElement seven;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[10]/td[2]/select/option[8]")
	WebElement eight;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[10]/td[2]/select/option[9]")
	WebElement nine;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[10]/td[2]/select/option[1]")
	WebElement one;

	@FindBy(id = "txtCardholderName")
	WebElement holderName;

	@FindBy(id = "txtDebit")
	WebElement cardNumber;

	@FindBy(name = "cvv")
	WebElement cvv;

	@FindBy(id = "txtMonth")
	WebElement expiryMonth;

	@FindBy(id = "txtYear")
	WebElement expiryYear;

	@FindBy(id = "btnPayment")
	WebElement confirm;

	public Login(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(String FirstName) {
		firstName.sendKeys(FirstName);
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(String LAstName) {
		System.out.println("fhdiu");
		lastName.sendKeys(LAstName);
	}

	public WebElement getEmail() {
		return email;
	}

	public void setEmail(String Email) {
		email.sendKeys(Email);
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

	public WebElement getBangalore() {
		return bangalore;
	}

	public void setBangalore() {
		bangalore.click();
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

	public WebElement getThree() {
		return three;
	}

	public void setThree() {
		three.click();
	}

	public WebElement getFour() {
		return four;
	}

	public void setFour() {
		four.click();
	}

	public WebElement getFive() {
		return five;
	}

	public void setFive() {
		five.click();
	}

	public WebElement getSix() {
		return six;
	}

	public void setSix() {
		six.click();
	}

	public WebElement getSeven() {
		return seven;
	}

	public void setSeven() {
		seven.click();
	}

	public WebElement getEight() {
		return eight;
	}

	public void setEight() {
		eight.click();
	}

	public WebElement getNine() {
		return nine;
	}

	public void setNine() {
		nine.click();
	}

	public WebElement getOne() {
		return one;
	}

	public void setOne() {
		one.click();
	}

	public WebElement getHolderName() {
		return holderName;
	}

	public void setHolderName(String HolderName) {
		holderName.sendKeys(HolderName);
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String CardNumber) {
		cardNumber.sendKeys(CardNumber);
	}

	public WebElement getCvv() {
		return cvv;
	}

	public void setCvv(String Cvv) {
		cvv.sendKeys(Cvv);
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public void setExpiryMonth(String ExpiryMonth) {
		expiryMonth.sendKeys(ExpiryMonth);
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public void setExpiryYear(String ExpiryYear) {
		expiryYear.sendKeys(ExpiryYear);
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public void setConfirm() {
		confirm.click();
	}
	
	
	
	/*public void setPfstate(String sstate){
	 * Select drpState=new Select(pfstate);
	 * drpState.selectByVisibleText(sstate);
	 * }
	 */
	

}
