package com.learning.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWait1 {

	static WebDriver driver=null;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.pollingEvery(Duration.ofSeconds(2))
				.withTimeout(Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("q"))));
		
		driver.findElement(By.name("q")).sendKeys("Fluent Wait in Selenium Locators");
		
		//driver.close();

	}

}
