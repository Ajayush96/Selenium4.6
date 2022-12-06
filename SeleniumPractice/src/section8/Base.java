package section8;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		String[] itemNeeded = {"Brocolli","Cucumber","Beetroot","Carrot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Thread.sleep(3000);
		addItems(driver, itemNeeded);
		
		//Thread.sleep(3000);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.cssSelector("input[class='promoCode']")));
		driver.findElement(By.cssSelector("input[class='promoCode']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		//grab text after getting applied coupen
		//explicit wait
		
		wait.until(ExpectedConditions.visibilityOfElementLocated
				(By.xpath("//span[contains(text(),'Code applied ..!')]")));
		
		String Text=driver.findElement(By.xpath("//span[contains(text(),'Code applied ..!')]")).getText();
		System.out.println(Text);
		String applied = "Code applied ..!";
		//validated getting text is valid or invalid
		Assert.assertEquals(Text, applied);
		driver.findElement(By.xpath("//button[contains(text(),'Place Order')]")).click();
		

	}
	
	public static void addItems(WebDriver driver,String[] itemNeeded)
	{
		int j =0;
        List<WebElement> product=driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0;i<product.size();i++)
		{
			//Brocoli - 1 Kg
			
			String[] name =product.get(i).getText().split("-");
			
//			name[0] = "Brocolli";
//			name[1] = "- 1 kg";
			
			String formattedName=name[0].trim();
			
			//format it to get actual vegetable name
			//check weather name you extracted is present in array or not
			//convert array into the array list for easy search
			
			List itemNeededList = Arrays.asList(itemNeeded);
			
			//if (name.contains("Cucumber"))
			
			if(itemNeededList.contains(formattedName))
			{
				j++;
				//click on add to cart
				driver.findElements(By.xpath("//div[@class= 'product-action']/button")).get(i).click();
				if(j==itemNeeded.length)
				{
					break;
				}
			}
		}
	}

}
