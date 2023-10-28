package com.learning.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DatePickerEx {

	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		
		
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	/*	WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame1);
		
		  driver.findElement(By.id("datepicker")).click();
		
        Actions act = new Actions(driver);
		
		//Finding xpath and applying
		WebElement source = driver.findElement(By.xpath("//a[@class='ui-state-default']"));
		//moving the Cursor to the Element
		act.moveToElement(source).build().perform();
		//To Hold the Mouse at the for 3 Seconds
		Thread.sleep(3000);
		
      		
        driver.findElement(By.xpath("//a[@class=' ui-datepicker-week-end ']")).sendKeys("22");
       // driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();
		//System.out.println("Second frame text-->"+secondFrameText);
		Thread.sleep(2000);

		//System.out.println(date.getText());*/
		
		  WebElement f = driver .findElement(By.xpath("//iframe[@class='demo-frame']"));
	      driver.switchTo().frame(f);
	      //identify element within frame
	      WebElement l = driver.findElement(By.id("datepicker"));
	      l.click();
	      //identify all td elements in list
	      List<WebElement> t =driver.findElements(By.xpath("//table/tbody/tr/td"));
	      Thread.sleep(3000);
	      //list traversal
	      for (int k = 0; k<t.size(); k++) {
	         //check date
	         String dt = t.get(k).getText();
	         if (dt.equals("22")) {
	            t.get(k).click();
	            //break;
	         }
	      }
	      //obtain selected date
	      String v = l.getAttribute("value");
	      Thread.sleep(3000);
	      System.out.print("Date selected by date picker: "+ v);
	      //close browser
	      Thread.sleep(5000);
	      driver.close();

	}

}
