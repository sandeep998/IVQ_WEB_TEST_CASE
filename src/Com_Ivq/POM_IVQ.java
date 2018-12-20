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
	public static final By appinventoryname=By.xpath("//input[@name='compaign']");
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
	
	
}
