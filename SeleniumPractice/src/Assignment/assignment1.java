package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();	
        
        driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/"); 
		
	
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		Thread.sleep(2000);
		driver.findElement(By.id("checkBoxOption1")).click();
		
		System.out.println(driver.findElement(By.id("checkBoxOption1")).isSelected());
		
		
		List<WebElement> ele = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int check = 0;
		
		for(int i =0; i<ele.size(); i++)
		{
			check++;
		}
		System.out.println(check);
		
		
   
	}

}
