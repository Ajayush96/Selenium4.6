package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class class3 {
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("beforeClass");
	}
	@AfterClass
	public void AfterClass()
	{
		System.out.println("@AfterClass");
	}
	@Parameters({"URL"})
	@Test(groups={"smoke"})
	public void WebLoginCarLoan(String urlName)
	{
		System.out.println("WebLoginCar");
		System.out.println(urlName);
	}
	
	@Test
	public void MobileLoginCarLoan()
	{
		System.out.println("MobileLoginCarLoan");
		
	}
	@BeforeMethod
	public void beforeevery()
	{
		System.out.println("Run before every");
	}
	@AfterMethod
	public void afterevery()
	{
		System.out.println("Run after every");
	}
	@Test(dataProvider="getData")
	public void mobileSignoutcarLoan(String username, String password)
	{
		System.out.println("Signout");
		System.out.println(username);
		System.out.println(password);
	}
	@BeforeSuite
	public void BfSuite()
	{
		System.out.println("I'm No. One");
	}
	@AfterSuite
	public void AfSuite()
	{
		System.out.println("I'm last");
	}
	
	@Test(dependsOnMethods={"WebLoginCarLoan","MobileLoginCarLoan"})
	public void MobileLoginApiCarLoan()
	{
		System.out.println("LoginApiCarLoan");
		
	}
	
	@DataProvider
	public Object[][] getData()
	{
		//ist combination
		//2nd username passwd
		//3rd fraudland
		
		Object[][] data = new Object[3][2];
		//first set
		data[0][0]="firstsetusername";
		data[0][1]="password";
		//2nd set
		data[1][0]="2ndsetusername";
		data[1][1]="secondpassword";
		
		//3rd set
		data[2][0]="3rdsetusername";
		data[2][1]="thirdpassword";
		
		return data;
		
		
	}

}
