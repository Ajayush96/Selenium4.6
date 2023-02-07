package PageObject.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookPage {
	
	WebDriver driver;
	public FacebookPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By userName = By.id("email");
	By passWd = By.id("pass");
	By login_Page = By.name("login");
	
	public void enterCreds(String username, String Pass) throws InterruptedException
	{
		driver.findElement(userName).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(passWd).sendKeys(Pass);
		Thread.sleep(2000);
	}
	
	public void loginVerify()
	{
		driver.findElement(login_Page).click();
	}

}
