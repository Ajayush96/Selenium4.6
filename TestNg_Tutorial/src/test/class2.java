package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class class2 {
	
	@Test(groups={"smoke"})
    public void PLoan() 
    {
   	 System.out.println("Good");
    }
	@BeforeTest
	public void prerequiste()
	{
		System.out.println("I'll execute first");
	}

}
