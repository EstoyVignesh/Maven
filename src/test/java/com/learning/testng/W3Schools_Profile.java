package com.learning.testng;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class W3Schools_Profile {
	
	WebDriver driver= new ChromeDriver();
	WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
	
	@BeforeTest
	public void profile()
	{
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://profile.w3schools.com/");
			
	}
	
	@Test
	public void test_case1() throws InterruptedException 
	{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("email"))));
		
		
		driver.findElement(By.name("email")).sendKeys("vickyphysics1998@gmail.com");
		driver.findElement(By.name("current-password")).sendKeys("@Vigneshguvi11");
				
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Log in']")));
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
						
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[@id='profile-link']"))));
		
		driver.switchTo().frame("top-nav-bar-iframe");
		
		driver.findElement(By.id("profile-link")).click();
		Thread.sleep(2000);
		
				
		//WebElement profile1 =driver.findElement(By.xpath("//textarea[text()='testing']"));
				
		JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true);",profile1);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		js.executeScript("window.scrollTo(0,1300);");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Edit']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@value='estoyVignesh']")).clear(); //vignesh11estoyVignesh
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@value='estoyVignesh']")).sendKeys("estoyVignesh");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//button[@class='Button_button__F-5UA Button_primary__nC-4W Nick_action_btn__89VvV']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement profile2 =driver.findElement(By.xpath("//div[text()='Bio']"));
		
		JavascriptExecutor js1 = (JavascriptExecutor)driver;
		js1.executeScript("arguments[0].scrollIntoView(true);",profile2);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

		//driver.findElement(By.xpath("//textarea[text()='testing']")).click();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//textarea[contains(@id,'profile_bio')]")).clear();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//textarea[contains(@id,'profile_bio')]")).sendKeys("I have Learned about Manual and Automation Testing in Guvi");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
        /*WebElement profile3 =driver.findElement(By.xpath("//span[text()='Content']"));
		
		JavascriptExecutor js3 = (JavascriptExecutor)driver;
		js3.executeScript("arguments[0].scrollIntoView(true);",profile3);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));*/
		
		//js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		//Thread.sleep(2000);
		
		
		
		WebElement button = driver.findElement(By.xpath("(//div[@class='Button_wrapper__lGxfQ'])[3]"));
		js1.executeScript("arguments[0].scrollIntoView(true);",button);
		
		
		Actions act = new Actions(driver);
		wait.until(ExpectedConditions.elementToBeClickable(button));
		act.click().perform();
		
		        		
		//Alert alert = driver.switchTo().alert();
		WebElement popup = driver.findElement(By.xpath("//div[text()='Successfully saved public profile']"));
		wait.until(ExpectedConditions.visibilityOf(popup));
		String texts = popup.getText();
	//
		System.out.println(texts);
		///
		
		//
		//setTimeout(function(){debugger;},5000);
		//)
	}
	
	@Test(enabled=false)
	public void test_Case2()
	{
		driver.findElement(By.xpath("//a[@id='profile-link']")).click();
	}
}
