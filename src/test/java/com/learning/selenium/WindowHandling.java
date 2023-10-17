package com.learning.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {
	static WebDriver driver=null;


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		//getWindowHandle --> will return the current window id
		//getWindowHandles --> will return all the window ids opened by the driver instance
		
		String parentWindow= driver.getWindowHandle();
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();	
		
		Set<String> allWindows=driver.getWindowHandles();
		
		for(String eachWindow:allWindows)
		{
			Thread.sleep(2000);
			driver.switchTo().window(eachWindow);
		}
		
		String childWindowText= driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Child window text-->"+childWindowText);
		Thread.sleep(2000);
		Thread.sleep(2000);
		
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);

		
		String parentWindowText=driver.findElement(By.xpath("//div[@class='main-header']")).getText();
		System.out.println("Parent window text-->"+parentWindowText);
		Thread.sleep(2000);

		//driver.close(); // will close only the current active window
		
		driver.quit();
		
		
		
		

	}

}
