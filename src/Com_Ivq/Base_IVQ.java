package Com_Ivq;

import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_IVQ {
	
	WebDriver driver;
	
public static  WebElement visibilityOfElement(WebDriver driver,final By locator,int time) {
		
		WebDriverWait wait=new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
	}
public static WebElement presenceOfElement(WebDriver driver,final By locator,int time) {
	
	WebDriverWait wait=new WebDriverWait(driver, time);
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	
}

public static WebElement elementToClick(WebDriver driver,final By locator,int time) {
	
	WebDriverWait wait=new WebDriverWait(driver, time);
	return wait.until(ExpectedConditions.elementToBeClickable(locator));
	
}
public void windowMaximize() {
	
	driver.manage().window().maximize();
}
String path = "";
DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
Date dt = new Date();
String html = "";

public String screenshot(WebDriver driver) throws Exception {

	TakesScreenshot ts = (TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	html = covertScreenshotToBase64(source, "screenshot.png");
	path = System.getProperty("user.dir") + File.separator + "screenshots";
	FileUtils.copyFile(source,
			new File(path + File.separator + dateFormat.format(dt) + "_Screenshot.png"));
	return html;
}

public static String doImageClickAnimation(String img, String screenName) {

	String image = "<img src=\"data:image/png;base64, " + img + "\" alt=\"" + screenName
			+ "\" width=\"500\" height=\"250\"/>";
		
	return image;

}

@SuppressWarnings("resource")
public static String covertScreenshotToBase64(File file, String name) {
	try {
		FileInputStream fis = new FileInputStream(file);
		byte byteArray[] = new byte[(int) file.length()];
		fis.read(byteArray);
		String imageString = Base64.encodeBase64String(byteArray);
		return doImageClickAnimation(imageString, name);
	} catch (Exception e) {
		e.printStackTrace();
		e.getLocalizedMessage();
	}
	return null;
}
}
