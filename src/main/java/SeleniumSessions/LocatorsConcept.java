package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LocatorsConcept {
	
    static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		By url = By.id("Form_submitForm_subdomain");// By id yaha locator hai
		By firstname = By.id("Form_submitForm_FirstName");//these are locator
		By lastname = By.id("Form_submitForm_LastName");
		By submit = By.id("Form_submitForm_action_request");
		
	    //drive = new ChromeDriver();
		//drive.get("https://demo.opencart.com/index.php?route=account/login");
		
		//create a webelement (by using locator) --> perform action on it (click,sendkeys,gettext)
		
		//drive.findElement(By.id("input-email")).sendKeys("abhi@ggmail.com");
		//drive.findElement(By.id("input-password")).sendKeys("test@gmail.com");
		
		//WebElement email = drive.findElement(By.id("input-email"));
		//WebElement password = drive.findElement(By.id("input-password"));
		
		//email.sendKeys("abhi@gmail.com");
		//password.sendKeys("teaxt@123");
		
		//By Locator:(locator means how to intract with webelements)
		//By emailid =By.id("input-email");
		//By password = By.id("input-password");
		
		//driver.findElement(emailid).sendKeys("abhinpti@gmail.com");
		//driver.findElement(password).sendKeys("test@123");
		
		//getElement(emailid).sendKeys("abhi@gmail.com");
		//getElement(password).sendKeys("test@123");
		
		//getElement(url).sendKeys("testautomation");
		//getElement(firstname).sendKeys("Abhishek");
		//getElement(lastname).sendKeys("Kumar");
		//getElement(submit).click();
		
		doClick(submit);
		doSendKeys(firstname, "testing");
		doSendKeys(lastname, "automation");
		doSendKeys(url, "testautomation");
		
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doClick(By Locator) {
		getElement(Locator).click();
	}
	
	public static void doSendKeys(By Locator, String value) {
		getElement(Locator).sendKeys(value);
	}

}
