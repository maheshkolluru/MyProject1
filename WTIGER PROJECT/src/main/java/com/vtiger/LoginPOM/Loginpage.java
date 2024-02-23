package com.vtiger.LoginPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	@FindBy (name="user_name")
	private WebElement un;
	@FindBy (name="user_password")
	private WebElement pwd;
	@FindBy (id="submitButton")
	private WebElement login;
	public Loginpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getUn() {
		return un;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getLogin() {
		return login;
	}
	
	

}
