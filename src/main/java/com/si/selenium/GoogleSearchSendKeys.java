package com.si.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchSendKeys {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.get("http://www.youtube.com");

		for (int i = 0; i < 5; i++) {
			driver.navigate().back();
			driver.navigate().forward();
		}

	}

}
