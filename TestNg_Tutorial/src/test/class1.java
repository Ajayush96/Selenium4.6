package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class class1 {
	
	@AfterTest
	 public void AfterTest() 
    {
   	 System.out.println("I'll Execute Last");
    }
	@Test
     public void demo() 
     {
    	 System.out.println("Hello");
     }
	@Test
    public void SecondTest() 
    {
   	 System.out.println("bye");
    }
	

}
