package com.learning.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrames {
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.switchTo().frame("frame1");
		
		WebElement firstFrameText= driver.findElement(By.tagName("body"));
		System.out.println("First frame text-->"+firstFrameText.getText());
		Thread.sleep(2000);

		
		driver.switchTo().frame(0);
		String secondFrameText=driver.findElement(By.xpath("//p[text()='Child Iframe']")).getText();
		
		System.out.println("Second frame text-->"+secondFrameText);
		Thread.sleep(2000);

		
		//move the focus from second to first
		driver.switchTo().defaultContent();
		
		//move focus from first to main html
		driver.switchTo().defaultContent();
		Thread.sleep(2000);

		
		String mainPageText= driver.findElement(By.xpath("//div[@class='main-header']")).getText();
		System.out.println("Main page text-->"+mainPageText);

		
		//driver.quit();
		
		
		
		

	}

}
