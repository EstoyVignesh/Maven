package com.learning.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {
	static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//first way (Here driver is the object for Chromedriver class and not webdriver interface)
		driver = new ChromeDriver();
		
		//driver = new EdgeDriver();
		
		//driver= new FirefoxDriver();
		
		//Second way	
		//ChromeDriver driver1= new ChromeDriver();
		
		
		//get() will load the given url in the current browser
		driver.get("https://www.google.com");
		
		driver.manage().window().maximize();
		Thread.sleep(2000); //2000 milliseconds= 2 secs
		driver.close();
		
		
		
	}

}
