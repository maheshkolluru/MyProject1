package com.vtiger.Campaigntestcases;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.CampaignPOM.Campaignhomepage;
import com.vtiger.HomePOM.Homepage;

import wtiger.Baseclass;
import wtiger.Driver;
@Listeners(wtiger.Listener.class)
public class TC10 extends Baseclass {
@Test
public void listoflastviewedcampaigns() {
	hm=new Homepage(Driver.getDriver());
	  cp = new Campaignhomepage(Driver.getDriver());
	  wd.movetoelement(Driver.getDriver(),hm.getMorebtn());
		hm.getCampaignbtn().click();
		cp.getLastviewedcampaignsbtn().click();
	
}
}
