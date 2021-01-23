package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SlectingWebDriver {
	WebDriver driver;
	public WebDriver driver(String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else {
			System.out.println("Please pass the correct browser" +browser);
		}
		return driver;
	}
	
	public void launchurl(String url) {
		driver.get(url);
	}
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	
	public String getpath() {
		return driver.getCurrentUrl();
	}
	
	public void closebrowse() {
		driver.quit();
	}

}
