package com.learning.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GreenKartAssignment0 {

static WebDriver driver = null;
	
	public static void main(String args[]) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("ber");
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		//Method 2
	    	Actions act1 = new Actions(driver);
		
			WebElement source1 =  driver.findElement(By.xpath("//h4[text()='Cucumber - 1 Kg']"));
			act1.moveToElement(source1).build().perform();
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();  
			
			WebElement source2 =  driver.findElement(By.xpath("//h4[text()='Raspberry - 1/4 Kg']"));
			act1.moveToElement(source2).build().perform();
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
			
			WebElement source3 =  driver.findElement(By.xpath("//h4[text()='Strawberry - 1/4 Kg']"));
			act1.moveToElement(source3).build().perform();
			driver.findElement(By.xpath("//button[text()='ADD TO CART']")).click();
		
			
			driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
			Thread.sleep(2000);

			driver.findElement(By.xpath("//div[@class='action-block']")).click();
			WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
			 
			

	}

}
