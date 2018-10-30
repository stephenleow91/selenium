package com.si.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchSubmit {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com");

		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys(Keys.chord(Keys.SHIFT, "stephen king"));
		searchBox.submit();
	}

}
