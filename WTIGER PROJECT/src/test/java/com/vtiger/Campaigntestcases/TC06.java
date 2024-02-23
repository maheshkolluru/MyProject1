package com.vtiger.Campaigntestcases;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.CampaignPOM.Campaignhomepage;
import com.vtiger.HomePOM.Homepage;

import wtiger.Baseclass;
import wtiger.Driver;
import wtiger.Webdriverutils;
import wtiger.excelutils;
import wtiger.iconstant;
@Listeners(wtiger.Listener.class)
public class TC06 extends Baseclass {
	@Test
	public void searchcampaignbysearchfield() throws Throwable
	{
		hm=new Homepage(Driver.getDriver());
		wd=new Webdriverutils();
		cp=new Campaignhomepage(Driver.getDriver());
		e=new excelutils();
		wd.movetoelement(Driver.getDriver(),hm.getMorebtn());
		hm.getCampaignbtn().click();
		cp.getSearchtextfield().sendKeys(e.singlecellfetch(iconstant.excelpath,iconstant.campaignsheet, 3, 3));
		cp.getSearchbtn().click();
	}

}
