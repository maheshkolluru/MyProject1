package com.vtigerorg.POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class creatingorganisationpage {
	@FindBy(name="accountname")
	private WebElement orgnamebtn;
	@FindBy(css="input[title='Save [Alt+S]']")
	private WebElement savebtn;
	@FindBy(css="img[title='Select']")
	private WebElement memplusbtn;
	public WebElement getMemplusbtn() {
		return memplusbtn;
	}
	public creatingorganisationpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getOrgnamebtn() {
		return orgnamebtn;
	}
	public WebElement getSavebtn() {
		return savebtn;
	}
	
	

}
