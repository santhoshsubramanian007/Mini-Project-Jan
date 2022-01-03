package com.testng;

import org.testng.annotations.Test;

public class Time_Out_Test {
	
	@Test(timeOut = 13000)
	private void demo() throws Throwable {

		Thread.sleep(1000);
		System.out.println("Browser Launch");
		
		Thread.sleep(2000);
		
		System.out.println("signin button");
		
		Thread.sleep(3000);
		
		System.out.println("credentials");
		
		Thread.sleep(2000);
		
		System.out.println("navigate to next page");
		
		
	}

}
