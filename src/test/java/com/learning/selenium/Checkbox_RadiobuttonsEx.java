package com.learning.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox_RadiobuttonsEx {
	static WebDriver driver=null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			driver = new ChromeDriver();
			
			driver.get("https://demo.guru99.com/test/radio.html");
			
			driver.manage().window().maximize();
			
			//selecting the second radio button
			driver.findElement(By.xpath("//input[@id='vfb-7-2']")).click();
			Thread.sleep(2000);
			
			//selecting the third radio button
			driver.findElement(By.xpath("//input[@value='Option 3']")).click();
			Thread.sleep(2000);
			
			//selecting the third checkbox
			
			driver.findElement(By.xpath("//input[@id='vfb-6-2']")).click();
			Thread.sleep(2000);
			
			WebElement firstCheckbox=driver.findElement(By.xpath("//input[@id='vfb-6-0']"));
			firstCheckbox.click();
			Thread.sleep(2000);
			
			if(firstCheckbox.isSelected())
			{
				System.out.println("First checkbox is selected");
			}
			else
			{
				System.out.println("First checkbox is not selected");
			}
			
			
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}

	}

}
