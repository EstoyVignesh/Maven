package com.learning.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class JavaScriptExecutorEx {

static WebDriver driver = null;
	
	public static void main(String args[]) throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//To ScrollDown
		js.executeScript("window.scrollTo(0,1000);");
		Thread.sleep(2000);
		
		//To ScrollUp
		js.executeScript("window.scrollTo(1000,0);");
		Thread.sleep(2000);
		
		//To ScrollDown to the End of the Content
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		Thread.sleep(2000);
		
		//To ScrollUp to the Starting of the Content
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight);");
		Thread.sleep(2000);
		
		//To ScrollRight to the End of the Content
		js.executeScript("window.scrollTo(document.body.scrollWidth,0);");
				
		System.out.print(js.executeScript("return document.title;"));
		
		
		//to scroll until a particular webelement
		WebElement greenKartText= driver.findElement(By.xpath("//strong[text()='GreenKart']"));
		js.executeScript("arguments[0].scrollIntoView(true);",greenKartText);
		
		//to click on a particular webelement 
		WebElement cartIcon= driver.findElement(By.xpath("//a[@class='cart-icon']"));
		js.executeScript("arguments[0].click();", cartIcon);
		Thread.sleep(2000);
		
		//type in text in a input box
		WebElement searchBox=driver.findElement(By.xpath("//input[@type='search']"));
		js.executeScript("arguments[0].value='cucumber';", searchBox);

	}

}
