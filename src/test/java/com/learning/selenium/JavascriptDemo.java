package com.learning.selenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * JavascriptExecutor is used to execute javascript commands in selenium
 */

public class JavascriptDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		JavascriptExecutor js1= (JavascriptExecutor)driver;
		
		Thread.sleep(2000);
		
		//to scroll down the page by 1000 pixels
		js1.executeScript("window.scrollTo(0,1000);");
		
		Thread.sleep(2000);
		
		//to scroll up the page by 500 pixels
		js1.executeScript("window.scrollTo(0,-500);");
		
		//to scroll right 
		js1.executeScript("window.scrollTo(1000,0);");
		
		//to scroll left
		js1.executeScript("window.scrollTo(-1000,0);");
		
		Thread.sleep(2000);
		
		//to scroll down until the bottom of the page
		js1.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		
		
		//to scroll up the page
		//js1.executeScript("window.scrollTo(0,0);");
		
		Thread.sleep(2000);
		
		js1.executeScript("window.scrollTo(0,-document.body.scrollHeight);");
		
		System.out.println(js1.executeScript("return document.title;"));
		



		

	}

}
