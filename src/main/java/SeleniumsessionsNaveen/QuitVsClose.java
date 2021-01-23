package SeleniumsessionsNaveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVsClose {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();// open the browser: chrome

		driver.get("https://www.google.com");// enter url

		String title = driver.getTitle();// get the title of the page
		System.out.println("page title is: " + title);

		//driver.quit();// close the browser
		driver.close();// close the browser
		
		System.out.println(driver.getTitle());
		//NoSuchSessionException: Session ID is null. Using WebDriver after calling quit()?


	}

}
