package section12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class javascriptExecutor {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		List<WebElement> count=driver.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
		int sum=0;
		int size=count.size();
		System.out.println(size);
		
		for(int i=0;i<size;i++)
		{
			System.out.println(Integer.parseInt(count.get(i).getText()));
			sum=sum+ Integer.parseInt(count.get(i).getText());
		}
		System.out.println("Sum of all the Amount "+ sum);
		
		
		int Total=Integer.parseInt(driver.findElement
				(By.xpath("//div[contains(text(),'Total Amount Collected: 296')]")).getText().split(":")[1].trim());
		System.out.println(Total);
		
		Assert.assertEquals(sum, Total);
		

	}

}
