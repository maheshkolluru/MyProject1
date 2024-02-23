package com.vitger.orgtestcases;

import static org.testng.Assert.assertTrue;

import java.util.Set;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.vtiger.CampaignPOM.Campaignhomepage;
import com.vtiger.HomePOM.Homepage;
import com.vtigerorg.POM.creatingorganisationpage;
import com.vtigerorg.POM.memberspage;
import com.vtigerorg.POM.organisationhomepage;
import com.vtigerorg.POM.orginfo;

import wtiger.Baseclass;
import wtiger.Driver;
import wtiger.Webdriverutils;
import wtiger.excelutils;
import wtiger.iconstant;
import wtiger.javautils;
@Listeners(wtiger.Listener.class)
public class TC01Test extends Baseclass {
	creatingorganisationpage cop;
	organisationhomepage ohp;
	orginfo oi;
	javautils j;
	memberspage mp;
	@Test
	public void orgnamevalidation() throws Throwable {
		hm=new Homepage(Driver.getDriver());
		mp=new memberspage(Driver.getDriver());
		wd=new Webdriverutils();
		j=new javautils();
		e= new excelutils();
		cop = new creatingorganisationpage(Driver.getDriver());
		ohp=new organisationhomepage(Driver.getDriver());
		oi=new orginfo(Driver.getDriver());
		mp=new memberspage(Driver.getDriver());
	hm.getOrgbtn().click();
	ohp.getPlusbtn().click();
	String expdata=(e.singlecellfetch(iconstant.excelpath,iconstant.orgsheet, 1, 3))+j.randomnumber(1000);
	cop.getOrgnamebtn().sendKeys(expdata);
	cop.getSavebtn().click();
	
	String actdata=oi.getTitleorg().getText();	

	 Assert.assertTrue(actdata.contains(expdata),"the oragnisation name is not same");
	Reporter.log("orgnisation name validated");
	wd.backward(Driver.getDriver());
	cop.getMemplusbtn().click();;
	Thread.sleep(3000);
	wd.multiwindow(Driver.getDriver(),iconstant.membersurl);
mp.getSearchfield().sendKeys(expdata);
	mp.getSearchbtn().click();
	wd.multiele(expdata,mp.getData());
	wd.multiwindow(Driver.getDriver(),iconstant.orgurl );
	
	
		
	}

}
