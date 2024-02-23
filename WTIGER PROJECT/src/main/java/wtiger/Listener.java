package wtiger;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listener implements ITestListener {
	
	ExtentReports er;
	ExtentSparkReporter esr;
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		String testcasename=result.getName();
		Reporter.log("Test case started"+testcasename,true);
		test= er.createTest(testcasename);
	}

	public void onTestSuccess(ITestResult result) {
		String testcasename=result.getName();
		Reporter.log("Test case executed successfully"+testcasename,true);
		test.log(Status.PASS,"test case executed succesfully"+testcasename);
	}

	public void onTestFailure(ITestResult result) {
		String sspath = null;
		Webdriverutils wd = new Webdriverutils();
		javautils ju = new javautils();
		String testcasename=result.getName();
		Reporter.log("Test case failed"+testcasename);
		try {
		sspath=	wd.screenshot(Driver.getDriver(),iconstant.screenshot+testcasename+ju.currentdate()+".png");
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		test.addScreenCaptureFromPath(sspath);
		
		
	}

	public void onTestSkipped(ITestResult result) {
		String testcasename=result.getName();
		Reporter.log("Test case skipped"+testcasename,true);
		test.log(Status.SKIP,"testcase skipped"+testcasename);
	}

	public void onStart(ITestContext context) {
		javautils ju= new javautils();
		String project=context.getName();
		Reporter.log("project started"+project,true);
       ExtentSparkReporter esr = new ExtentSparkReporter(iconstant.reports+ju.currentdate());
	esr.config().setDocumentTitle("VTIGER");
	esr.config().setReportName("Mahesh");
	esr.config().setTheme(Theme.DARK);
	esr.config().setTimeStampFormat(ju.currenttime());
	er= new ExtentReports();
	er.attachReporter(esr);
	er.setSystemInfo("Window", "10");
	er.setSystemInfo("browser", "chrome");
	
	}

	public void onFinish(ITestContext context) {
		String project=context.getName();
		Reporter.log("project finished"+project,true);
		er.flush();
	}

}
