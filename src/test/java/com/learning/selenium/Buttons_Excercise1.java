package com.learning.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Buttons_Excercise1 {

static WebDriver driver = null;
	
	public static void main(String args[])
	{
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		//RadioButton
		driver.findElement(By.xpath("//input[@value='radio2']")).click();
		
		//DropDown
		Select st = new Select(driver.findElement(By.name("dropdown-class-example")));
		st.selectByValue("option2");

		//CheckBox
		driver.findElement(By.id("checkBoxOption1")).click();
		driver.findElement(By.id("checkBoxOption3")).click();
	}

}
