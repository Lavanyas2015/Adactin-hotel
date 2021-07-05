package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;

public class Homesceen extends BaseClass {

	public  Homesceen() {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@id='location']")
	private WebElement location;
	
	@FindBy(xpath="//select[@id='hotels']")
	private WebElement hotel;
	
	@FindBy(xpath="//select[@id='room_type']")
	private WebElement room;
	
	@FindBy(xpath="//select[@id='room_nos']")
	private WebElement roomno;
	
	@FindBy(xpath="//select[@id='adult_room']")
	private WebElement adult_room;
	

	@FindBy(xpath="//select[@id='child_room']")
	private WebElement child_room;
	
	@FindBy(xpath="//input[@id='Submit']")
	private WebElement submit;


	public WebElement getLocation() {
		return location;
	}


	public WebElement getHotel() {
		return hotel;
	}


	public WebElement getRoom() {
		return room;
	}


	public WebElement getRoomno() {
		return roomno;
	}


	public WebElement getAdult_room() {
		return adult_room;
	}


	public WebElement getChild_room() {
		return child_room;
	}


	public WebElement getSubmit() {
		return submit;
	}
	
	
	
	
	
	
		
	
}
