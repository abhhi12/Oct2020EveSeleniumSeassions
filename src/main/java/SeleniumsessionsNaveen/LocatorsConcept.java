package SeleniumsessionsNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
		driver = new ChromeDriver();

		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		Thread.sleep(4000);
		
		// create a webelement (by using some locator) --> perform action on it
		// (click,sendkeys, gettext)
		
		//1. id: is always unique
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");

//		WebElement email = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		email.sendKeys("naveen@gmail.com");
//		password.sendKeys("test@123");

		// By locator: OR
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		driver.findElement(emailId).sendKeys("test@gmail.com");
//		driver.findElement(password).sendKeys("test@123");

//		getElement(emailId).sendKeys("test@gmail.com");
//		getElement(password).sendKeys("test@123");

		
//		getElement(url).sendKeys("testautomation");
//		getElement(firstname).sendKeys("testing");
//		getElement(lastname).sendKeys("automation");
//		getElement(submitBtn).click();
		
		By url = By.id("Form_submitForm_subdomain");
		By firstname = By.id("Form_submitForm_FirstName");
		By lastname = By.id("Form_submitForm_LastName");
		By submitBtn = By.id("Form_submitForm_action_request");
		
//		doSendKeys(url, "testautomation");
//		doSendKeys(firstname, "testing");
//		doSendKeys(lastname, "automation");
//		doClick(submitBtn);
		
		//2. name: is not unique
//		driver.findElement(By.name("username")).sendKeys("batchautomation");
//		driver.findElement(By.name("password")).sendKeys("test@123");
		
		//3. className: is not unique
		// form-control private-form__control login-email
		// form-control private-form__control login-password m-bottom-3
//		driver.findElement(By.className("login-email"))
//				.sendKeys("test@gmail.com");
//		driver.findElement(By.className("login-password"))
//			.sendKeys("test@123");
		
		//4. xpath: is a locator, its not an attribute
//		driver.findElement(By.xpath("//*[@id=\"Form_submitForm_FirstName\"]")).sendKeys("naveen");
//		driver.findElement(By.xpath("//*[@id=\"Form_submitForm_JobTitle\"]")).sendKeys("SDET");
		
//		By fn = By.xpath("//*[@id=\"Form_submitForm_FirstName\"]");
//		By jobTitle = By.xpath("//*[@id=\"Form_submitForm_JobTitle\"]");
//		
//		doSendKeys(fn, "naveen");
//		doSendKeys(jobTitle, "SDET");
		
		//5. cssSelector: is a locator, its not an attribute
		//CSS - Cascaded Style sheet
//		driver.findElement(By.cssSelector("#Form_submitForm_FirstName")).sendKeys("testing");
//		driver.findElement(By.cssSelector("#Form_submitForm_CompanyName")).sendKeys("Google");
		
		//6. link text: only for links (on the basis of the text of the link)
		//driver.findElement(By.linkText("Privacy Policy")).click();
		
//		By privacyPolicy = By.linkText("Privacy Policy");
//		doClick(privacyPolicy);
		
		driver.findElement(By.linkText("Contact Sales")).click();
		
		//7. partial link text:only for links (on the basis of the partial text of the link)
		
		//driver.findElement(By.partialLinkText("Privacy")).click();
		//Privacy Policy
		//Privacy details 
		
		
	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	
	public static void doSendKeys(By locator, String value){
		getElement(locator).sendKeys(value);
	}
	
	

}
