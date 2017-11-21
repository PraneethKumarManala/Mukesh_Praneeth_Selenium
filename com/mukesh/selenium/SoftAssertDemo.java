package com.mukesh.selenium;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDemo {
	
	
	@Test
	public void softassertmethod(){
		SoftAssert assertion = new SoftAssert();
		System.out.println("Method Started");
		assertion.assertEquals(10, 12);
		System.out.println("Method Ends");
		assertion.assertAll();
		
	}

}
