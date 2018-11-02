package com.si.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionBuildPerformClick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/selectable.html");

		WebElement button = driver.findElement(By.className("test"));
		Actions builder = new Actions(driver);
		builder.click(button);

		builder.perform();

	}

}
