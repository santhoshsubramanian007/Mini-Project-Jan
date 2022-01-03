package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Multiple_Datas {
	
	@Test(dataProvider = "testData")
	private void data(String username, int password) {
		

		System.out.println("Username : "+ username);
		
		System.out.println("password : "+ password);

	}
	
	@DataProvider
	private Object[][] testData() {
		
		return new Object[][] {
			
			{"VIRAT", 25},
			
			{"DHONI", 125},
			
			{"FGH", 14},
			
			{"GTYH", 145},
			
			{"GDTY", 147}
			
			
		};
			
			
		

	

}}
