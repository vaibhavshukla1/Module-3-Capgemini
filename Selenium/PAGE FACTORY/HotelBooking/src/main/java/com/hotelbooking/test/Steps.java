package com.hotelbooking.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.hotelbooking.bean.Details;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	Details detail;
	
	@Given("^hotel booking site$")
	public void hotel_booking_site() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vaibhav shukla\\Desktop\\Testing PageFactory\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		detail = new Details(driver);
		driver.get("C:\\Users\\vaibhav shukla\\Desktop\\Testing PageFactory\\HotelBooking\\hotelBooking.html");
	    Thread.sleep(1000);
	}

	@When("^all details are entered correctly$")
	public void all_details_are_entered_correctly() throws Throwable {
		
		detail.setFirstname("Vaibhav");
		Thread.sleep(1000);
		detail.setLastname("Shukla");
		Thread.sleep(1000);
		detail.setUseremail("shuklavaibhav027@gmail.com");
		Thread.sleep(1000);
		detail.setMobile("9598016816");
		Thread.sleep(1000);
		detail.setAddress("38dch59dhfsoifj/38si");
		Thread.sleep(1000);
		detail.setPune();
		Thread.sleep(1000);
		detail.setMaharashtra();
		Thread.sleep(1000);
		detail.setTwo();
		Thread.sleep(1000);
		detail.setCardholdrer("VAIBHAV SHUKLA");
		Thread.sleep(1000);
		detail.setCardnumber("123456789012");
		Thread.sleep(1000);
		detail.setCvv("289");
		Thread.sleep(1000);
		detail.setExpirymonth("10");
		Thread.sleep(1000);
		detail.setExpiryyear("2034");
		Thread.sleep(1000);
	    
	}

	@Then("^Hotel Booking is confirmed$")
	public void hotel_Booking_is_confirmed() throws Throwable {
		
		detail.setSubmit();
	    
	}



}
