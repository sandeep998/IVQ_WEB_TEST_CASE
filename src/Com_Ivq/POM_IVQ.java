package Com_Ivq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class POM_IVQ extends Base_IVQ{
	
	WebDriver driver;
	
	public POM_IVQ(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public static final By username=By.xpath("//input[@name='email']");
	
	public static final By password=By.xpath("//input[@type='password']");
	public static final By signin=By.xpath("//button[text()='Sign In']");
	public static final By createadinventory=By.xpath("//button[@class='btn btn-oblong btn-primary mg-b-10 pull-right']");
	public static final By appscreenselect=By.xpath("//select[@name='pagename']");
	public static final By appinventoryname=By.xpath("//input[@placeholder='Enter Ad Inventory name']");
	public static final By startDate=By.xpath("//input[@placeholder='MM/DD/YYYY']");
	public static final By startDateSelect=By.xpath("//*[@id='modaldemo1']/div/form/div/div[2]/div/div[1]/div[3]/div/div[2]/div[2]/div/div[2]/div[2]/div[4]/div[4]");
	//*[@id="modaldemo1"]/div/form/div/div[2]/div/div[1]/div[3]/div/div[2]/div[2]/div/div[2]/div[2]/div[4]/div[4]
	//public static final By endDate=By.xpath("//input[@placeholder='MM/DD/YYYY'])[2]");
//	public static final By endDate=By.xpath("//*[@id='modaldemo1']/div/form/div/div[2]/div/div[1]/div[4]/div/div[2]/div[1]/div/input");
	public static final By EndDatenew=By.xpath("//*[@id='modaldemo1']/div/form/div/div[2]/div/div[1]/div[4]/div/div[2]/div[1]/div/input");
	public static final By enddatedropdown=By.xpath("//*[@id='modaldemo1']/div/form/div/div[2]/div/div[1]/div[4]/div/div[2]/div[2]/div/div[2]/div[2]/div[5]/div[4]");
	public static final By selectsource=By.xpath("//select[@name='url']");
	
	public static final By enterurl=By.xpath("//input[@name='url']");
	public static void userName(WebDriver driver,String sendkeys) {
		
		visibilityOfElement(driver, username, 30);
		driver.findElement(username).sendKeys(sendkeys);
		
		
	}
	public static void passWord(WebDriver driver,String pass) {
		
		visibilityOfElement(driver, password, 30);
		driver.findElement(password).sendKeys(pass);
		
		
	}
	public static void signIn(WebDriver driver) {
		
		visibilityOfElement(driver, signin, 30);
		driver.findElement(signin).click();
		
		
	}
	public static void createAdInventory(WebDriver driver) {
		
		visibilityOfElement(driver, createadinventory, 30);
		driver.findElement(createadinventory).click();
		
		
	}
	public static void appScreenDropdown(WebDriver driver) {
		
		visibilityOfElement(driver, appscreenselect, 30);
		WebElement select=driver.findElement(appscreenselect);
    Select sele=new Select(select);
     sele.selectByVisibleText("Video");

		
		
	}
	public static void appInventoryName(WebDriver driver,String str) {
		
		visibilityOfElement(driver, appinventoryname, 30);
		driver.findElement(appinventoryname).sendKeys(str);
		
		
	}
	public static void startDa(WebDriver driver) {
		
		visibilityOfElement(driver, startDate, 30);
		driver.findElement(startDate).click();
		
		
	}
	public static void startDaSel(WebDriver driver) {
		
		visibilityOfElement(driver, startDateSelect, 30);
		driver.findElement(startDateSelect).click();
		
		
	}
	
	public static void endDaClick(WebDriver driver) {
		
		visibilityOfElement(driver, EndDatenew, 30);
		driver.findElement(EndDatenew).click();
		
		
	}
	public static void endDaclickdate(WebDriver driver) {
		
		visibilityOfElement(driver, enddatedropdown, 30);
		driver.findElement(enddatedropdown).click();
		
		
	}
	
	public static void selectSource123(WebDriver driver) {
		
		visibilityOfElement(driver, selectsource, 30);
		WebElement select1=driver.findElement(selectsource);
    Select sele=new Select(select1);
     sele.selectByVisibleText("URL");

		
		
	}
	public static void URL(WebDriver driver,String str1) {
		
		visibilityOfElement(driver, enterurl, 30);
		driver.findElement(enterurl).sendKeys(str1);
		
		
	}
	
}
