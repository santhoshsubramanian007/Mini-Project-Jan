package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Assert_Concept {
	
	@Test
	private void demo_Username() {
		
		String expected_username = "Dhoni";
		
		String actual_username = "dhoni";
		
		Assert.assertNotEquals(expected_username, actual_username);
		
		
		System.out.println("username validation was successfully");
				
	}

@Test(priority = 1)
private void demo_password() {
	
	String expected_username = "Dhoni123";
	
	String actual_username = "Dhoni123";
	
	Assert.assertEquals(expected_username, actual_username);
	
	
	System.out.println("password validation was successfully");
			
}
}
