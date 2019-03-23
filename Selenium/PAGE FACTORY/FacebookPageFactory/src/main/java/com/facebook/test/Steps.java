package com.facebook.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.facebook.beans.Login1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver;
	Login1 login;

	@Given("^flikart login page$")
	public void flikart_login_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vaibhav shukla\\Desktop\\Testing PageFactory\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();

		login = new Login1(driver);
		driver.get("https://en-gb.facebook.com/login/");
		Thread.sleep(1000);

	}

	@When("^mobile number and password are correctly entered$")
	public void mobile_number_and_password_are_correctly_entered() throws Throwable {

		login.setMobile("");
		Thread.sleep(1000);
		login.setPassword("");
		Thread.sleep(1000);

	}

	@Then("^redirect to flipkart website$")
	public void redirect_to_flipkart_website() throws Throwable {

		login.setLoginpage();
		Thread.sleep(1000);

	}

	@When("^mobile number or password is wrong$")
	public void mobile_number_or_password_is_wrong() throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\vaibhav shukla\\\\Desktop\\\\Testing PageFactory\\\\chromedriver\\\\chromedriver.exe");
		driver = new ChromeDriver();

		login = new Login1(driver);
		driver.get("https://en-gb.facebook.com/login/");
		Thread.sleep(1000);

		login.setMobile("");
		Thread.sleep(1000);
		login.setPassword("");
		Thread.sleep(1000);

	}

	@Then("^login fails$")
	public void login_fails() throws Throwable {

		login.setLoginpage();

	}

}
