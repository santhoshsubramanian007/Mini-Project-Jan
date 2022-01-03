package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Simple_Annotation {
	
	@BeforeSuite
	private void setProperty() {
		
		System.out.println("set Property");

	}
	
	@BeforeTest
	private void browserlaunch() {
		
		System.out.println("browserlaunch");

	}
	@BeforeClass
	private void url() {
		
		System.out.println("url");

	}
	
	@BeforeMethod
	private void login() {
		
		System.out.println("Login");

	}
	@Test
	private void women() {
		
		System.out.println("women");
	}
	
	@Test
	private void men() {
		
		System.out.println("men");

	}
	@Test
	private void kids() {

		System.out.println("kids");

	}
	
	@AfterMethod
	private void Logout() {
		
		System.out.println("Logout");

	}
	@AfterClass
	private void verifyHomePage() {
		
		System.out.println("verifyHomePage");

	}
	@AfterTest
	private void Close() {
		
		System.out.println("close");

	}
	@AfterSuite
	private void deleteAllcookies() {
		
		System.out.println("close");

	}
	

}
