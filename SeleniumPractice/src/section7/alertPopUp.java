package section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertPopUp {

	public static void main(String[] args) {
		
        WebDriver driver = new ChromeDriver();	
        
        driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Ashish Jha");
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();

	}

}
