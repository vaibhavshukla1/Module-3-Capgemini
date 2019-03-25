package com.hotelBooking.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hotelBooking.Beans.Login;
import com.hotelBooking.Beans.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver;
	Login login;
	LoginPage page;

	@Given("^Login page$")
	public void login_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vaibhav shukla\\Desktop\\Testing PageFactory\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

		page = new LoginPage(driver);

		driver.get("C:\\Users\\vaibhav shukla\\Desktop\\Hotel\\WebContent\\loginpage.html");

	}

	@Then("^title matched$")
	public void title_matched() throws Throwable {
		if (driver.getTitle().equals("")) {
			System.out.println("====Login Page Is Foundes====");
		}
		Thread.sleep(1000);
	}

	@When("^wrong user name is entered$")
	public void wrong_user_name_is_entered() throws Throwable {
		page.setUserloginname("Vaibhav");
		Thread.sleep(1000);
		page.setUserloginpassword("capg1234");
		Thread.sleep(1000);

	}

	@Then("^login failed$")
	public void login_failed() throws Throwable {
		page.setNext();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(1000);

	}
	
	@Then("^login failed without alert$")
	public void login_failed_without_alert() throws Throwable {
		page.setNext();
		Thread.sleep(1000);
		
	}

	@When("^wrong password is entered$")
	public void wrong_password_is_entered() throws Throwable {
		page.setUserloginname("capgemini");
		Thread.sleep(1000);
		page.setUserloginpassword("capg234");
		Thread.sleep(1000);
	}

	@When("^user name is empty$")
	public void user_name_is_empty() throws Throwable {

		page.setUserloginpassword("capg1234");
		Thread.sleep(1000);

	}

	@When("^password is empty$")
	public void password_is_empty() throws Throwable {
		page.setUserloginname("capgemini");
		Thread.sleep(1000);
	}

	@When("^all details are entered correctlyy$")
	public void all_details_are_entered_correctlyy() throws Throwable {
		page.setUserloginname("capgemini");
		Thread.sleep(1000);
		page.setUserloginpassword("capg1234");
		Thread.sleep(1000);
	}

	@Then("^login success$")
	public void login_success() throws Throwable {
		page.setNext();
		Thread.sleep(1000);
	}

	@Given("^Hotel Booking Page$")
	public void hotel_Booking_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vaibhav shukla\\Desktop\\Testing PageFactory\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		login = new Login(driver);
		driver.get("C:\\Users\\vaibhav shukla\\Desktop\\Hotel\\WebContent\\login.html");
	}

	@Then("^tile varified$")
	public void tile_varified() throws Throwable {
		if (driver.getTitle().equals("Hotel Booking")) {
			System.out.println("====Hotel Booking Page Is Founded====");
		}
		Thread.sleep(1000);
	}

	@When("^first name is not entered$")
	public void first_name_is_not_entered() throws Throwable {
		login.setLastName("Shukla");
		Thread.sleep(1000);
		login.setEmail("shuklavaibhav027@gmail.com");
		Thread.sleep(1000);
		login.setMobile("9598016816");
		Thread.sleep(1000);
		login.setAddress("117/p1/71,iehjf,ksiasdaofj,UP");
		Thread.sleep(1000);
		login.setPune();
		Thread.sleep(1000);
		login.setMaharashtra();
		Thread.sleep(1000);
		login.setFive();
		Thread.sleep(1000);
		login.setHolderName("VAIBHAV SHUKLA");
		Thread.sleep(1000);
		login.setCardNumber("123456789101");
		Thread.sleep(1000);
		login.setCvv("123");
		Thread.sleep(1000);
		login.setExpiryMonth("10");
		Thread.sleep(1000);
		login.setExpiryYear("2034");
		Thread.sleep(1000);
	}

	@Then("^Booking fails$")
	public void booking_fails() throws Throwable {
		login.setConfirm();
		Thread.sleep(500);
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(500);
	}

	@When("^last name is empty$")
	public void last_name_is_empty() throws Throwable {
		login.setFirstName("Vaibhav");
		Thread.sleep(500);
		login.setEmail("shuklavaibhav027@gmail.com");
		Thread.sleep(500);
		login.setMobile("9598016816");
		Thread.sleep(500);
		login.setAddress("117/p1/71,iehjf,ksiasdaofj,UP");
		Thread.sleep(500);
		login.setPune();
		Thread.sleep(500);
		login.setMaharashtra();
		Thread.sleep(500);
		login.setFive();
		Thread.sleep(500);
		login.setHolderName("VAIBHAV SHUKLA");
		Thread.sleep(500);
		login.setCardNumber("123456789101");
		Thread.sleep(500);
		login.setCvv("123");
		Thread.sleep(500);
		login.setExpiryMonth("10");
		Thread.sleep(500);
		login.setExpiryYear("2034");
		Thread.sleep(500);
	}

	@When("^email is not entered$")
	public void email_is_not_entered() throws Throwable {
		login.setFirstName("Vaibhav");
		Thread.sleep(500);
		login.setLastName("Shukla");
		Thread.sleep(500);
		login.setMobile("9598016816");
		Thread.sleep(500);
		login.setAddress("117/p1/71,iehjf,ksiasdaofj,UP");
		Thread.sleep(500);
		login.setPune();
		Thread.sleep(500);
		login.setMaharashtra();
		Thread.sleep(500);
		login.setFive();
		Thread.sleep(500);
		login.setHolderName("VAIBHAV SHUKLA");
		Thread.sleep(500);
		login.setCardNumber("123456789101");
		Thread.sleep(500);
		login.setCvv("123");
		Thread.sleep(500);
		login.setExpiryMonth("10");
		Thread.sleep(500);
		login.setExpiryYear("2034");
		Thread.sleep(500);
	}

	@When("^wrong email is entered$")
	public void wrong_email_is_entered() throws Throwable {
		login.setFirstName("Vaibhav");
		Thread.sleep(500);
		login.setLastName("Shukla");
		Thread.sleep(500);
		login.setEmail("shuklavaibhav027");
		Thread.sleep(500);
		login.setMobile("9598016816");
		Thread.sleep(500);
		login.setAddress("117/p1/71,iehjf,ksiasdaofj,UP");
		Thread.sleep(500);
		login.setPune();
		Thread.sleep(500);
		login.setMaharashtra();
		Thread.sleep(500);
		login.setFive();
		Thread.sleep(500);
		login.setHolderName("VAIBHAV SHUKLA");
		Thread.sleep(500);
		login.setCardNumber("123456789101");
		Thread.sleep(500);
		login.setCvv("123");
		Thread.sleep(500);
		login.setExpiryMonth("10");
		Thread.sleep(500);
		login.setExpiryYear("2034");
		Thread.sleep(500);
	}

	@When("^address is not entered$")
	public void address_is_not_entered() throws Throwable {
		login.setFirstName("Vaibhav");
		Thread.sleep(500);
		login.setLastName("Shukla");
		Thread.sleep(500);
		login.setEmail("shuklavaibhav027");
		Thread.sleep(500);
		login.setMobile("9598016816");
		Thread.sleep(500);
		login.setPune();
		Thread.sleep(500);
		login.setMaharashtra();
		Thread.sleep(500);
		login.setFive();
		Thread.sleep(500);
		login.setHolderName("VAIBHAV SHUKLA");
		Thread.sleep(500);
		login.setCardNumber("123456789101");
		Thread.sleep(500);
		login.setCvv("123");
		Thread.sleep(500);
		login.setExpiryMonth("10");
		Thread.sleep(500);
		login.setExpiryYear("2034");
		Thread.sleep(500);
	}

	@When("^city is not selected$")
	public void city_is_not_selected() throws Throwable {
		login.setFirstName("Vaibhav");
		Thread.sleep(500);
		login.setLastName("Shukla");
		Thread.sleep(500);
		login.setEmail("shuklavaibhav027");
		Thread.sleep(500);
		login.setMobile("9598016816");
		Thread.sleep(500);
		login.setAddress("117/p1/71,iehjf,ksiasdaofj,UP");
		Thread.sleep(500);
		login.setMaharashtra();
		Thread.sleep(500);
		login.setFive();
		Thread.sleep(500);
		login.setHolderName("VAIBHAV SHUKLA");
		Thread.sleep(500);
		login.setCardNumber("123456789101");
		Thread.sleep(500);
		login.setCvv("123");
		Thread.sleep(500);
		login.setExpiryMonth("10");
		Thread.sleep(500);
		login.setExpiryYear("2034");
		Thread.sleep(500);
	}

	@When("^state is not selected$")
	public void state_is_not_selected() throws Throwable {
		login.setFirstName("Vaibhav");
		Thread.sleep(500);
		login.setLastName("Shukla");
		Thread.sleep(500);
		login.setEmail("shuklavaibhav027");
		Thread.sleep(500);
		login.setMobile("9598016816");
		Thread.sleep(500);
		login.setAddress("117/p1/71,iehjf,ksiasdaofj,UP");
		Thread.sleep(500);
		login.setPune();
		Thread.sleep(500);
		login.setFive();
		Thread.sleep(500);
		login.setHolderName("VAIBHAV SHUKLA");
		Thread.sleep(500);
		login.setCardNumber("123456789101");
		Thread.sleep(500);
		login.setCvv("123");
		Thread.sleep(500);
		login.setExpiryMonth("10");
		Thread.sleep(500);
		login.setExpiryYear("2034");
		Thread.sleep(500);
	}

	@When("^card holder name not entered$")
	public void card_holder_name_not_entered() throws Throwable {
		login.setFirstName("Vaibhav");
		Thread.sleep(500);
		login.setLastName("Shukla");
		Thread.sleep(500);
		login.setEmail("shuklavaibhav027");
		Thread.sleep(500);
		login.setMobile("9598016816");
		Thread.sleep(500);
		login.setAddress("117/p1/71,iehjf,ksiasdaofj,UP");
		Thread.sleep(500);
		login.setPune();
		Thread.sleep(500);
		login.setMaharashtra();
		Thread.sleep(500);
		login.setFive();
		Thread.sleep(500);
		login.setCardNumber("123456789101");
		Thread.sleep(500);
		login.setCvv("123");
		Thread.sleep(500);
		login.setExpiryMonth("10");
		Thread.sleep(500);
		login.setExpiryYear("2034");
		Thread.sleep(500);
	}

	@When("^card number not entered$")
	public void card_number_not_entered() throws Throwable {
		login.setFirstName("Vaibhav");
		Thread.sleep(500);
		login.setLastName("Shukla");
		Thread.sleep(500);
		login.setEmail("shuklavaibhav027");
		Thread.sleep(500);
		login.setMobile("9598016816");
		Thread.sleep(500);
		login.setAddress("117/p1/71,iehjf,ksiasdaofj,UP");
		Thread.sleep(500);
		login.setPune();
		Thread.sleep(500);
		login.setMaharashtra();
		Thread.sleep(500);
		login.setFive();
		Thread.sleep(500);
		login.setHolderName("VAIBHAV SHUKLA");
		Thread.sleep(500);
		login.setCvv("123");
		Thread.sleep(500);
		login.setExpiryMonth("10");
		Thread.sleep(500);
		login.setExpiryYear("2034");
		Thread.sleep(500);
	}

	@When("^cvv not entered$")
	public void cvv_not_entered() throws Throwable {
		login.setFirstName("Vaibhav");
		Thread.sleep(500);
		login.setLastName("Shukla");
		Thread.sleep(500);
		login.setEmail("shuklavaibhav027");
		Thread.sleep(500);
		login.setMobile("9598016816");
		Thread.sleep(500);
		login.setAddress("117/p1/71,iehjf,ksiasdaofj,UP");
		Thread.sleep(500);
		login.setPune();
		Thread.sleep(500);
		login.setMaharashtra();
		Thread.sleep(500);
		login.setFive();
		Thread.sleep(500);
		login.setHolderName("VAIBHAV SHUKLA");
		Thread.sleep(500);
		login.setCardNumber("123456789101");
		Thread.sleep(500);
		login.setExpiryMonth("10");
		Thread.sleep(500);
		login.setExpiryYear("2034");
		Thread.sleep(500);
	}

	@When("^expiry month not entered$")
	public void expiry_month_not_entered() throws Throwable {
		login.setFirstName("Vaibhav");
		Thread.sleep(500);
		login.setLastName("Shukla");
		Thread.sleep(500);
		login.setEmail("shuklavaibhav027");
		Thread.sleep(500);
		login.setMobile("9598016816");
		Thread.sleep(500);
		login.setAddress("117/p1/71,iehjf,ksiasdaofj,UP");
		Thread.sleep(500);
		login.setPune();
		Thread.sleep(500);
		login.setMaharashtra();
		Thread.sleep(500);
		login.setFive();
		Thread.sleep(500);
		login.setHolderName("VAIBHAV SHUKLA");
		Thread.sleep(500);
		login.setCardNumber("123456789101");
		Thread.sleep(500);
		login.setCvv("123");
		Thread.sleep(500);
		login.setExpiryYear("2034");
		Thread.sleep(500);
	}

	@When("^expiry year not entered$")
	public void expiry_year_not_entered() throws Throwable {
		login.setFirstName("Vaibhav");
		Thread.sleep(500);
		login.setLastName("Shukla");
		Thread.sleep(500);
		login.setEmail("shuklavaibhav027");
		Thread.sleep(500);
		login.setMobile("9598016816");
		Thread.sleep(500);
		login.setAddress("117/p1/71,iehjf,ksiasdaofj,UP");
		Thread.sleep(500);
		login.setPune();
		Thread.sleep(500);
		login.setMaharashtra();
		Thread.sleep(500);
		login.setFive();
		Thread.sleep(500);
		login.setHolderName("VAIBHAV SHUKLA");
		Thread.sleep(500);
		login.setCardNumber("123456789101");
		Thread.sleep(500);
		login.setCvv("123");
		Thread.sleep(500);
		login.setExpiryMonth("10");
		Thread.sleep(500);

	}

	@When("^all details are entered correctly$")
	public void all_details_are_entered_correctly() throws Throwable {
		login.setFirstName("Vaibhav");
		Thread.sleep(500);
		login.setLastName("Shukla");
		Thread.sleep(500);
		login.setEmail("shuklavaibhav027@gmail.com");
		Thread.sleep(500);
		login.setMobile("9598016816");
		Thread.sleep(500);
		login.setAddress("117/p1/71,iehjf,ksiasdaofj,UP");
		Thread.sleep(500);
		login.setPune();
		Thread.sleep(500);
		login.setMaharashtra();
		Thread.sleep(500);
		login.setFive();
		Thread.sleep(500);
		login.setHolderName("VAIBHAV SHUKLA");
		Thread.sleep(500);
		login.setCardNumber("123456789101");
		Thread.sleep(500);
		login.setCvv("123");
		Thread.sleep(500);
		login.setExpiryMonth("10");
		Thread.sleep(500);
		login.setExpiryYear("2034");
		Thread.sleep(500);
	}

	@Then("^Booking confirmed$")
	public void booking_confirmed() throws Throwable {
		login.setConfirm();
		
	}
}
