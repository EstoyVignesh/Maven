package com.learning.selenium;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {
	static WebDriver driver=null;


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		Thread.sleep(7000);
		
		driver.findElement(By.id("alertButton")).click();
		
		Alert alert= driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		//alert.accept();  //clicking on ok button
		alert.dismiss(); //clicking on close or cancel button
		

		
		
		
		
		

	}

}
