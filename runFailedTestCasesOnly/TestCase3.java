package runFailedTestCasesOnly;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase3 {
	
	
	@Test
	public void method3(){
		
		Assert.assertTrue(true);
		
		System.out.println("Method 3 is passed");
	}

}
