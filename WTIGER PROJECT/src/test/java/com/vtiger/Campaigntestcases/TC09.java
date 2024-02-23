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
@Listeners(wtiger.Listener.class)
public class TC09  extends Baseclass{
	@Test
	public void editinactioncolumn() {
		
		e = new excelutils();
		hm=new Homepage(Driver.getDriver());
	  cp = new Campaignhomepage(Driver.getDriver());
	  wd.movetoelement(Driver.getDriver(),hm.getMorebtn());
		hm.getCampaignbtn().click();
		cp.getSelectfrstcampn().click();
		cp.getEditinactionsbtn().click();
	}

}
