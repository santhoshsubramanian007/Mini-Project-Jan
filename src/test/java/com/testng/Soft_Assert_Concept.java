package com.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Soft_Assert_Concept {
	
	@Test
	private void demo_Username() {
		
		String expected_username = "Dhoni";
		
		String actual_username = "123 ";
		
		SoftAssert soft = new SoftAssert();
		
		soft.assertNotEquals(expected_username, actual_username);
		
		
		System.out.println("username validation was successfully");
				
	}

}
