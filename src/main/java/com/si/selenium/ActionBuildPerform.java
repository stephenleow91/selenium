package com.si.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionBuildPerform {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/selectable.html");

		WebElement one = driver.findElement(By.name("one"));
		WebElement two = driver.findElement(By.name("two"));
		WebElement three = driver.findElement(By.name("three"));

		Actions builder = new Actions(driver);
		builder.keyDown(Keys.CONTROL).click(one).click(two).click(three).keyUp(Keys.CONTROL);

		builder.perform();
		Thread.sleep(2000);

		driver.close();
	}

}
