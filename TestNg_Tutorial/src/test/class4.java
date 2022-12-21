package test;

import org.testng.annotations.Test;

public class class4 {
	
	@Test(groups={"smoke"})
	public void WebLoginHomeLoan()
	{
		System.out.println("WebLoginHomeLoan");
	}
	
	@Test
	public void MobileLoginHomeLoan()
	{
		System.out.println("MobileLoginHomeLoan");
		
	}
	
	@Test
	public void LoginApiHomeLoan()
	{
		System.out.println("LoginApiHomeLoan");
		
	}

}
