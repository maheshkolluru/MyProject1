package wtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.vtiger.CampaignPOM.Campaignhomepage;
import com.vtiger.HomePOM.Homepage;
import com.vtiger.LoginPOM.Loginpage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
 public	Webdriverutils wd;
 public propertyutils p;
public  Loginpage l;
 
 public Homepage hm;
 public Campaignhomepage cp;
 public excelutils e;
 public  Driver D;
 
 
 
@BeforeClass
public void setup() throws Throwable
{
	
wd= new Webdriverutils();
p=new propertyutils();
l=new Loginpage(Driver.getDriver());
D=new Driver();

D.browserlaunchh(iconstant.chromelauch);
wd.maximizewindow(Driver.getDriver());
wd.implicitwait(Driver.getDriver(), 10);
wd.openapp(Driver.getDriver(),p.filedatafetch(iconstant.proppath,"url"));


}

@BeforeMethod
public void login() throws Throwable
{
	wd= new Webdriverutils();
	p=new propertyutils();
	l=new Loginpage(Driver.getDriver());
	l.getUn().sendKeys(p.filedatafetch(iconstant.proppath, "un"));
	l.getPwd().sendKeys(p.filedatafetch(iconstant.proppath, "pwd"));
	l.getLogin().click();
}

@AfterMethod
public void logout() {
	wd= new Webdriverutils();
	hm= new Homepage(Driver.getDriver());
	p=new propertyutils();
    wd.movetoelement(Driver.getDriver(), hm.getAdmin()); 
	hm.getSignout().click();
	
}
@AfterClass
public void tearup()
{
	Driver.getDriver().close();	
}
}

