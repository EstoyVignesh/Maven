package task_16;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q3_Wikipedia {
static WebDriver driver = null;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.wikipedia.org/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys("Artificial Intelligence");
		
		driver.findElement(By.xpath("//input[@id='searchInput']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//span[text( )='View history']")).click();
		
		System.out.println(driver.getTitle());
		

	}

}
