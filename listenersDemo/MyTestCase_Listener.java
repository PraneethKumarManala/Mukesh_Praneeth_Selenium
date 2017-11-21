package listenersDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTestCase_Listener {

	@Test
	public void method1(){
		System.out.println("Test Method 1 is passed");
		
	}
	@Test
	public void method2(){
		Assert.assertTrue(false);
		System.out.println("Test Method 2 is passed");
		
	}
	@Test(dependsOnMethods={"method2"} )
	public void method3(){
		System.out.println("Test Method 1 is passed");
		
	}
}
