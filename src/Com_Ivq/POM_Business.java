package Com_Ivq;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Business extends Base_IVQ{

	
	static WebDriver driver;
	
	public POM_Business(WebDriver driver) {
		
		POM_Business.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@placeholder='Enter company name']")
	WebElement company;
	public  String companyName(WebDriver driver,String namecom) {
		 
	visibilityOfElement12(driver, company);
		
	company.sendKeys(namecom);
	String coname=	company.getAttribute("value"); 
//	System.out.println("company name   "+coname);
	return coname;
	}
	
	@FindBy(xpath="//input[@placeholder='Enter designation']")
	WebElement design;
	public  String Designation(WebDriver driver,String namede) {
		 
	visibilityOfElement12(driver, design);
		
	design.sendKeys(namede);
	String dename=	design.getAttribute("value"); 
	//System.out.println("designation   "+dename);
	return dename;
	}
	
	@FindBy(xpath="//input[@placeholder='Enter office email address']")
	WebElement officeema;
	public  String officeMail(WebDriver driver,String mail) {
		 
	visibilityOfElement12(driver, officeema);
		
	officeema.sendKeys(mail);
	String getmail=	design.getAttribute("value"); 
//	System.out.println("Office mail   "+getmail);
	return getmail;
	}
	@FindBy(xpath="//input[@placeholder='Enter office number']")
	WebElement officenumber;
	public  String officeNumber(WebDriver driver,String num) {
		 
	visibilityOfElement12(driver, officenumber);
		
	officenumber.sendKeys(num);
	String getnum=	design.getAttribute("value"); 
	//System.out.println("office number   "+getnum);
	return getnum;
	}
	@FindBy(xpath="//input[@placeholder='Enter address']")
	WebElement addre;
	public  String Address(WebDriver driver,String add) {
		 
	visibilityOfElement12(driver, addre);
		
	addre.sendKeys(add);
	String getadd=	design.getAttribute("value"); 
	//System.out.println("address   "+getadd);
	return getadd;
	}
	
	@FindBy(xpath="//input[@placeholder='Enter city']")
	WebElement cityH;
	public  String CITY(WebDriver driver,String sendcity) {
		 
	visibilityOfElement12(driver, cityH);
		
	cityH.sendKeys(sendcity);
	String getcity=	design.getAttribute("value"); 
	//System.out.println("city name  "+getcity);
	return getcity;
	}
	@FindBy(xpath="//input[@placeholder='Enter state']")
	WebElement stateH;
	public  String State(WebDriver driver,String sendState) {
		 
	visibilityOfElement12(driver, stateH);
		
	stateH.sendKeys(sendState);
	String getstate=	design.getAttribute("value"); 
	//System.out.println("state name   "+getstate);
	return getstate;
	}
	
	@FindBy(xpath="//input[@placeholder='Enter Zipcode']")
	WebElement zip;
	public  String ZipCode(WebDriver driver,String sendzip) {
		 
	visibilityOfElement12(driver, zip);
		
	zip.sendKeys(sendzip);
	String getzip=	design.getAttribute("value"); 
	//System.out.println("zipcode   "+getzip);
	return getzip;
	}
	
	@FindBy(xpath="//input[@placeholder='Enter company website']")
	WebElement web;
	public  String webSite(WebDriver driver,String sendweb) {
		 
	visibilityOfElement12(driver, web);
		
	web.sendKeys(sendweb);
	String getwebsite=	design.getAttribute("value"); 
	//System.out.println("website   "+getwebsite);
	return getwebsite;
	}


@FindBy(xpath="//button[text()='Next']")
WebElement Pnext;

public void Pnext(WebDriver driver) {
	 
visibilityOfElement12(driver, Pnext);
	
web.click();

}
}








