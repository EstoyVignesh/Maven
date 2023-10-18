package task_16;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Q2_DemoBlaze {

	static WebDriver driver = null;
	
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		WebElement web =driver.findElement(By.xpath("//a[@id='nava']"));
		web.click();
		
		//String web1 = driver.getTitle();
		System.out.println(driver.getTitle());
		
		if(web.equals(driver.getTitle()))
		{
			System.out.println("Page landed on Correct Website");
		}else
			System.out.println("Page not Landed on Correct Website");
		
	}

}
