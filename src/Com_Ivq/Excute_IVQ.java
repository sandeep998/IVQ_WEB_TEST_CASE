package Com_Ivq;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Excute_IVQ extends Base_IVQ{
	
	ExtentReports reports;
	ExtentTest logger;
	
	@BeforeClass
	public void before() throws Exception {
		 reports = new ExtentReports("C:\\Users\\sandeep.mandhala\\eclipse-workspace\\Live_suite\\for_eBiz.html", true);
		 logger=reports.startTest("verify test");
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sandeep.mandhala\\Downloads\\All Jar files selenium\\chromedriver.exe");
			driver=new ChromeDriver();
			logger.log(LogStatus.PASS, "Open Browser");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			logger.log(LogStatus.ERROR, "Getting error while opening the browser"+e.getLocalizedMessage());
			logger.log(LogStatus.FAIL, "fail"+screenshot(driver));
		}
		
		try {
			driver.get("http://ec2-18-223-254-193.us-east-2.compute.amazonaws.com/");
			
			windowMaximize();
			logger.log(LogStatus.PASS, "Open URL and maximize the window");
			
		} catch (Exception e) {
			logger.log(LogStatus.FAIL, "fail"+screenshot(driver));
			// TODO Auto-generated catch block
		
		}
		
			
		
	}
	

@Test
public void ecCute() throws Exception {
	
	try {
		POM_IVQ.userName(driver, "admin@ivq.com");
		logger.log(LogStatus.PASS, "Entered Username");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		logger.log(LogStatus.FAIL, "screenshot"+screenshot(driver));
	}
	try {
		POM_IVQ.passWord(driver, "123456");
		logger.log(LogStatus.PASS, "entered Password");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		logger.log(LogStatus.FAIL, "screenshot"+screenshot(driver));
	}
	try {
		POM_IVQ.signIn(driver);
		logger.log(LogStatus.INFO, "Signin Sccussfully");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		logger.log(LogStatus.FAIL, "unble to signin"+screenshot(driver));
		
	}
	POM_IVQ.createAdInventory(driver);
	
	try {
		POM_IVQ.appScreenDropdown(driver);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		logger.log(LogStatus.FAIL,e.getLocalizedMessage(), "not selecting dropdown"+screenshot(driver));
	}

	POM_IVQ.appInventoryName(driver, "postname");
	
}

@AfterMethod
public void tearDown() {
	reports.flush();
	reports.endTest(logger);
	driver.quit();
}

}
