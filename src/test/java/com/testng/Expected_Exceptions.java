package com.testng;

import org.testng.annotations.Test;

public class Expected_Exceptions {
	
	@Test(expectedExceptions = ArithmeticException.class)
	private void demos() {
		
		int age = 10;
		
		System.out.println(age/0);

	}
}
