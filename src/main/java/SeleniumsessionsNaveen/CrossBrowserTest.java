package SeleniumsessionsNaveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {

	static WebDriver driver;

	public static void main(String[] args) {

		String browser = "chrome";

		if (browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
			driver = new ChromeDriver();
		}

		else if (browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "/Users/naveenautomationlabs/Downloads/geckodriver");
			driver = new FirefoxDriver();
		}

		else if (browser.equals("safari")) {
			driver = new SafariDriver();
		}

		else {
			System.out.println("please pass the correct browser..." + browser);
		}

		//
		driver.manage().window().maximize();

		driver.get("https://www.google.com");// enter url

		String title = driver.getTitle();// get the title of the page
		System.out.println("page title is: " + title);

		// verification point: checkpoint (actual vs expected result)
		if (title.equals("Google")) {
			System.out.println("correct title");
		} else {
			System.out.println("in-correct title");
		}

		System.out.println(driver.getCurrentUrl());

		// System.out.println(driver.getPageSource());

		driver.quit();// close the browser

	}

}