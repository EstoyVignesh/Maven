package com.learning.testng;

import java.time.Duration;

/*
 * To execute in parallel, we need 2 attributes in the xml file
 * parallel
 * thread-count
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNgInvocation {
	
	public static WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
/*
 * invocationCount= how many times i want to repeat the testcase
 * threadPoolSize= how many threads to initiate in parallel
 */
	
	@Test (threadPoolSize=3, invocationCount=3)
	public void launchFacebook() throws InterruptedException
	{
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
	}
	
	

}
