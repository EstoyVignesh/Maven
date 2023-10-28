package com.learning.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo1 {

static WebDriver driver = null;
	
	public static void main(String args[])
	{
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		WebElement db =driver.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		action.doubleClick(db).build().perform();
		
		WebElement rc =driver.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
		action.contextClick(rc).build().perform();
		
		WebElement c =driver.findElement(By.tagName("button"));
		action.click(c).build().perform();

	}

}
