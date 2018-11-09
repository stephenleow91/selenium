package com.si.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverNavigate {

	public static void main(String... args) {
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.google.com");

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("Selenium WebDriver");

		searchBox = driver.findElement(By.name("q"));
		searchBox.submit();
		searchBox.clear();

		searchBox.sendKeys("Packt Publishing");
		searchBox.submit();

		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

}
