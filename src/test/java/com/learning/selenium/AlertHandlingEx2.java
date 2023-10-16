package com.learning.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandlingEx2 {

	static WebDriver driver=null;


	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();

		Thread.sleep(7000);
		
		driver.findElement(By.id("promtButton")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println("The Text is --> "+alert.getText());
		
		alert.sendKeys("Hi Selenium");
		
		Thread.sleep(2500);
		
		alert.accept();
		
		//alert.dismiss();
		

	}

}
