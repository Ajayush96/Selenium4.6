package section11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1100)", "");
		Thread.sleep(2000);
		//Nov 22
		driver.findElement(By.id("form-field-travel_comp_date")).click();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[@class='flatpickr-day today']")).click();//current date
		
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("November"))
		{
		driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		
		List<WebElement> dates=driver.findElements(By.className("flatpickr-day"));
		//Grab the common attribute put into list and iterate
		int count=driver.findElements(By.className("flatpickr-day")).size();
		
		for(int i =0;i<count;i++)
		{
			String text=driver.findElements(By.className("flatpickr-day")).get(i).getText();
			if(text.equalsIgnoreCase("30"))
			{
				driver.findElements(By.className("flatpickr-day")).get(i).click();
				break;
			}
		}

	}

}
