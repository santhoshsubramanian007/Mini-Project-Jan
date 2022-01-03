package com.Rest_Assured;

import java.io.File;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Json_Validation {
	
	public static void main(String[] args) throws Throwable {
		
		File f = new File("C:\\Users\\santhosh\\eclipse-workspace\\Mini_Project\\src\\test\\java\\com\\parse_json\\Payload.json");
		
		FileReader reader = new FileReader(f);
		
		JSONParser parser = new JSONParser();
		
		Object parse = parser.parse(reader);
		
		JSONObject jsonObj = (JSONObject) parse;
		
		Object object = jsonObj.get("Name");
		
		String value = object.toString();
		
		System.out.println("Name : " + value);
		
		
	}

}
