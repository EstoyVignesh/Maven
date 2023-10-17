package com.learning.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait1 {
	static WebDriver driver=null;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
		
		driver.findElement(By.name("q")).sendKeys("driverwait");
		
		
	
		

	}

}
