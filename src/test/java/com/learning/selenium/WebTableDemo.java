package com.learning.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableDemo {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		/*
		 * 
		 * html table implementation

		<table>
		<thead>
		<tr>
		<t>
		
		</thead>
		<tbody>
		
		
		</tbody>
		
		</table>
		*/
		
		
		
		//To retrieve the table data
		
		List<WebElement> table=driver.findElements(By.xpath("//tbody/tr")); //5 rows
		System.out.println(table.size());

		
		for(int i=1;i<=table.size();i++)
		{
			List<WebElement> columns=driver.findElements(By.xpath("//tbody/tr["+i+"]/td")); //3 columns
																	//tbody/tr[5]/td
			
			//System.out.println(columns.size());
			
			for(WebElement eachColumn:columns)
			{
				System.out.println(eachColumn.getText());
			}
		}
		
		
		
	}

}
