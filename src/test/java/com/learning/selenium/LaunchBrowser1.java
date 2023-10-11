package com.learning.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser1 {
	//static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException {
	
		
	   WebDriver driver = new ChromeDriver();
	 //  WebDriver driver = new EdgeDriver();
	   
	   driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.13.0");
		
	   
	   driver.manage().window().maximize();
	   Thread.sleep(10000);
	      
	   driver.close();
	}

}
