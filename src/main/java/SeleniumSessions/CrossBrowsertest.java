package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowsertest {
	static WebDriver driver; 
	public static void maine(String[] args) {
		
	String browser = "chrome";
	if(browser.equals("chrome")) {
		System.setProperty("webdriver.chromedriver", "c://chromedriver.exe");
		driver = new ChromeDriver();
		
	}
	else if(browser.equals("firefox")) {
		System.setProperty("webdriver.geckodriver", "c://geckodriver.exe");
		driver = new FirefoxDriver();
	}
	else if(browser.equals("edge")) {
		System.setProperty("webdriver.msedgedriver", "c://msedgedriver.exe");
		driver = new EdgeDriver();
	}
	else if(browser.equals("safari")) {
		driver = new SafariDriver();
	}
	else {
		System.out.println("Please pass the correct browser:");
	}
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	String title=driver.getTitle();
	System.out.println("page title is:"+title);
	if(title.equals("google")) {
		System.out.println("Correct Title");
	}
	else {
		System.out.println("Incorrect title");
	}
	String url=driver.getCurrentUrl();
	System.out.println(url);
	String handle=driver.getWindowHandle();
	System.out.println(handle);
	System.out.println("driver.getCurrentUrl()");
	//driver.quit();
	driver.close();

}
}
