package com.vtiger.CampaignPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Campaignhomepage {
	
	@FindBy(xpath="//img[@title='Create Campaign...']")
	private WebElement plusbtn;
	@FindBy(name="selected_id")
	private WebElement selectfrstcampn;
	@FindBy(css="input[value='Mass Edit']")
	private WebElement masseditsbtn;
	@FindBy(css="input.crmbutton.small.delete")
	private WebElement deletebtn;
	@FindBy(name="search_text")
	private WebElement searchtextfield;
	@FindBy(name="submit")
	private WebElement searchbtn;
	@FindBy(id="alpha_2")
	private WebElement alphabetB;
	@FindBy(id="qccombo")
	private WebElement quickcreatedropdown;
	@FindBy(linkText="edit")
	private WebElement editinactionsbtn;
	@FindBy(css="img[title='Last Viewed']")
	private WebElement lastviewedcampaignsbtn;
	
public WebElement getDeletebtn() {
		return deletebtn;
	}
public Campaignhomepage(WebDriver driver){
	PageFactory.initElements(driver,this);
	
}
	public WebElement getPlusbtn() {
		return plusbtn;
	}
	public WebElement getSelectfrstcampn() {
		return selectfrstcampn;
	}
	public WebElement getMasseditsbtn() {
		return masseditsbtn;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	public WebElement getSearchtextfield() {
		return searchtextfield;
	}
	public WebElement getAlphabetB() {
		return alphabetB;
	}
	public WebElement getQuickcreatedropdown() {
		return quickcreatedropdown;
	}
	
	public WebElement getEditinactionsbtn() {
		return editinactionsbtn;
	}
	public WebElement getLastviewedcampaignsbtn() {
		return lastviewedcampaignsbtn;
	}
	
	
	

}
