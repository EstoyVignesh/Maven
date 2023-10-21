package com.learning.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop1 {

static WebDriver driver = null;
	
	public static void main(String args[])
	{
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.xpath("//div[text()='Drag me']"));
		WebElement target =driver.findElement(By.xpath("//p[text()='Drop here']"));
		
		Actions act1 = new Actions(driver);
		
		act1.moveToElement(source).dragAndDrop(source, target).build().perform();
		
		String text = target.getText();
		
		if(text.equalsIgnoreCase("Dropped!"))
		{
			System.out.println("The Drag and Drop Action is Performed");
		}else
			System.out.println("Action Failed"); 
				
		

	}

}
