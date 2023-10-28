package com.learning.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo1 {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
	List<WebElement> table1 =	driver.findElements(By.xpath("//tbody/tr"));
	System.out.println(table1.size());
	
	for(int i=1;i<=table1.size();i++)
	{
		List<WebElement> columns = driver.findElements(By.xpath("//tbody/tr["+i+"]/td"));
		
		for(WebElement eachColumn : columns)
		{
			System.out.println(eachColumn.getText());
		}
	}
	

	}

}
