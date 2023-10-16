package com.learning.selenium;

import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling2 {
	static WebDriver driver=null;


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		
		Thread.sleep(7000);
		
		driver.findElement(By.id("promtButton")).click();
		
		Alert alert = driver.switchTo().alert();
		
		
		//accept()
		//dismiss()
		//getText()
		//sendKeys()
		
		System.out.println("Alert Text-->"+alert.getText());
		Thread.sleep(2000);
		
		alert.sendKeys("Guvi selenium");
		Thread.sleep(2000);

		
		alert.accept();
		Thread.sleep(2000);

	}
}
