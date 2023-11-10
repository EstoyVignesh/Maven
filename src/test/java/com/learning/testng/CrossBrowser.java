package com.learning.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowser {
	static WebDriver driver=null;
	
	
	@BeforeMethod
	@Parameters({"browser"})
	public void launchBrowser(String browserName)
	{
		
		if(browserName.equals("chrome"))
		{
			driver= new ChromeDriver();

		}
		else if (browserName.equals("edge"))
		{
			driver= new EdgeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	@Test
	public void validateTitle()
	{
		driver.get("https://www.google.com");
		Assert.assertTrue(driver.getTitle().equals("Google"));
		driver.findElement(By.name("q")).sendKeys("Cross browser Testing");
	}

}
