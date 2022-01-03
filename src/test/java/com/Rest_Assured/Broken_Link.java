package com.Rest_Assured;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Broken_Link {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\santhosh\\eclipse-workspace\\Mini_Project\\Driver\\chromedriver.exe");
		WebDriver c = new ChromeDriver();
		c.get("https://www.hyrtutorials.com/");
		//c.manage().window().maximize();

		List<WebElement> links = c.findElements(By.tagName("a"));
		System.out.println(links.size());

		for (WebElement link : links) {

			String linkURL = link.getAttribute("href");
			URL url = new URL(linkURL);
			URLConnection urlcon = url.openConnection();
			HttpURLConnection con = (HttpURLConnection) urlcon;
			con.setConnectTimeout(5000);
			con.connect();
			if (con.getResponseCode()>400) {

				System.out.println(url + "-" + con.getResponseCode()+ "- " + con.getResponseMessage());

			}
			con.disconnect();

		}
		c.quit();


	}


}
