package section11;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//Give me the count of Link on the page
		//Give me the count of Link on the footer section page
		//Give me the count of Link on the footer section of the First column page
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement FooterDriver = driver.findElement(By.id("gf-BIG"));//Limiting Webdriver scope
		
		System.out.println(FooterDriver.findElements(By.tagName("a")).size());
		
		WebElement ColumnDriver = FooterDriver.findElement(By.xpath("//tbody/tr/td[1]/ul[1]"));
		System.out.println(ColumnDriver.findElements(By.tagName("a")).size());
		
		//click on each link of column and check if the pages are opening
		for(int i =1;i<ColumnDriver.findElements(By.tagName("a")).size();i++)
		{
			String clickonlinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			ColumnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000);
		}	
			Set<String> abc =driver.getWindowHandles();
			Iterator<String> it = abc.iterator();
		
			while(it.hasNext())     //if there is any next window present or not
			{
				driver.switchTo().window(it.next()); //iterator control move to base
				System.out.println(driver.getTitle());
			}
		
		driver.close();

	}

}
