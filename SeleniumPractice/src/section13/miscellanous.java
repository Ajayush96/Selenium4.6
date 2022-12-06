package section13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class miscellanous {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
		
		driver.manage().deleteCookieNamed("sessionKey");
		//click on any link
		    //login page-- verify login URL
		
		driver.get("https://google.com");
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);//1. cast our driver obj to 
		//takeScreenshot by using getScreenShot
		FileUtils.copyFile(src,new File("/home/ashish/Desktop/screenshot.png"));
		
		driver.close();
		

	}

}
