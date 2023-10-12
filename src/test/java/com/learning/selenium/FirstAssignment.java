package com.learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{

			WebDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			driver.findElement(By.name("q")).sendKeys("Selenium download");
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//h3[text()='Downloads']")).click();
			Thread.sleep(5000);
			
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
