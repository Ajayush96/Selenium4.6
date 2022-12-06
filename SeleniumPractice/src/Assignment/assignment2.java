package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.xpath("(//input[@class='form-control ng-untouched ng-pristine ng-invalid'])[1]"))
				.sendKeys("Ashish Jha");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("monayush9@gmail.com");
		Thread.sleep(1500);
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Test@123");
		Thread.sleep(1500);
		driver.findElement(By.id("exampleCheck1")).click();
		Thread.sleep(1500);

		WebElement gender = driver.findElement(By.id("exampleFormControlSelect1"));

		Select dropdown = new Select(gender);
		dropdown.selectByVisibleText("Female");

		Thread.sleep(1500);
		driver.findElement(By.id("inlineRadio2")).click();

		Thread.sleep(1500);

		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("15/04/1997");
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();

		Thread.sleep(1500);

		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());

		driver.close();

	}

}
