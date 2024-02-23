package com.vtiger.Campaigntestcases;

import org.testng.annotations.Test;
import javax.swing.plaf.basic.BasicArrowButton;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.CampaignPOM.Campaignhomepage;
import com.vtiger.HomePOM.Homepage;

import wtiger.Baseclass;
import wtiger.Driver;
import wtiger.Webdriverutils;
@Listeners(wtiger.Listener.class)
public class TC03Test extends Baseclass {
	@Test
	public void deletecampaign()
	{
		hm=new Homepage(Driver.getDriver());
		wd=new Webdriverutils();
		cp= new Campaignhomepage(Driver.getDriver());
		wd.movetoelement(Driver.getDriver(),hm.getMorebtn());
		hm.getCampaignbtn().click();
		cp.getSelectfrstcampn().click();
		cp.getDeletebtn().click();
		wd.alertpopup(Driver.getDriver()).accept();
		
		
		
	}

}
