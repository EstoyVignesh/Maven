package com.learning.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

static WebDriver driver = null;
	
	public static void main(String args[])
	{
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		WebElement source = driver.findElement(By.id("draggable"));
		WebElement target= driver.findElement(By.id("droppable"));
		
		Actions act= new Actions(driver);
		//act.dragAndDrop(source, target).build().perform();
		
		act.moveToElement(source).dragAndDrop(source, target).build().perform();
		
		String text= target.getText();
		
		if(text.equalsIgnoreCase("dropped!"))
		{
			System.out.println("The element has been dropped");
		}
		else
		{
			System.out.println("The element was not dragged");
		}

		
	}

}
