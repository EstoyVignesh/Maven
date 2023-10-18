package com.learning.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/*
 * 
 * Explicit wait is applicable for a specific webelement. If you think if a particular webelement is taking more than time than other elements, then we 
 * will go with explicit wait for that particular webelement
 */

public class ExplicitWaitDemo {
	static WebDriver driver=null;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		//method1
		WebElement searchBox= driver.findElement(By.id("APjFqb"));
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		//method 2
		wait.until(ExpectedConditions.visibilityOf(searchBox));
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q1111")));

		
		searchBox.sendKeys("explicit wait");
	//	driver.findElement(By.name("q")).sendKeys("Explicit wait");
		
		

	}

}
