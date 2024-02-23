package com.vtiger.Campaigntestcases;

import org.testng.annotations.Test;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.HomePOM.Homepage;

import wtiger.Baseclass;
import wtiger.Driver;
import wtiger.Webdriverutils;
@Listeners(wtiger.Listener.class)
public class TC05Test extends Baseclass {
@Test
public void opencampaignpage()
{
	hm=new Homepage(Driver.getDriver());
	wd=new Webdriverutils();
	wd.movetoelement(Driver.getDriver(),hm.getMorebtn());
	hm.getCampaignbtn().click();
}
}
