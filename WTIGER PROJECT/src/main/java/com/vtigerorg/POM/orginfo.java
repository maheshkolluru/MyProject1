package com.vtigerorg.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class orginfo {
	@FindBy(className  ="dvHeaderText")
	private WebElement titleorg;
	public orginfo(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getTitleorg() {
		return titleorg;
	}
	
	

}
