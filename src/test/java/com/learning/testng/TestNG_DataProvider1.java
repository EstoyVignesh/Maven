package com.learning.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_DataProvider1 {

	public static WebDriver driver;
	
	
	@Test(dataProvider="FetchData")
	
	public void parameterization_DataProvider(String url, String searchText) throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(url);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Sign up'")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='sc-1yzxt5f-9 dFkpnp'")).sendKeys(searchText);
		Thread.sleep(2000);
		
		driver.quit();
	}	
		@DataProvider(name= "FetchData")
		
		public Object[][] writeData()
		{
			return new Object[][] {
				
				{"https://www.zomato.com/india","1245879663"},
				{"https://www.zomato.com/india","124587q663"},
				{"https://www.zomato.com/india","@24587966b"}
				
		
			};

		}

}
