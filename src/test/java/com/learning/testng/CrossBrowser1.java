package com.learning.testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CrossBrowser1 {

	static WebDriver driver=null;
	
	@BeforeMethod
	public void crossBrowseTest()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}
	
	@Test
	public void test_Brosing()
	{
		driver.get("https://www.google.com");
		Assert.assertTrue(driver.getTitle().equals("google"));
	}
}
