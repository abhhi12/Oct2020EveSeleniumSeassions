package SeleniumsessionsNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitConcept {
	static WebDriver driver;

	public static void main(String[] args) {
		
		//Wait -- Functional Interface --> SAM (Single Abstract Method)
		//-->1. WebDriverWait (C) -- extends --> 2. FluentWait(C)
		//Explicit Wait
			//can be applied for any specific webelement (not a global wait)
			//can be applied for non web elements also -- alert, url, title
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://classic.crmpro.com/");
		

		By username = By.name("username");
		By password = By.name("password");
		By loginButton = By.xpath("//input[@value='Login']");
		
		//WebDriverWait wait_for_name= new WebDriverWait(driver, 10);
		//WebElement username_ele=wait_for_name.until(ExpectedConditions.presenceOfElementLocated(username));
		//username_ele.sendKeys("Abhishek");
		
		//WebDriverWait wait_for_password= new WebDriverWait(driver, 10);
		
		//WebElement password_ele=wait_for_password.until(ExpectedConditions.presenceOfElementLocated(password));
		//password_ele.sendKeys("abhi@1234");
		
		//waitForElementPresent(username, 10).sendKeys("Abhishek");
		 waitForElementPresent(username, 10).sendKeys("Ramu");

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	/**presenceOfElementLocated:
	 * An expectation for checking that an element is present on the DOM of a page. 
	 * This does not necessarily mean that the element is visible.
	*/
	
	public static WebElement waitForElementPresent(By locator, int timeOut) {
		WebDriverWait wait= new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**
	 * An expectation for checking that an element, known to be present on the DOM of a page, is visible. 
	 * Visibility means that the element is not only displayed but also has a height and width 
	 * that is greater than 0.
	 * @param locator
	 * @param timeOut
	 * @return
	 */
	
	public static WebElement waitForElementVisible(By locator, int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, timeOut);
		return wait.until(ExpectedConditions.visibilityOf(getElement(locator)));////yaha element ko locate karega
	}

}
