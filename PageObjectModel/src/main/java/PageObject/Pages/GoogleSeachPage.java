package PageObject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class GoogleSeachPage {
	
	WebDriver driver;
	
	public GoogleSeachPage(WebDriver driver)
	{
		this.driver = driver;
	}
	By search = By.xpath("//input[@name='q']");
	
	By search_text=By.xpath("(//input[@name='btnK'])[1]");
	
	By Link_Text = By.xpath("//a//h3[text()='Facebook - log in or sign up']");
	
	public void googleSeach(String SearchInput) throws InterruptedException
	{
		try {
			driver.findElement(search).sendKeys(SearchInput);
			Thread.sleep(2000);
			driver.findElement(search_text).click();
			Thread.sleep(2000);
		} catch(Exception e) {
			System.out.println("Exception caught "+ e.getMessage());
		}
	}
	
	public void clickFacebook()
	{
		try {
			driver.findElement(Link_Text).click();	
		} catch(Exception e) {
			System.out.println("Exception caught "+ e.getMessage());
		}
	}
	
	

}
