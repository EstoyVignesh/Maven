package com.learning.selenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart_TopDetails_TestCase {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String eachWindow: allWindows)
		{
			Thread.sleep(2000);
			driver.switchTo().window(eachWindow);
		}
		
		Thread.sleep(3000);
		
		List<WebElement> allValues =driver.findElements(By.xpath("//tbody/tr"));
		System.out.println(allValues.size());
		
		for(int i=1;i<=allValues.size();i++)
		{
			List<WebElement> colu01 = driver.findElements(By.xpath("//tbody/tr["+i+"]/td"));
		

		for(WebElement eachColumn : colu01)
		{
			System.out.println(eachColumn.getText());
		}
	}
		
		Thread.sleep(3000);
	//////////////////////////////////////////////////////////////////////////////////////	
		System.out.println("===================================");
		
		
		//Next Page
		driver.findElement(By.xpath("//a[@aria-label='Next']")).click();	//To get the Text of the Page
		
				
		for(int i=1;i<=allValues.size();i++)
		{
			List<WebElement> colu01 = driver.findElements(By.xpath("//tbody/tr["+i+"]/td"));
		

		for(WebElement eachColumn : colu01)
		{
			System.out.println(eachColumn.getText());
		}
	}
		
		
		
		Thread.sleep(3000);
		
		System.out.println("===================================");
		
		driver.findElement(By.id("search-field")).sendKeys("le");
		
		for(int i=1;i<=allValues.size();i++)
		{
			List<WebElement> colu01 = driver.findElements(By.xpath("//tbody/tr["+i+"]/td"));
		

		for(WebElement eachColumn : colu01)
		{
			System.out.println(eachColumn.getText());
		}
	}
		
//////////////////////////////////////////////////////////////////////////////////////////////////
         System.out.println("===================================");
         
		
         //Next Page
		driver.findElement(By.xpath("//a[@aria-label='Next']")).click();      	//To get the Text of the Page
		
		//To get the Text of the Page
		String pageText = driver.findElement(By.xpath("//a[@aria-label='Next']")).getText();	
		System.out.println(pageText);
		
		
		for(int i=1;i<=allValues.size();i++)
		{
			List<WebElement> colu01 = driver.findElements(By.xpath("//tbody/tr["+i+"]/td"));
		

		for(WebElement eachColumn : colu01)
		{
			System.out.println(eachColumn.getText());
		}
	}
		Thread.sleep(3000);
		
        System.out.println("===================================");
        
        //////////////////////////////////////////////////////////////////////////////////////
        
		//Next Page
		driver.findElement(By.xpath("//a[@aria-label='Next']")).click();	//To get the Text of the Page
		
		
		for(int i=1;i<=allValues.size();i++)
		{
			List<WebElement> colu01 = driver.findElements(By.xpath("//tbody/tr["+i+"]/td"));
		

		for(WebElement eachColumn : colu01)
		{
			System.out.println(eachColumn.getText());
		}
	}
		
		
		Thread.sleep(6000);
		
		driver.switchTo().window(parentWindow);
		
		
		
		
		
		/*
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/div/div[2]/ul/li[7]/a")).click();
	
	List<WebElement> table2 =	driver.findElements(By.xpath("//tbody/tr"));
	System.out.println(table1.size());
	
	for(int i=1;i<=table1.size();i++)
	{
		List<WebElement> columns = driver.findElements(By.xpath("//tbody/tr["+i+"]/td"));
		
		for(WebElement eachColumn : columns)
		{
			System.out.println(eachColumn.getText());
		}
	}
	
	System.out.println("===================================");
	
driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/div/div[2]/ul/li[7]/a")).click();
	
	List<WebElement> table3 =	driver.findElements(By.xpath("//tbody/tr"));
	System.out.println(table1.size());
	
	for(int i=1;i<=table1.size();i++)
	{
		List<WebElement> columns = driver.findElements(By.xpath("//tbody/tr["+i+"]/td"));
		
		for(WebElement eachColumn : columns)
		{
			System.out.println(eachColumn.getText());
		}
	}
	
	System.out.println("===================================");
	
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[1]/div/div/div/div/div/div[2]/ul/li[7]/a")).click();
		
		List<WebElement> table4 =	driver.findElements(By.xpath("//tbody/tr"));
		System.out.println(table1.size());
		
		for(int i=1;i<=table1.size();i++)
		{
			List<WebElement> columns = driver.findElements(By.xpath("//tbody/tr["+i+"]/td"));
			
			for(WebElement eachColumn : columns)
			{
				System.out.println(eachColumn.getText());
			}
		}
		 
		 */
		 
		
	}

}
