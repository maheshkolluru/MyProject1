package com.vtiger.Campaigntestcases;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.CampaignPOM.Campaignhomepage;
import com.vtiger.HomePOM.Homepage;

import wtiger.Baseclass;
import wtiger.Driver;
import wtiger.Webdriverutils;
@Listeners(wtiger.Listener.class)
public class TC04Test extends Baseclass{
	@Test
	public void canceldelete() {
		
	hm=new Homepage(Driver.getDriver());
	wd=new Webdriverutils();
	cp= new Campaignhomepage(Driver.getDriver());
	wd.movetoelement(Driver.getDriver(),hm.getMorebtn());
	hm.getCampaignbtn().click();
	cp.getSelectfrstcampn().click();
	cp.getDeletebtn().click();
	wd.alertpopup(Driver.getDriver()).dismiss();;
	}
}
