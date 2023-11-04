package com.learning.selenium;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase4_Cal_DiscPrice {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		
		
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[text()='Top Deals']")).click();
		
		Set<String> allWindows = driver.getWindowHandles();
		
		for(String eachWindow: allWindows)
		{
			Thread.sleep(2000);
			driver.switchTo().window(eachWindow);
		}
		
		Thread.sleep(3000);
		
		List<WebElement> allValues =driver.findElements(By.xpath("//tbody/tr"));
		System.out.println("Total No. of Rows :"+allValues.size());
		
		for(int i=1;i<=1;i++)
		{
			List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr/td"));
			
			for(WebElement eachRow:rows)
			{
				System.out.println(eachRow.getText());
			}
			
			//List<WebElement> totalValues=driver.findElements(By.xpath("//tbody/tr[1]/td"));
		//	int totDiscPrice=0;
			
			List<WebElement> originalP=driver.findElements(By.xpath("//tbody/tr[1]/td[2]"));
			double origDisc=0;
			
			List<WebElement> dscountP=driver.findElements(By.xpath("//tbody/tr[1]/td[3]"));
		
			double DiscountPrice=0;
			
			
			//int oriPri = Integer.parseInt(originalP);
			
			for(WebElement oriPri:originalP)
			{
				String originalPrice=oriPri.getText();
				double price= Double.parseDouble(originalPrice); 
				System.out.println("The Oiginal Price is "+price);
				
				for(WebElement disPri:dscountP)
				{
				String discountPrice=disPri.getText();
				double discprice= Double.parseDouble(discountPrice); 
				System.out.println("The Discount Price is "+discprice);
				
			    origDisc=(discprice/price)*100;
				
				//String origDisc =Integer.toString();
				
	
				}
			}
			
			//String origDisc;
			
			//System.out.printf("TotalPrice after calculation-->"+"%.2f",origDisc);
			
			System.out.println(Math.round(origDisc)+"%");
			
			
			//String discountPercentage = Double.toString(origDisc);
			//System.out.println("String valued - TotalPrice after calculation-->"+discountPercentage+"%");
			
			

		}
	}

}
