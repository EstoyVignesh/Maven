package com.learning.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling1 {

	static WebDriver driver=null;


	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		driver.manage().window().maximize();
		
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		Set<String> openWindow = driver.getWindowHandles();
		
		for(String eachWindow :openWindow)
		{
			driver.switchTo().window(eachWindow);
		}
		
		
		
		String childWindowText= driver.findElement(By.id("sampleHeading")).getText();
		System.out.println("Child window text-->"+childWindowText);
		Thread.sleep(2000);
		
		
		driver.switchTo().window(parentWindow);
		Thread.sleep(2000);

		
		String parentWindowText=driver.findElement(By.xpath("//div[@class='main-header']")).getText();
		System.out.println("Parent window text-->"+parentWindowText);
		Thread.sleep(2000);
		

	}

}
