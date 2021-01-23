package SeleniumsessionsNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForNonWebElements {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		ElementUtil eleutil = new ElementUtil(driver);
		String title=eleutil.waitForTitleToBe("Rediff", 10);
		System.out.println("page title is: " + title);
		
		//By quickOrder = By.xpath("//span[text()='Catalog Quick Order']");
		By signButton = By.xpath("//input[@type='submit']");
		
		eleutil.waitForElementPresent(signButton, 10).click();
		
		//eleUtil.waitForElementPresent(quickOrder, 10).click();
		
		//url:
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		boolean flag = wait.until(ExpectedConditions.urlContains("catalog-quick-order"));
//		System.out.println(flag);
		
//		if(eleUtil.waitForUrlToBe("catalog-quick-order", 10)) {
//			System.out.println("Correct quick order url....");
//		}
		
		//alerts:
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		System.out.println(alert.getText());
//		alert.accept();
		
		System.out.println(eleutil.waitForAlert(10).getText());
		

	}

}
