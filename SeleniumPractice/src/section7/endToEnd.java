package section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class endToEnd {

	public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();	
        
        driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		
System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		//Assertion
		Assert.assertTrue(true);
		
		//From to To city option 
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[contains(text(),' Chennai (MAA)')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[contains(text(),'Delhi (DEL)')])[2]")).click(); 
		
		Thread.sleep(2000);

		//select Date from depart date
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		Thread.sleep(1500);
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		Thread.sleep(2000);
		

		//disable for Return date
		
//		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
//		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
//		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
	
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains(".5"))
		{
			System.out.println("Its Disable");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
		
		//Add pasaanger
		
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(2000);
		
		for(int i=1;i<5;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		
		Thread.sleep(1500);
		//select the currency
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select drodown = new Select(staticDropdown);
		drodown.selectByIndex(3);
		
		Thread.sleep(1500);

		//search the apply filter
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
	}

}
