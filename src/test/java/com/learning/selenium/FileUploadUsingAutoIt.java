package com.learning.selenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FileUploadUsingAutoIt {
	
	public static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://the-internet.herokuapp.com/upload");
		 
		 Thread.sleep(3000);
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='file-upload']")));
		 

		 //driver.findElement(By.xpath("(//input[@type='file'])[1]")).click();
		 WebElement chooseFile=driver.findElement(By.xpath("//input[@id='file-upload']"));
		 chooseFile.click();
		 
		 Runtime.getRuntime().exec("C:\\Users\\arvin\\Documents\\fileupload.exe");
		
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
		/*	String  expectedTitle="File Uploaded!";
			WebElement upload = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
			Assert.assertEquals(upload.getText().equals(expectedTitle), true);

			System.out.println("Assertion Passed");*/
		 
	}

}
