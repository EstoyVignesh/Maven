package com.learning.selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowExcercise {

static WebDriver driver = null;
	
	public static void main(String args[]) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		String parent = driver.getWindowHandle();
		driver.findElement(By.id("openwindow")).click();
		
		Set<String> child = driver.getWindowHandles();
		
		for(String next : child)
		{
			driver.switchTo().window(next);
			driver.manage().window().maximize();
			Thread.sleep(5000);
		}
		
		String childwindow = driver.findElement(By.xpath("//span[text()='info@qaclickacademy.com']")).getText();
		System.out.println("Child window text-->"+childwindow);
        Thread.sleep(5000);
		
		driver.quit();
	}

}
