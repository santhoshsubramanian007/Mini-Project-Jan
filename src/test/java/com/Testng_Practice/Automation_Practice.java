package com.Testng_Practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automation_Practice {

	
  //  System.setProperty("webdriver.chrome.driver", "C:\\Users\\santhosh\\eclipse-workspace\\Mini_Project\\Driver\\chromedriver.exe");
    ChromeDriver c = new ChromeDriver();

	
	@BeforeClass
	private void browserlaunch() {
	

		c.get("http://automationpractice.com/index.php");

	}
	@BeforeMethod
	private void login() {
		
		
		c.findElement(By.xpath("//a[@class='login']")).click();
		c.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("sansmech30@gmail.com");
		c.findElement(By.xpath("//input[@type='password']")).sendKeys("manisans@007");
		c.findElement(By.xpath("(//button[@type='submit'])[3]")).click();

	}
		
	@Test
	private void shirt() {
		
		
		c.findElement(By.xpath("(//a[@title='T-shirts'])[2]")).click();
		c.findElement(By.xpath("(//img[@title='Faded Short Sleeve T-shirts'])[1]")).click();
		
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.findElement(By.xpath("//span[text()='Add to cart']")).click();
		
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.findElement(By.xpath("//span[normalize-space()='Proceed to checkout']")).click();
		
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]")).click();
		
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("sansmech30@gmail.com");
		
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.findElement(By.xpath("//input[@type='password']")).sendKeys("manisans@007");
		
		JavascriptExecutor js = (JavascriptExecutor)c;
		js.executeScript("window.scrollBy(0,600);","");
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.findElement(By.xpath("//i[@class='icon-lock left']")).click();
		
	
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,200);","");
		c.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();
		
		
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		js.executeScript("window.scrollBy(0,200);","");
		c.findElement(By.xpath("//input[@type='checkbox']")).click();
		
		c.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		c.findElement(By.xpath("(//span[normalize-space()='Proceed to checkout'])[2]")).click();
		
	
	}
	}		


