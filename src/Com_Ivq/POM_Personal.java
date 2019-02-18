package Com_Ivq;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class POM_Personal extends Base_IVQ{
	
	static WebDriver driver;
	
	public POM_Personal(WebDriver driver) {
		
		POM_Personal.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//span[text()='Users']")
	WebElement user1;
 public  void clickUser(WebDriver driver) {
	 
	// visibilityOfElement12(driver, user);
	 user1.click();
	 
 }
 
 @FindBy(xpath="//i[@class='fa fa-camera upload-button']")
 WebElement image;
 public void clickImage(WebDriver driver) {
image.click();
	 //visibilityOfElement12(driver, image);
	//image.sendKeys(img);
 }
 
	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement fname;
public  String firstName(WebDriver driver,String first) {
	 
	visibilityOfElement12(driver, fname);
	
	fname.sendKeys(first);
String nam=	fname.getAttribute("value"); 
System.out.println("First Name   "+nam);
return nam;
}
@FindBy(xpath="//input[@placeholder='Last Name']")
WebElement fnamelast;
public  void lastName(WebDriver driver,String last) {
	 
	// visibilityOfElement12(driver, fnamelast);
	fnamelast.sendKeys(last);
	String lam= fnamelast.getAttribute("value");
	System.out.println("Last Name  "+ lam);
	
}
@FindBy(xpath="//input[@placeholder='Enter email address']")
WebElement email;
public  void emailC(WebDriver driver,String email1) {
	 
	// visibilityOfElement12(driver, user);
	email.sendKeys(email1);
	 String eme=email.getAttribute("value");
	 System.out.println("Email  "+eme);
}
@FindBy(xpath="//input[@placeholder='Enter email mobile number']")
WebElement mobile;
public  void mobileNumber(WebDriver driver,String number) {
	 
	// visibilityOfElement12(driver, user);
	mobile.sendKeys(number);
	
String mobe=	mobile.getAttribute("value");
	 System.out.println("Mobile number  "+mobe);
}
@FindBy(xpath="//button[text()='Next']")
WebElement next;

public void clickNext() {
	next.click();
	
}
}











