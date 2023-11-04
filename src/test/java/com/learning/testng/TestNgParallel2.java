package com.learning.testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgParallel2 {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	@Test
	public void launchGoogle() throws InterruptedException
	{
		driver.get("https://www.google.com");
		Thread.sleep(3000);

	}
	
	@Test
	public void launchYahoo() throws InterruptedException
	{
		driver.get("https://www.yahoo.com/?guccounter=1");
		Thread.sleep(3000);

	}
	
	

}
