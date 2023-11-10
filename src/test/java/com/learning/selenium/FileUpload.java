package com.learning.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class FileUpload {
	
	public static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		 driver.get("https://the-internet.herokuapp.com/upload");
		 
		 driver.findElement(By.id("file-upload")).sendKeys("C:\\Users\\arvin\\Downloads\\TestFileUpload.png");
		 
		 
		 driver.findElement(By.id("file-submit")).click();
		 
		 Thread.sleep(3000);

		 if(driver.getPageSource().contains("File Uploaded!"))
		 {
			 System.out.println("Successfully uploaded the file");
		 }
		 else
		 {
			 System.out.println("File upload failed");
		 }
		 
		   // driver.get("https://the-internet.herokuapp.com/upload");
			String  expectedTitle="File Uploaded!";
			WebElement upload = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
			Assert.assertEquals(upload.getText().equals(expectedTitle), true);

			System.out.println("Assertion Passed");
		 
	}

}
