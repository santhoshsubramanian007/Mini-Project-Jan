package com.Testng_Runner;

import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Adactin_Pom.AdatinPom;
import com.Adactin_Pom.Confirm;
import com.Adactin_Pom.Hotal_Detail;
import com.Adactin_Pom.Logout;
import com.Adactin_Pom.UserDetails;
import com.Base_Class.Baseclass;
import com.SdpAdactin.Page_Object_Manager2;
import com.helper.File_Reader_Manager;

public class Adactin extends Baseclass {

	public static WebDriver c = getBrowser("chrome");

	public static  Page_Object_Manager2 pom2 = new Page_Object_Manager2(c);

	public static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Adactin.class);

	@BeforeClass
	private void browserlaunch() throws Throwable {
		String url = File_Reader_Manager.getInstanceFRM().getInstanceCR().geturl();
		url(url);
		String log2 = File_Reader_Manager.getInstanceFRM().getInstanceCR().getIstancelog2();
		log.info(log2);

	}
	@BeforeMethod
	private void loginin() throws Throwable {
		String username = File_Reader_Manager.getInstanceFRM().getInstanceCR().getUsername();
		inputvalue(pom2.getInstanceus().getUsername(),username);
		String pass = File_Reader_Manager.getInstanceFRM().getInstanceCR().getIstancepass();
		String password = Data_From_Excel(pass, 2, 5);
		inputvalue(pom2.getInstanceus().getPassword(), password);
		clickonElement(pom2.getInstanceus().getLogin());

	}
	@Test 
	private void hoteldetails() throws Throwable {
		String log3 = File_Reader_Manager.getInstanceFRM().getInstanceCR().getIstancelog3();
		log.info(log3);
		String loc = File_Reader_Manager.getInstanceFRM().getInstanceCR().getIstanceloc();
		String location = Data_From_Excel(loc, 4, 5);
		String tex = File_Reader_Manager.getInstanceFRM().getInstanceCR().getIstancetex();
		dropdown(pom2.getInstancehd().getLocation(), tex, location);
		String hotel = File_Reader_Manager.getInstanceFRM().getInstanceCR().getIstancehotel();
		String Hotels = Data_From_Excel(hotel, 5, 5);
		dropdown(pom2.getInstancehd().getHotel(), tex, Hotels);
		String ind = File_Reader_Manager.getInstanceFRM().getInstanceCR().getIstanceind();
		String ones = File_Reader_Manager.getInstanceFRM().getInstanceCR().getIstanceone();
		String twos = File_Reader_Manager.getInstanceFRM().getInstanceCR().getIstancetwo();
		dropdown(pom2.getInstancehd().getRoomtype(), ind, ones);
		dropdown(pom2.getInstancehd().getRoomno(), ind, twos);
		dropdown(pom2.getInstancehd().getAdultroom(), ind, twos);
		dropdown(pom2.getInstancehd().getChildroom(), ind, twos);
		clickonElement(pom2.getInstancehd().getSumbit());

	}
	
	
	

	
	@AfterMethod
	private void logout() throws Throwable {
		
		c.findElement(By.xpath("//a[text()='Logout']")).click();

	//	String log5 = File_Reader_Manager.getInstanceFRM().getInstanceCR().getIstancelog5();
	//	log.info(log5);
	//	clickonElement(pom2.getInstancelg().getItiner());
	//	clickonElement(pom2.getInstancelg().getLogout());
	//	String log6 = File_Reader_Manager.getInstanceFRM().getInstanceCR().getIstancelog6();
	//	log.info(log6);

	}
}
