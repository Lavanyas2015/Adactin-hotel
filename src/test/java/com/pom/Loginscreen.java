package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class Loginscreen extends BaseClass {

	public Loginscreen() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[starts-with(@id,'password')]")
	private WebElement password;
	
    
	@FindBy(xpath="//input[@id='login']")
	private WebElement login;
	
	@FindBy(xpath="//b[text()='Invalid Login details or Your Password might have expired. ']")
	private WebElement invalid;
	
	@FindBy(xpath="//td[text()='Welcome to Adactin Group of Hotels']")
	private WebElement homescreen;
	
	@FindBy(xpath="//span[text()='Enter Username']")
	private WebElement Enteruser;

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getInvalid() {
		return invalid;
	}

	public WebElement getHomescreen() {
		return homescreen;
	}

	public WebElement getEnteruser() {
		return Enteruser;
	}
}
