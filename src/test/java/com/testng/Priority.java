package com.testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priority {
	
	@BeforeMethod
	private void login() {
		
		System.out.println("Login");

	}
	@Test(priority = 0)
	private void women() {
		
		System.out.println("women");
	}
	
	@Test(priority = -1)
	private void men() {
		
		System.out.println("men");

	}
	@Test(priority = 1)
	private void kids() {

		System.out.println("kids");

	}
	
	@AfterMethod
	private void Logout() {
		
		System.out.println("Logout");

	}
}
