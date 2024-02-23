package com.vtigerorg.POM;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class memberspage {
	@FindBy(name="search_text")
	private WebElement searchfield;
	@FindBy(name="search")
	private WebElement searchbtn;
	@FindBy(xpath="//div[@style='overflow:auto;height:348px;']/table/tbody/tr/td")
	private List<WebElement> data;
	public List<WebElement> getData() {
		return data;
	}
	public memberspage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public WebElement getSearchfield() {
		return searchfield;
	}
	public WebElement getSearchbtn() {
		return searchbtn;
	}
	

}
