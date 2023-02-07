package Login_Page.test;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.Pages.FacebookPage;
import PageObject.Pages.GoogleSeachPage;

public class testMethod {
	WebDriver driver;
	
	@BeforeTest
	public void beforeTest()
	{
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.google.com/");
	}
	
	@Test(priority=1)
	public void GooglsearchText() throws InterruptedException
	{
		GoogleSeachPage page = new GoogleSeachPage(driver);
		page.googleSeach("Facebook");
		page.clickFacebook();
	}
	@Test(priority=2)
	public void facebookLoginVerify() throws InterruptedException
	{
		FacebookPage page = new FacebookPage(driver);
		page.enterCreds("ttn.uat@gmail.com", "ttn@12345");
		page.loginVerify();
	}
	
	@AfterTest
	public void afterTest()
	{
		driver.quit();
	}

}
