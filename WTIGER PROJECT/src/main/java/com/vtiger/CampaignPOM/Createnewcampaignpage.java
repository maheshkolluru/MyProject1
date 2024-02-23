package com.vtiger.CampaignPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Createnewcampaignpage {
@FindBy(name="campaignname")
private WebElement campaignnametextfields;
@FindBy(id="targetaudience")
private WebElement targetaudiencetext;
@FindBy(id="sponsor")
private WebElement sponsertext;
@FindBy(id="targetsize")
private WebElement targetsizetext;
@FindBy(css="input[title='Save [Alt+S]']")
private WebElement savebtn;
 public Createnewcampaignpage(WebDriver driver)
{
PageFactory.initElements(driver,this);

}
public WebElement getCampaignnametextfields() {
	return campaignnametextfields;
}
public WebElement getSavebtn() {
	return savebtn;
}
public WebElement getTargetaudiencetext() {
	return targetaudiencetext;
}
public WebElement getSponsertext() {
	return sponsertext;
}
public WebElement getTargetsizetext() {
	return targetsizetext;
}


}
