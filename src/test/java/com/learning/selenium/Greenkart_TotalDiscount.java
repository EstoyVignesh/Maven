package com.learning.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Greenkart_TotalDiscount {

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
		
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='promoBtn']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));	
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='promoInfo']")));

		String response = driver.findElement(By.xpath("//span[@class='promoInfo']")).getText();
		System.out.println("The Coupen Apply response is :"+response);
		
		
		/*String totalDiscount = driver.findElement(By.xpath("//span[@class='discountPerc']")).getText();		
		int discountPer = Integer.parseInt(totalDiscount);		
		System.out.println("Total Discount Percentage is "+discountPer+"%");*/
		
		String totalDiscountPrice = driver.findElement(By.xpath("//span[@class='discountPerc']")).getText();
		
		String totalDiscountPri = totalDiscountPrice.split("%")[0];  //10
		
		//10%20%30% -> %
		
		System.out.println("The Total Discount Percentage is "+totalDiscountPri);
		
		//to convert string to decimal number(float)		
		double totalDisc = Double.parseDouble(totalDiscountPri);
		System.out.println(totalDisc);
		
		double totalDisCal = totAmt - (totAmt*totalDisc)/100;
		System.out.println("calculated amount-->"+totalDisCal);
		
		Thread.sleep(2000);
		
		String totalAfterDiscount = driver.findElement(By.xpath("//span[@class='discountAmt']")).getText();
		System.out.println("Price After Discount is "+totalAfterDiscount);
		
		double totalAfterDiscount1 =Double.parseDouble(totalAfterDiscount);
		
		if(totalDisCal==totalAfterDiscount1)
		{
			System.out.println("The Total Calculated Discount is Same");
		}else
		{
		System.out.println("Not Same");
		}

	}

}
