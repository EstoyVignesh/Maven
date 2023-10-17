package com.learning.selenium;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*
 * Implicit wait is called as global wait. It will wait for the given amount of time because throwing the exception
 */

public class ImplicitWaitDemo {
	static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		Select sel= new Select(driver.findElement(By.id("cars")));
		
		//select by index
		sel.selectByIndex(1);
		
		//select by value
		sel.selectByValue("volvo");

		
		//select by visible text
		sel.selectByVisibleText("Audi");
		
		System.out.println(sel.getFirstSelectedOption());
		
		List<WebElement> allOptions=sel.getOptions();
		
		for(WebElement eachOption:allOptions)
		{
			System.out.println(eachOption.getText());
		}
		
		sel.deselectAll();
		
	}

}
