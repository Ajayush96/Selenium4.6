import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class jdbcconnection {

	public static void main(String[] args) throws SQLException, InterruptedException {

		String host = "localhost";
		String port = "3306";

		Connection con =
		DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/Qadbt","debian-sys-maint","6MpWcizTn9nMqEOt");
		
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from Employeeinfo where Id=1");
		while(rs.next()) {
		System.out.println(rs.getString("Name"));
		System.out.println(rs.getString("location"));
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://login.salesforce.com/?locale=in");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys(rs.getString("Name"));
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(rs.getString("location"));
			driver.quit();
			
		}
	}

}
