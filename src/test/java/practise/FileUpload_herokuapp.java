package practise;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class FileUpload_herokuapp {
	public static WebDriver driver=null;

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 
		 driver.get("https://the-internet.herokuapp.com/upload");
		 
		 Thread.sleep(5000);
		 
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		 wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='file-upload']")));
		 
 
		 Actions act1 = new Actions(driver);
		 WebElement chooseFile=driver.findElement(By.xpath("//input[@id='file-upload']"));
	   	 act1.moveToElement(chooseFile).build().perform();
		 act1.click();
		 Thread.sleep(3000);
		 
		 //Runtime.getRuntime().exec("C:\\Users\\arvin\\Documents\\fileupload.exe");
		 
		 chooseFile.sendKeys("C:\\Users\\arvin\\Documents\\fileupload.exe");	
		 Thread.sleep(3000);
		 driver.findElement(By.id("file-submit")).click();
		 
		 Thread.sleep(3000);

		 if(driver.getPageSource().contains("File Uploaded!"))
		 {
			 System.out.println("Successfully uploaded the file");
		 }
		 else
		 {
			 System.out.println("File upload failed");
		 }
		 
		   // driver.get("https://the-internet.herokuapp.com/upload");
			/*String  expectedTitle="File Uploaded!";
			WebElement upload = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
			Assert.assertEquals(upload.getText().equals(expectedTitle), true);

			System.out.println("Assertion Passed");*/
		 
	}

}
