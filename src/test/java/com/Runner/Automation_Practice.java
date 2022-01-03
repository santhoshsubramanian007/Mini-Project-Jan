package com.Runner;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import com.Base_Class.Baseclass;
import com.Pom.Add_Cart;
import com.Pom.Address;
import com.Pom.Checkout;
import com.Pom.Home_Page;
import com.Pom.Shipping;
import com.Pom.Signin;
import com.Pom.Summary;
import com.Sdp.Page_Object_Manager;
import com.helper.File_Reader_Manager;

public class Automation_Practice extends Baseclass {

	public static WebDriver c = getBrowser("chrome");

	public static Page_Object_Manager pom = new Page_Object_Manager(c);

	public static Logger log = Logger.getLogger(Automation_Practice.class);

	public static void main(String[] args) throws Throwable {
		String property = File_Reader_Manager.getInstanceFRM().getInstanceCR().getInstanceproperty();
		PropertyConfigurator.configure(property);
		String brow = File_Reader_Manager.getInstanceFRM().getInstanceCR().getIstanceBrow();
		log.info(brow);
		String urlauto = File_Reader_Manager.getInstanceFRM().getInstanceCR().getIstanceurlauto();
		url(urlauto);
		String log2 = File_Reader_Manager.getInstanceFRM().getInstanceCR().getIstancelog2();
		log.info(log2);
		implicitlyWait(30, TimeUnit.SECONDS);
		clickonElement(pom.getInstancehp().getShirts());
		String ind = File_Reader_Manager.getInstanceFRM().getInstanceCR().getIstanceind();
		String win = File_Reader_Manager.getInstanceFRM().getInstanceCR().getIstancewin();
		scroll(ind, win, null);
		implicitlyWait(30, TimeUnit.SECONDS);
		clickonElement(pom.getInstanceaddcart().getAddcart());
		implicitlyWait(30, TimeUnit.SECONDS);
		clickonElement(pom.getInstancecheckout1().getCheckout1());
		implicitlyWait(30, TimeUnit.SECONDS);
		clickonElement(pom.getInstancesum().getSummary());
		implicitlyWait(30, TimeUnit.SECONDS);
		String Datadriven = File_Reader_Manager.getInstanceFRM().getInstanceCR().getIstancedatadriven();
		String username = Data_From_Excel(Datadriven, 6, 5);
		inputvalue(pom.getInstancesign().getMail(), username);
		implicitlyWait(30, TimeUnit.SECONDS);
		String password = Data_From_Excel(Datadriven, 7, 5);
		inputvalue(pom.getInstancesign().getPass(), password);
		String log3 = File_Reader_Manager.getInstanceFRM().getInstanceCR().getIstancelog3();
		log.info(log3);
		implicitlyWait(30, TimeUnit.SECONDS);
		clickonElement(pom.getInstancesign().getSign());
		implicitlyWait(30, TimeUnit.SECONDS);
		clickonElement(pom.getInstanceout().getOut());
		implicitlyWait(30, TimeUnit.SECONDS);
		clickonElement(pom.getInstancesh().getAgree());
		implicitlyWait(30, TimeUnit.SECONDS);
		clickonElement(pom.getInstancesh().getCheckbox());
		scroll(ind, win, null);
		String img = File_Reader_Manager.getInstanceFRM().getInstanceCR().getIstanceimg();
		takesnap(img);
	}
}		


