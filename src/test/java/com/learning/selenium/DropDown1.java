package com.learning.selenium;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown1 {

	static WebDriver driver=null;
	
	public static void main(String[] args) {
		
		try
		{
			driver = new ChromeDriver();
			driver.get("https://demoqa.com/select-menu");
			driver.manage().window().maximize();
			
			System.out.println("The title is -->"+driver.getTitle());
			
			System.out.println("The url is "+driver.getCurrentUrl());
			
			Select st = new Select(driver.findElement(By.id("oldSelectMenu")));
			
			st.selectByIndex(6);
			Thread.sleep(2000);
			
			st.selectByValue("1");
			Thread.sleep(2000);
			
			st.selectByVisibleText("Aqua");
			Thread.sleep(2000);
			
			
			
			List<WebElement> options = st.getOptions();
			
			for(WebElement web :options)
			{
				System.out.println("The Options Lists are --> "+web.getText());
				
			}
			
			Select sel = new Select(driver.findElement(By.id("cars")));
			
			
			sel.selectByIndex(0);
			Thread.sleep(2000);
			
			sel.selectByValue("saab");
			Thread.sleep(2000);
			
			
			sel.selectByVisibleText("Audi");
			Thread.sleep(2000);
			
			sel.deselectAll();
			Thread.sleep(2000);
			
			List<WebElement> options1 = sel.getOptions();
			
			for(WebElement web1 :options1)
			{
				
				System.out.println("The Options1 Lists are --> "+web1.getText());
			}
			
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
			
			
		}

}
