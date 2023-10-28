package com.learning.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesHandlingEx {

	static WebDriver driver= null;

	public static void main(String[] args) throws InterruptedException {
		
		driver= new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/iframe");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		/*
		 * 3 ways to switch to the frame,
		 * 1. by index
		 * 2. by name or id
		 * 3. by webelement
		 */
		
		//by index
		//driver.switchTo().frame(0);
		
		//by name or id
		driver.switchTo().frame("mce_0_ifr");
		
		//WebElement frame= driver.findElement(By.xpath("//iframe[@id='mce_0_ifr']"));
		//driver.switchTo().frame(frame);
		
		
		driver.findElement(By.id("tinymce")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("tinymce")).sendKeys("Learning frames");
		
		//to come out of the frame
		driver.switchTo().defaultContent();
		
		String value=driver.findElement(By.xpath("//h3")).getText();
		System.out.println("the value is -->"+value);

	}

}
