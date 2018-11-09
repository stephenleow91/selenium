package com.si.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BrowserCapabilities {

	public static void main(String... args) {
		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("takesScreenShot");

		WebDriver driver = new FirefoxDriver(options);
		driver.get("http://www.google.com");
	}

}
