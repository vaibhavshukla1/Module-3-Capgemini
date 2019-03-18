package com.selenium.redbus;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class RedBus {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\sts-bundle\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		driver.get("https://www.redbus.in/");

		driver.findElement(By.id("src")).sendKeys("Kanpur");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {

		}

		driver.findElement(By.id("dest")).sendKeys("Mathura");

		try {
			Thread.sleep(1000);
		} catch (Exception e) {

		}

		driver.findElement(By.xpath("//*[@class='fl search-box date-box gtm-onwardCalendar']")).click();
		String month = "Apr 2019";
		String date = "28";
		String getMonth = driver.findElement(By.xpath("//div[@class='rb-calendar']//td[@class='monthTitle']"))
				.getText();

		while (true) {
			if (!(getMonth.equalsIgnoreCase(month))) {
				driver.findElement(By.xpath("//div[@class='rb-calendar']/*//td[@class='next']")).click();
				break;
			}
		}
		driver.findElement(By.xpath("//div[@id='rb-calendar_onward_cal']/table/tbody//td[text()='" + month
				+ "']/../..//td[text()='" + date + "']")).click();

		driver.findElement(By.id("search_btn")).click();
	}
}
