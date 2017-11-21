package com.mukesh.selenium;

public class MethodsWithReturntype2 {

	public static void main(String[] args) {
		
		MethodsWithReturntype obj= new MethodsWithReturntype();
		int c=obj.sum(100, 200);
		System.out.println("The Total sum is "+c);
		int d=obj.sub(100, 50);
		System.out.println("The total sub is "+d);
		String FullName=MethodsWithReturntype.name("praneeth", "kumar");
        System.out.println("The Full Name is "+FullName);
        
	}

	
}
