package com.si.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffset {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("D:/selectable.html");

		WebElement three = driver.findElement(By.name("three"));
		System.out.println("X coordinate : " + three.getLocation().getX() + " Y coordinate : " + three.getLocation().getY());

		Actions builder = new Actions(driver);
		builder.moveByOffset(three.getLocation().getX() + 100, three.getLocation().getY() + 100);
		builder.click();
		builder.perform();
	}

}
