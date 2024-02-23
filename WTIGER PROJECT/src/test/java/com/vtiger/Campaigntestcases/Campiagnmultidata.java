package com.vtiger.Campaigntestcases;

import org.testng.annotations.Test;

import com.vtiger.CampaignPOM.Campaignhomepage;
import com.vtiger.CampaignPOM.Createnewcampaignpage;
import com.vtiger.HomePOM.Homepage;

import wtiger.Baseclass;
import wtiger.Driver;
import wtiger.Webdriverutils;

public class Campiagnmultidata  extends Baseclass{
	
	@Test(dataProvider = "campaign",dataProviderClass = wtiger.Dataprovider.class)
	public void multidatacampaigncreate(String cname,String sname,String taudi,String tsize)
	{
		wd=new Webdriverutils();
		hm=new Homepage(Driver.getDriver());
		cp=new Campaignhomepage(Driver.getDriver());
		Createnewcampaignpage cnp=new Createnewcampaignpage(Driver.getDriver());
		wd.movetoelement(Driver.getDriver(),hm.getMorebtn());
		hm.getCampaignbtn().click();
		cp.getPlusbtn().click();
		cnp.getCampaignnametextfields().sendKeys(cname);
		cnp.getSponsertext().sendKeys(sname);
		cnp.getTargetaudiencetext().sendKeys(taudi);
		cnp.getTargetsizetext().sendKeys(tsize);
		cnp.getSavebtn().click();
		
	}
	

}
