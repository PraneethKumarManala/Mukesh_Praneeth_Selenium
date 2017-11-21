package TestNG_Demo;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestNGClass2 {

	
	@Test
	public void method4(){
		
		System.out.println("Method 4 is successfull");
	}
	@Test
	public void method5(){
		
		Assert.assertTrue(false);
		System.out.println("Method 5 is successfull");
	}
	@Test
	public void method6(){
		
		System.out.println("Method 6 is successfull");
	}
}
