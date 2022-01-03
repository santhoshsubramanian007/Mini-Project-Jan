package com.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public WebDriver c ;

	public Login(WebDriver c2) {

		this.c = c2;

		PageFactory.initElements(c, this);
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy(xpath = "//a[@class='login']")
	private WebElement login;

}
