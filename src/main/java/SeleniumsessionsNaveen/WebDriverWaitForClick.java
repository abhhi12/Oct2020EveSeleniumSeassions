package SeleniumsessionsNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForClick {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://classic.crmpro.com/");
		
		By forgpwd=By.linkText("Forgot Password?111");
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(forgpwd));
		//element.click();
		
		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.clickWhenReady(forgpwd, 10);
		
		//TimeOut Exception: Expected condition is failed.
		//waiting for element to be clickable: By.linktext("Forgot Password?111")
		//tried for 10 second(s) with 500 milliseconds interval.

	}

}
