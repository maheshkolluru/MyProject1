package com.vtiger.CampaignPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Masseditspage {
	@FindBy(name="campaignname")
	private WebElement editcampaignnamefields;
	@FindBy(css="input[class='crmbutton small save']")
	private WebElement editsavebutton;
	public Masseditspage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public WebElement getEditcampaignnamefields() {
		return editcampaignnamefields;
	}
	public WebElement getEditsavebutton() {
		return editsavebutton;
	}
	

}
