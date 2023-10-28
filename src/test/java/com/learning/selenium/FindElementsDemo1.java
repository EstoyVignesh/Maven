package com.learning.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsDemo1 {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
				
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();

		driver.findElement(By.name("q")).sendKeys("Selenium learning");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		List<WebElement> allLinkTexts = driver.findElements(By.tagName("a"));
		System.out.println(allLinkTexts.size());
		
		for(WebElement eachLinkTexts :allLinkTexts)
		{
			System.out.println( eachLinkTexts.getAttribute("href"));
		}
	}

}
