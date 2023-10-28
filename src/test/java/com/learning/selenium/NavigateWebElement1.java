package com.learning.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateWebElement1 {

	static WebDriver driver= null;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver= new ChromeDriver();
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//to refresh the page
		driver.navigate().refresh();
		
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(2000);
		
		//navigates to the previous history
		driver.navigate().back();
		Thread.sleep(2000);
		
		//navigate forward in the history
		driver.navigate().forward();
		Thread.sleep(2000);
		

	}

}
