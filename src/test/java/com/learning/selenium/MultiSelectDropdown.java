package com.learning.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropdown {
	static WebDriver driver=null;


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();
		
		Select sel= new Select(driver.findElement(By.id("cars")));
		
		//select by index
		sel.selectByIndex(1);
		Thread.sleep(2000);
		
		//select by value
		sel.selectByValue("volvo");
		Thread.sleep(2000);

		
		//select by visible text
		sel.selectByVisibleText("Audi");
		Thread.sleep(2000);

		
		System.out.println(sel.getFirstSelectedOption());
		
		List<WebElement> allOptions=sel.getOptions();
		
		for(WebElement eachOption:allOptions)
		{
			System.out.println(eachOption.getText());
		}
		
		sel.deselectAll();
		Thread.sleep(3000);
		
		

	}

}
