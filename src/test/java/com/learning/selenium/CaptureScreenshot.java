package com.learning.selenium;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class CaptureScreenshot {

	public static WebDriver driver=null;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		driver= new ChromeDriver();
		driver.get("https://www.yahoo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File dest= new File("./screenshots/sample.png");
		
		//user.dir ==> C:\Users\arvin\eclipse-workspace\selenium_learning
		
		File dest= new File(System.getProperty("user.dir")+"/screenshots/sample.png");
		
		FileUtils.copyFile(src, dest);





	}

}
