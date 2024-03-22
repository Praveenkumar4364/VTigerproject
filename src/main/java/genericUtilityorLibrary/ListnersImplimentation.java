package genericUtilityorLibrary;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

/**
 * THis is generic class provides implementation to ITestListners Interface of TestNG
 * @author praveen
 *
 */
public class ListnersImplimentation implements ITestListener{
	ExtentReports report;
	ExtentTest test;
	
	
	public void onTestStart(ITestResult result) {
		//@Test-Method
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"----------Test execution started-----------");
		
		test = report.createTest(methodName);
	}

	
	
	public void onTestSuccess(ITestResult result) {
		
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"----------Test Pass-----------");
		
		test.log(Status.PASS,methodName+"-----Test Pass----");
	}

	
	
	public void onTestFailure(ITestResult result) {
		
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"----------Test Fail-----------");
		System.out.println(result.getThrowable());
		
		test.log(Status.FAIL,methodName+"-----Test Fail-----");
		test.log(Status.INFO,result.getThrowable());
		
		//Capture Screen shot
		SeleniumUtility sUtil=new SeleniumUtility();
		JavaUtility jUtil=new JavaUtility();
		String ScreenShotName=methodName+"_"+jUtil.getSystemDate();
		try {
			String path = sUtil.captureScreenShot(Base_Class.sdriver, ScreenShotName);
			
			test.addScreenCaptureFromPath(path);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	
	public void onTestSkipped(ITestResult result) {
		
		String methodName=result.getMethod().getMethodName();
		System.out.println(methodName+"----------Test Skip-----------");
		System.out.println(result.getThrowable());
		
		test.log(Status.SKIP,methodName+"----------Test Skip-----------");
		test.log(Status.INFO,result.getThrowable());
	}

	
	
	
	
	public void onStart(ITestContext context) {
		System.out.println("----------suite execution started-----------");
		
		ExtentSparkReporter htmlrep=new ExtentSparkReporter(".\\ExtentReports\\Report-"+new JavaUtility().getSystemDate()+".html");
		htmlrep.config().setDocumentTitle("Execution Report");
		htmlrep.config().setReportName("Vtiger Report");
		htmlrep.config().setTheme(Theme.DARK);
		
		report=new ExtentReports();
		report.attachReporter(htmlrep);
		report.setSystemInfo("Base Platform","Windows");
		report.setSystemInfo("Base Browser","Chrome");
		report.setSystemInfo("Base Env","Test Env");
		report.setSystemInfo("Reporter Name","Praveen");
	}

	public void onFinish(ITestContext context) {
		System.out.println("----------suite execution finished-----------");
		
		report.flush();
	}

	
	
	
	
	
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	

}
