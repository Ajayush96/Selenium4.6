package section13;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class brokenUrl {

	public static void main(String[] args) throws MalformedURLException, IOException {

		WebDriver driver = new ChromeDriver();

		// broken Url
		// get all URl's
		// javamethods will call URL's and gets you the status code
		// if status code is grater then 400 it means it is not working

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		List<WebElement> links = driver.findElements(By.xpath("//li[@class='gf-li']/a"));
		
		SoftAssert a = new SoftAssert();
		
		
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			// System.out.println(url);

			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();// call open connection
			// this method is present in url class, return type HttpURLConnection and cast
			// it

			conn.setRequestMethod("HEAD");
			conn.connect();
			int responseCode = conn.getResponseCode();
           System.out.println(responseCode);
           //soft assertion
           a.assertTrue(responseCode<400,"The Link with text " + link.getText() + " is broken with code" + responseCode);
           
//			if (responseCode > 400) {
//				System.out.println("The Link with text " + link.getText() + " is broken with code" + responseCode);
//				Assert.assertTrue(false);
//			}
		}
		

	}

}
