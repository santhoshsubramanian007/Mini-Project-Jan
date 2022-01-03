package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Ignore_Concept {
	
	@Test
	private void facebook() {
		
		System.out.println("facebook");
	}
	
	@Test
	private void whatapp() {
		
		System.out.println("whatapp");

	}
	@Test( enabled = false)
	private void amazon() {

		System.out.println("amazon");


}
	@Ignore
	@Test
	private void book() {

		System.out.println("book");


}
}
