package com.testng;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Groups {
	
	
	@Test(groups = "Social Media")
	private void facebook() {
		
		System.out.println("facebook");
	}
	
	@Test(groups = "Social Media")
	private void whatapp() {
		
		System.out.println("whatapp");

	}
	@Test(groups = "Shopping")
	private void amazon() {

		System.out.println("amazon");


}
	@Test(groups = "Shopping")
	private void flipkart() {

		System.out.println("flipkart");


}
	@Ignore
	@Test(groups = "Shopping")
	private void Sneapdeal() {

		System.out.println("Sneapdeal");


}
	@Test(groups = "books")
	private void book() {

		System.out.println("book");


}

}
