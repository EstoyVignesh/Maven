package com.learning.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo {

	static WebDriver driver=null;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		/*
		 * Fluent wait will be applicable to a specific webelement and we can mention the polling frequency as well which is not present in Explicit wait
		 * polling frequency--> time interval for validating the expected condition
		 * 
		 */

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.pollingEvery(Duration.ofSeconds(2))
				.withTimeout(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("q111"))));
		
		driver.findElement(By.name("q")).sendKeys("fluent wait");
		
		
	}

}
