package com.learning.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameter {
	
	public static WebDriver driver;
	
	@Test
	@Parameters({"url","searchTerm"})
	
	public void testDataParameterizationThroughXML(String urlLink, String searchText) throws InterruptedException
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(urlLink);
		
		driver.findElement(By.name("q")).sendKeys(searchText);
		Thread.sleep(2000);
		
		
	}

}
