package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class Parameterized_Test {
	
	@Test
	@org.testng.annotations.Parameters({"username","password"})
	private void credentails(@Optional("dhoni")String Username, @Optional("virat123")String password) {

		System.out.println("Username : "+ Username);
		
		System.out.println("password : "+ password);

	}
}
