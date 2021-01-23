package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class locator {
	private WebDriver driver;
	
	public locator(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public void doclick(By locator) {
		getElement(locator).click();
	}
	
	public void dosendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}
