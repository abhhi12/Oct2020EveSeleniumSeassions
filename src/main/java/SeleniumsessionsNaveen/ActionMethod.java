package SeleniumsessionsNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionMethod {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By email=By.id("input-email");
		By password=By.id("input-password");
		By login=By.xpath("//input[@type='submit']");
		By ForgotPwd=By.linkText("Forgotten Password");
		
		
		doActionsKey(email, "abhinpti@gmail.com");
		doActionsKey(password, "abhi1223");
		doActionsClick(login);
		doActionsClick(ForgotPwd);
		
		
		

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doActionsKey(By locator, String value) {
		Actions action = new Actions(driver);
		action.sendKeys(getElement(locator), value).perform();
	}
	public static void doActionsClick(By locator) {
		Actions action = new Actions(driver);
		action.click(getElement(locator)).perform();
	}

}
