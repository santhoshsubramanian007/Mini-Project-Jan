package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Iretry_Analyser {
	
	@Test(retryAnalyzer = Rerun.class)
	private void credentails() {
	
	String expected = "Dhoni";
		
		String actual = "Dhoni";
		
		Assert.assertEquals(actual, expected);
		
	}
	
	@Test(retryAnalyzer = Rerun.class)
   private void credentails1() {
	
	String expected_username = "Dhoni";
		
		String actual_username = "dhoni123 ";
		
		Assert.assertEquals(actual_username, expected_username);
}
}
