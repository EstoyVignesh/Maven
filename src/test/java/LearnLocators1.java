import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators1 {
	//WebDriver driver =null;

	public static void main(String[] args) {
	
		
	WebDriver driver = new ChromeDriver();
	
	driver.get("https://www.google.com");
	
	driver.manage().window().maximize();
	
	//driver.findElement(By.name("q")).sendKeys("Selenium");
	
	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
	
	driver.getPageSource();
	
//	driver.getPageSource();
	
	
	driver.findElement(By.xpath("(//h3[text()='Selenium'])")).click();
	//h3[text()='Selenium']
	
	
	
	//driver.findElement(By.xpath("//input[@value='Google Search']")).click();
	
		

	}

}
	