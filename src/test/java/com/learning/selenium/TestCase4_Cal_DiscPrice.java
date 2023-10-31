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
			int oriPrice=0;
			
			List<WebElement> dscountP=driver.findElements(By.xpath("//tbody/tr[1]/td[3]"));
			int DiscountPrice=0;
			
			
			//int oriPri = Integer.parseInt(originalP);
			
			for(WebElement oriPri:originalP)
			{
				String originalPrice=oriPri.getText();
				int price= Integer.parseInt(originalPrice); 
				
				for(WebElement disPri:dscountP)
				{
				String discountPrice=oriPri.getText();
				int discprice= Integer.parseInt(discountPrice); 
				
				int origDisc=(price/discprice)*100;
				
			//	String originalDiscountPer =
				//48+160=208
				//208+180=388
				}
			}
			
			//String origDisc;
		//	System.out.println("TotalPrice after calculation-->"+origDisc);
			
			

		}
	}

}
