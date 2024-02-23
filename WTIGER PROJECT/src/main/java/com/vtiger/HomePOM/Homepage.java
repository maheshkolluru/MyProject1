package com.vtiger.HomePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(xpath="//span[text()=' Administrator']/../following-sibling::td/img")
	private WebElement admin;	
	@FindBy (linkText ="Sign Out")
	private WebElement signout;
	@FindBy (linkText="Campaigns")
	private WebElement campaignbtn;
	@FindBy(linkText="More")
	private WebElement morebtn;
	@FindBy(linkText="Organizations")
	private WebElement orgbtn;
	public WebElement getCampaignbtn() {
		return campaignbtn;
	}
	public Homepage(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
	}
	public WebElement getAdmin() {
		return admin;
	}
	public WebElement getSignout() {
		return signout;
	}
	public WebElement getMorebtn() {
		return morebtn;
	}
	public WebElement getOrgbtn() {
		return orgbtn;
	}

}
