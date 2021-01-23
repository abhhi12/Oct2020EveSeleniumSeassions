package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenPage {

	public static void main(String[] args) {
		
		SlectingWebDriver sd = new SlectingWebDriver();
		WebDriver driver = sd.driver("chrome");
		sd.launchurl("https://demo.opencart.com/index.php?route=account/register");
		String title=sd.getPageTitle();
		System.out.println("Page title:"+title);
		String path=sd.getpath();
		System.out.println("Page Path:"+path);
		
		By firstname=By.id("input-firstname");
		By lastname=By.id("input-lastname");
		By email=By.id("input-email");
		By telephone=By.id("input-telephone");
		By pass=By.id("input-password");
		By confpass=By.id("input-confirm");
		
		
		locator lo = new locator(driver);
		lo.dosendKeys(firstname, "Abhishek");
		lo.dosendKeys(lastname, "Kumar");
		lo.dosendKeys(email, "abhi@123");
		lo.dosendKeys(telephone, "123456789");
		lo.dosendKeys(pass, "123456");
		lo.dosendKeys(confpass, "123456");
		
		sd.closebrowse();
	}

}
