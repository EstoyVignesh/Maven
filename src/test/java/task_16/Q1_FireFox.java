package task_16;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Q1_FireFox {
static WebDriver driver = null;

	public static void main(String[] args) {
		
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		
		//To get the current url
		System.out.println("The Text of the URL is : "+driver.getCurrentUrl());
		
		//To reload the Page
		driver.get(driver.getCurrentUrl());	
		driver.close()	;
		


	}

}
