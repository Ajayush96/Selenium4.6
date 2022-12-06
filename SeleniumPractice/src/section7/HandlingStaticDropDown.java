package section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingStaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriver driver = new ChromeDriver();	
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");                      
		
		//dropdwon handling
		
//		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		
//		Select drodown = new Select(staticDropdown);
//		drodown.selectByIndex(3);
//		System.out.println(drodown.getFirstSelectedOption().getText());
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.close();

	}

}
