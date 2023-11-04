package com.learning.testng;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGAssertions {
	public WebDriver driver;

	@BeforeMethod
	public void launchBrowser()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}


	//This assertion will return true if both the strings are matching

	//@Test
	public void verifyTitleUsingEquals()
	{
		driver.get("https://www.google.com");
		String  expectedTitle="Google";
		Assert.assertEquals(driver.getTitle(), expectedTitle);

		System.out.println("Assertion passed");

	}

	//This assertion will return return if both the string values are not matching and false if both are matching
	@Test
	public void verifyTitleUsingNotEquals()
	{
		driver.get("https://www.google.com");
		String  expectedTitle="Google";
		Assert.assertNotEquals(driver.getTitle(), expectedTitle);

		System.out.println("Assertion Failed");

	}

	//@Test
	public void verifyTitleUsingAssertTrue()
	{
		driver.get("https://www.google.com");
		String  expectedTitle="Google";
		Assert.assertTrue(driver.getTitle().equals(expectedTitle), "Assertion for Assert True has passed");
		
		System.out.println("Assertion passed");

	}
	
	//@Test
		public void verifyTitleUsingAssertFalse()
		{
			driver.get("https://www.google.com");
			String  expectedTitle="Google1";
			Assert.assertFalse(driver.getTitle().equals(expectedTitle)
					, "Assert False Passes");
			
			System.out.println("Assertion Failed");
			
		}


	@AfterMethod
	public void quitBrowser()
	{
		driver.quit();
	}

}
