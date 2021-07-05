package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class Selecthotel extends BaseClass {
	public Selecthotel() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='radiobutton_0']")
	private WebElement select;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement sub;

	public WebElement getSelect() {
		return select;
	}

	public WebElement getSub() {
		return sub;
	}
}
