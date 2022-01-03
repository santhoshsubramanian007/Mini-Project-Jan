package com.Rest_Assured;

import org.junit.Assert;
import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Data_Validation {
	
	@Test
	public void validate_Data() {
	   
		RestAssured.baseURI="https://reqres.in/";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get("api/users/2");
		
		String response_Body = response.asString();
		
		System.out.println(response_Body);
		
		int statusCode = response.getStatusCode();
		
		System.out.println("status code : " + statusCode);
		
		Assert.assertEquals(200, statusCode);
		
		System.out.println("Data Validation Successfully");

	}

}
