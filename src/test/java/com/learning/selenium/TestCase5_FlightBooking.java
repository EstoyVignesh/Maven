package com.learning.selenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase5_FlightBooking {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Flight Booking']")).click();
		
		Set<String> bookingWindows = driver.getWindowHandles();
		
		for(String eachWindow:bookingWindows)
		{
		   Thread.sleep(2000);
		   driver.switchTo().window(eachWindow);
		}
		
		driver.findElement(By.id("familyandfriend")).click();
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		
		driver.findElement(By.xpath("//a[@value='MAA']")).click();
		
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		
		driver.findElement(By.xpath("//a[text()='11']")).click();
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.id("hrefIncAdt")).click();
		//driver.findElement(By.id("hrefIncAdt")).click();
		
		driver.findElement(By.id("hrefIncChd")).click();
		
		driver.findElement(By.id("hrefIncInf")).click();
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		Thread.sleep(3000);
		
		//driver.findElement(By.id("familyandfriend")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.name("ctl00$mainContent$btn_FindFlights")).click();
		Thread.sleep(3000);
		

		Alert alt = driver.switchTo().alert();
		
		System.out.println("The Text is --> "+alt.getText());
		
		alt.accept();
		Thread.sleep(2000);
		
		
		
		
	}

}
