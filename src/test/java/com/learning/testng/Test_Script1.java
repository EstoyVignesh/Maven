package com.learning.testng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Test_Script1 {
	
	

	
	WebDriver driver= new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	

	@BeforeMethod
	public void befoteMethod()
	{
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://profile.w3schools.com/");
	}

	@Test (enabled=false)
	public void test_tase1() throws InterruptedException
	{
		driver.findElement(By.xpath("//span[text()=' Sign up']")).click();
		
		//valiating or waiting until the Sign up label is visible
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//h1[text()='Sign up']"))));
		
		driver.findElement(By.name("email")).sendKeys("vickyphysics1998@gmail.com");	
		driver.findElement(By.name("new-password")).sendKeys("@Vigneshguvi11");
		driver.findElement(By.xpath("//span[text()='Sign up for free']")).click();
		
		//validating or waiting until first name field is visible
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("first_name"))));

		
		driver.findElement(By.name("first_name")).sendKeys("Vignesh");
		driver.findElement(By.name("last_name")).sendKeys("Palanisamy");
		driver.findElement(By.xpath("//span[text()='Continue']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()=' Log in']")).click();
	}

	@Test
	public void test_case2() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("email"))));
		
		
		driver.findElement(By.name("email")).sendKeys("vickyphysics1998@gmail.com");
		driver.findElement(By.name("current-password")).sendKeys("@Vigneshguvi11");
				
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Log in']")));
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[text()='My learning']"))));
		
		String expectedText="My learning | W3Schools";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertEquals(actualTitle,expectedText);
		System.out.println("Assertion Passed");
		
	}
	
	@AfterMethod
	public void afterMethod() throws InterruptedException
	{
		Thread.sleep(2000);
	//driver.quit();	
	}
	
	
	
	


}
