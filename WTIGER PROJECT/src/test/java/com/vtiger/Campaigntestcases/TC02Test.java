package com.vtiger.Campaigntestcases;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.CampaignPOM.Campaignhomepage;
import com.vtiger.CampaignPOM.Masseditspage;
import com.vtiger.HomePOM.Homepage;

import wtiger.Baseclass;
import wtiger.Driver;
import wtiger.excelutils;
import wtiger.iconstant;
@Listeners(wtiger.Listener.class)
public class TC02Test extends Baseclass {
	Masseditspage mp ;
	@Test
	public void editcampaign() throws Throwable
	{
		mp=new Masseditspage(Driver.getDriver());
		e = new excelutils();
		hm=new Homepage(Driver.getDriver());
	  cp = new Campaignhomepage(Driver.getDriver());
	  wd.movetoelement(Driver.getDriver(),hm.getMorebtn());
		hm.getCampaignbtn().click();
		cp.getSelectfrstcampn().click();
		cp.getMasseditsbtn().click();
		mp.getEditcampaignnamefields().sendKeys(e.singlecellfetch(iconstant.excelpath,iconstant.campaignsheet, 1, 3));
		mp.getEditsavebutton().click();
		
	}

}
