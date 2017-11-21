package TestNG_Demo;

import org.testng.Assert;
import org.testng.annotations.Test;



public class TestNGClass1 {

	
	@Test
	public void method1(){
		
		System.out.println("Method 1 is successfull");
	}
	@Test
	public void method2(){
		
		Assert.assertTrue(false);
		System.out.println("Method 2 is successfull");
	}
	@Test
	public void method3(){
		
		System.out.println("Method 3 is successfull");
	}
}
