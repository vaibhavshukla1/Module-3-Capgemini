package com.amazon.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.amazon.Bean.Login1;
import com.amazon.Bean.Login2;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver;
	Login1 login1;
	Login2 login2;

	@Given("^amazon login page$")
	public void amazon_login_page() throws Throwable {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HIMANSMI\\Desktop\\VaibhavShukla\\chromedriver.exe");
		driver = new ChromeDriver();
		login1 = new Login1(driver);
		login2 = new Login2(driver);
		driver.get(
				"https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fascsubtag%3D_k_EAIaIQobChMI7sDsssmX4QIVg-d3Ch0PAwP_EAAYASAAEgLml_D_BwE_k_%26gclid%3DEAIaIQobChMI7sDsssmX4QIVg-d3Ch0PAwP_EAAYASAAEgLml_D_BwE%26_encoding%3DUTF8%26tag%3Dgooginabkkenshoo-21%26opf_redir%3D1%26ref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		Thread.sleep(1000);
	}

	@When("^enter correct mobile number or email$")
	public void enter_correct_mobile_number_or_email() throws Throwable {

		login1.setMobile("7388317917");

	}

	@Then("^next page is opened$")
	public void next_page_is_opened() throws Throwable {

		login1.setNext();

	}

	@When("^entered correct password$")
	public void entered_correct_password() throws Throwable {

		login2.setPassword("vaibhavshukla");

	}

	@Then("^redirect to amazon website$")
	public void redirect_to_amazon_website() throws Throwable {

		login2.setSignin();

	}

}
