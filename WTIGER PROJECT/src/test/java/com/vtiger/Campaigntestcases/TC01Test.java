package com.vtiger.Campaigntestcases;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.CampaignPOM.Campaignhomepage;
import com.vtiger.CampaignPOM.Createnewcampaignpage;
import com.vtiger.HomePOM.Homepage;

import wtiger.Baseclass;
import wtiger.Driver;
import wtiger.excelutils;
import wtiger.iconstant;
@Listeners(wtiger.Listener.class)
public class TC01Test extends Baseclass {
	Homepage hm;
	Createnewcampaignpage cnp;
	
	
	@Test
	public void createnewcampaign() throws Throwable
	{
	e = new excelutils();
	hm=new Homepage(Driver.getDriver());
  cp = new Campaignhomepage(Driver.getDriver());
  cnp=new Createnewcampaignpage(Driver.getDriver());
  wd.movetoelement(Driver.getDriver(),hm.getMorebtn());
	hm.getCampaignbtn().click();
	cp.getPlusbtn().click();
	cnp.getCampaignnametextfields().sendKeys(e.singlecellfetch(iconstant.excelpath, iconstant.campaignsheet, 1,3));
	
	
		
	}

}
