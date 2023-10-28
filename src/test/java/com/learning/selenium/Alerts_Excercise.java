package com.learning.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Excercise {

static WebDriver driver = null;
	
	public static void main(String args[]) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.findElement(By.name("enter-name")).sendKeys("GuviTasks");
		
		driver.findElement(By.id("alertbtn")).click();
		
		Alert al = driver.switchTo().alert();
		
		String text = al.getText();
		System.out.println(text);
		
		al.accept();
	
	
		if(text.contains("GuviTunks"))
				{
					System.out.println("The Text received Correctly");
				}else
					System.out.println("The Received Text is Wrong");
		
		
	}

}
