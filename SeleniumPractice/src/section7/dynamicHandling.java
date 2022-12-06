package section7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicHandling {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();	
        
        driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("//a[contains(text(),' Chennai (MAA)')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[contains(text(),'Delhi (DEL)')])[2]")).click(); 
		
		//AutoSuggestive dropdown
		
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(1500);
		
		List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for(WebElement option: options)
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
				break;
			}
		}
		
		
		
		

	}

}
