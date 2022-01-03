package com.testng;

import org.testng.annotations.Test;

public class Invocation_Count {
	
	@Test(priority = 0)
	private void women() {
		
		System.out.println("women");
	}
	
	@Test(priority = -1)
	private void men() {
		
		System.out.println("men");

	}
	@Test(priority = 1, invocationCount = 5)
	private void refersh() {

		System.out.println("refersh");


}
}
