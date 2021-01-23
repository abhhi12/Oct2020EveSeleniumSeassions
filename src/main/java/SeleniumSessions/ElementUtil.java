package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	private WebDriver driver;
	public ElementUtil(WebDriver driver) { //constructor
		this.driver = driver;
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void doClick(By Locator) {
		getElement(Locator).click();
	}
	
	public void doSendKeys(By Locator, String value) {
		getElement(Locator).sendKeys(value);
	}

}
