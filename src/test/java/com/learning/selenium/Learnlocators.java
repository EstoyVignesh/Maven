package com.learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learnlocators {
	
	static WebDriver driver=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//locating by id
		//driver.findElement(By.id("APjFqb")).sendKeys("Selenium learning");
		
		
		//locating by name
		//driver.findElement(By.name("q")).sendKeys("Selenium");
		
		//locating by xpath
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("xpath");
		
		//using linktext
		//driver.findElement(By.linkText("Images")).click();
		
		
		//using parial linktext
		//driver.findElement(By.partialLinkText("Ima")).click();
		
		//using xpath for clickin on a link
		driver.findElement(By.xpath("//a[text()='Images']")).click();
		
		
		
		

	}

}
