package com.learning.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenkartAssignment_Total {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//input[@type='search']")).sendKeys("ber");
		Thread.sleep(3000);
		
		List<WebElement> allCartButtons=driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
		
		for(WebElement eachCartButton:allCartButtons)
		{
			Thread.sleep(1000);
			eachCartButton.click();
		}
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		Thread.sleep(1500);
		
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		
		
		List<WebElement> totalValues=driver.findElements(By.xpath("//tbody/tr/td[5]"));
		int totPrice=0;
		
		for(WebElement eachValue:totalValues)
		{
			String toalPrice=eachValue.getText();
			int price= Integer.parseInt(toalPrice); 
			totPrice=totPrice+price; //0+48
			//48+160=208
			//208+180=388
			
		}
		
		System.out.println("TotalPrice after calculation-->"+totPrice);
		
		String totalPriceFromPage= driver.findElement(By.xpath("//span[@class='totAmt']")).getText(); //388 from webage
		int totAmt=Integer.parseInt(totalPriceFromPage);
		System.out.println("Total Price from Webpage-->"+totAmt);
		
		//validation to compare the total prices
		if(totPrice==totAmt)
			
		{
			System.out.println("Both the price are equal");
		}
		else
		{
			System.out.println("Price is not equal");
		}
		
				
		
		
		
	}

}
