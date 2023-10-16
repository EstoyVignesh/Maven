package com.learning.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingEx1 {

	static WebDriver driver=null;


	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		Thread.sleep(7000);
		
			
		driver.findElement(By.id("alertButton")).click();
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(4000);
		
		
		
		alert.accept();
	}

}
