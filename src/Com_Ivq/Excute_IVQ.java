package Com_Ivq;


import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Excute_IVQ extends Base_IVQ{
	POM_Personal selectuser;
	POM_Business company;
	POM_Social social;
	
@Test
public void createUser() throws Exception {
	
	selectuser	=new POM_Personal(driver);
	POM_IVQ.userName(driver, "admin@ivq.com");
	
	POM_IVQ.passWord(driver, "123456");
	POM_IVQ.signIn(driver);
	
	Thread.sleep(3000);
	
	selectuser.clickUser(driver);
	Thread.sleep(5000);
	System.out.println("clicked user");
	selectuser.clickImage(driver);
	Thread.sleep(3000);
	Runtime.getRuntime().exec("C:\\Users\\sandeep.mandhala\\Documents\\file upload\\ForUserProfile1.exe");
	
	System.out.println("selected image");
	Thread.sleep(3000);
	
    String firstname=	selectuser.firstName(driver, randChar());
	
	
	selectuser.lastName(driver, randChar());

	
	selectuser.emailC(driver, randChar()+"@gmail.com");

	
	selectuser.mobileNumber(driver, randNuma());
	
	Thread.sleep(5000);
	selectuser.clickNext();
	
	company=new POM_Business(driver);
	company.companyName(driver, "Dev");
	company.Designation(driver, "Test");
	company.officeMail(driver, randChar()+"@gmail.com");
	company.officeNumber(driver, "9384883987");
	company.Address(driver, "hyderabad"); 
	company.CITY(driver, "srinagr");
	company.ZipCode(driver, "737637");
	company.webSite(driver, randChar()+".com");
	company.State(driver, "telangana");
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()='Next']")).click();
	
	
	social = new POM_Social(driver);
	social.facebook(driver, "fb.com");
	social.instagram(driver, "instagrame.com");
	social.twitter(driver, "twitter.com");
	social.linkedin(driver, "linkdin.com");
	social.youtube(driver, "youtube.com");
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id='root']/div/div/div/div[2]/div/div[2]/button")).click();
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//button[text()='Submit']")).click();
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(firstname);
	Thread.sleep(3000);
	
	boolean bum= driver.getPageSource().contains(firstname);
	
	if (bum=true) {
		System.out.println("add details are working");
		
		
	}
	else
	{
		System.out.println("getting error while adding the details");
	}
}
		
			
		
	
	

@Test(enabled=false)
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
		POM_IVQ.appInventoryName(driver, randChar());
		
		WebElement name= driver.findElement(By.xpath("//input[@placeholder='Enter Ad Inventory name']"));
		
		
		String get=name.getAttribute("value");
		System.out.println("Inventory name  "+ get);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		logger.log(LogStatus.FAIL,e.getLocalizedMessage(), "not selecting dropdown"+screenshot(driver));
	}

	
	POM_IVQ.startDa(driver);
	
	Thread.sleep(2000);
	
	POM_IVQ.startDaSel(driver);
	
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//input[@name='url']")).click();
	//POM_IVQ.endDa(driver, "02/23/2019");
	POM_IVQ.endDaClick(driver);
	POM_IVQ.endDaclickdate(driver);
	Thread.sleep(5000);
	
	
	POM_IVQ.selectSource123(driver);
	Thread.sleep(2000);
	
	WebElement elem= driver.findElement(By.xpath("//select[@name='url']"));
	String str=elem.getAttribute("value");
	
	System.out.println("dropdown value  "+str);
	
	POM_IVQ.URL(driver, "/ec2-18-223-254-193.us-east-2.compute.amazonaws.com/");
	WebElement name= driver.findElement(By.xpath("//input[@placeholder='Enter Ad Inventory name']"));
	
	
	String get=name.getAttribute("value");
	System.out.println("Inventory name  "+ get);
	
	driver.findElement(By.xpath("//button[text()='Post']")).click();
	
	Thread.sleep(3000);
	
	boolean bol = driver.getPageSource().contains(get);
	
	if (bol==true) {
		
		Assert.assertTrue(true);
		System.out.println("success");
		logger.log(LogStatus.ERROR, "Invalid date");
		//captureScreenshot(driver, "getting error");
	}
	else {
		
		logger.log(LogStatus.INFO, "valid date");
		System.out.println("getting error");
		Assert.assertTrue(false);
		
}
}


public String randChar() {
	
String random  =RandomStringUtils.randomAlphabetic(8);
return random;
}



public String randNuma() {
	
String numa  =RandomStringUtils.randomNumeric(10);
return numa;}

}


