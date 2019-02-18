package Com_Ivq;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Social extends Base_IVQ{
	
	static WebDriver driver;
	
	public POM_Social(WebDriver driver) {
		
		POM_Social.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@placeholder='Enter facebook url']")
	WebElement fb;
	public  String facebook(WebDriver driver,String namefb) {
		 
	visibilityOfElement12(driver, fb);
		
	fb.sendKeys(namefb);
	String getfb=	fb.getAttribute("value"); 
//	System.out.println("company name   "+coname);
	return getfb;
	}
	
	@FindBy(xpath="//input[@placeholder='Enter instagram url']")
	WebElement insta;
	public  String instagram(WebDriver driver,String nameinsta) {
		 
	visibilityOfElement12(driver, fb);
		
	insta.sendKeys(nameinsta);
	String getinsta=	insta.getAttribute("value"); 
//	System.out.println("company name   "+coname);
	return getinsta;
	}
	
	@FindBy(xpath="//input[@placeholder='Enter twitter url']")
	WebElement twite;
	public  String twitter(WebDriver driver,String nametwite) {
		 
	visibilityOfElement12(driver, fb);
		
	twite.sendKeys(nametwite);
	String gettwite=	twite.getAttribute("value"); 
//	System.out.println("company name   "+coname);
	return gettwite;
	}

	@FindBy(xpath="//input[@placeholder='Enter linkedin url']")
	WebElement link;
	public  String linkedin(WebDriver driver,String namelink) {
		 
	visibilityOfElement12(driver, fb);
		
	link.sendKeys(namelink);
	String getlink=	link.getAttribute("value"); 
//	System.out.println("company name   "+coname);
	return getlink;
	}
	@FindBy(xpath="//input[@placeholder='Enter youtube url']")
	WebElement you;
	public  String youtube(WebDriver driver,String nameyou) {
		 
	visibilityOfElement12(driver, fb);
		
	you.sendKeys(nameyou);
	String getyou=	you.getAttribute("value"); 
//	System.out.println("company name   "+coname);
	return getyou;
	}


}
