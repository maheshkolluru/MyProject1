package com.vtigerorg.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class organisationhomepage {
	@FindBy(css="img[title='Create Organization...']")
	private WebElement plusbtn;
	 public organisationhomepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getPlusbtn() {
		return plusbtn;
	}
	 

}
