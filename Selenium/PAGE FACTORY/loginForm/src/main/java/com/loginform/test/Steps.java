package com.loginform.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.loginform.bean.LoginForm;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	WebDriver driver;
	LoginForm login;
	
	@Given("^login form$")
	public void login_form() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\vaibhav shukla\\Desktop\\Testing PageFactory\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		login = new LoginForm(driver);
		driver.get("C:\\Users\\vaibhav shukla\\Desktop\\Testing PageFactory\\loginForm\\loginform.html");
		Thread.sleep(1000);
	    
	}

	@When("^all details are entered correctly$")
	public void all_details_are_entered_correctly() throws Throwable {
		
		login.setUserName("Vaibhav");
		Thread.sleep(1000);
		login.setPassword("password");
		Thread.sleep(1000);
		login.setConfirmPassword("password");
		Thread.sleep(1000);
		login.setFirtname("Vaibhav");
		Thread.sleep(1000);
		login.setLastname("Shukla");
		Thread.sleep(1000);
		login.setMale();
		Thread.sleep(1000);
		login.setDob("11/12/1999");
		Thread.sleep(1000);
		login.setUserEmail("shuklavaibhav027@gmail.com");
		Thread.sleep(1000);
		login.setUserAddress("scuidhsfcz");
		Thread.sleep(1000);
		login.setPune();
		Thread.sleep(1000);
		login.setMobile("9598016816");
		Thread.sleep(1000);
		login.setMusic();
		Thread.sleep(1000);
	    
	}

	@Then("^login is successful$")
	public void login_is_successful() throws Throwable {
		
		login.setSubmit();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		alert.accept();
	    
	}



}
