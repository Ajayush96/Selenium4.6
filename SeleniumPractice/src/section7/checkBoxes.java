package section7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkBoxes {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();	
        
        driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		
		//Assertion
		Assert.assertTrue(true);
		
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
	
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("Its enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		
//		//count of checkboxes
//		
//		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
//		
//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(2000);
//		
//		for(int i=1;i<5;i++) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//		}
//		
//		driver.findElement(By.id("btnclosepaxoption")).click();
//		
//		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");
//
//		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
//		driver.close();
//		
//		Thread.sleep(2000);
//		
		
//		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
//		driver.findElement(By.xpath("//a[contains(text(),' Chennai (MAA)')]")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("(//a[contains(text(),'Delhi (DEL)')])[2]")).click(); 
//		
		//Handling calander
//		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
//		
//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		

	}

}
