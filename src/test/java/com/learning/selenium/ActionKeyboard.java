package com.learning.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionKeyboard {

static WebDriver driver = null;
	
	public static void main(String args[])
	{
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		WebElement web = driver.findElement(By.name("q"));
		
		
		Actions act1 =new Actions(driver);
		act1.keyDown(web, Keys.SHIFT).sendKeys("Actions Class Model Script").build().perform();
		
	}

}
