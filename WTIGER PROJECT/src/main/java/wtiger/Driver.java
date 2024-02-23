package wtiger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {
	WebDriver driver ;
static	ThreadLocal<WebDriver> th = new ThreadLocal<WebDriver>();
	public static WebDriver getDriver()
	{
	return	th.get();
	}
	public static void setDriver(WebDriver driver)
	{
		th.set(driver);
	}
	public void browserlaunchh(String brow)
	{
		if(brow.equals("chrome"))
		{
			
			WebDriverManager.chromedriver().setup();
			
			driver= new ChromeDriver();
			setDriver(driver);
			
		}
		if(brow.equals("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver= new EdgeDriver();
			setDriver(driver);
		}
		
	}

}
