package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		String title =driver.getTitle();
		System.out.println("Title of the browser:"+title);
		if(title.equals("Google")) {
			System.out.println("Correct title");
		}
		else {
			System.out.println("Incorrect title");
		}
		String d =driver.getWindowHandle();
		System.out.println(d);
		System.out.println(driver.getCurrentUrl());
		driver.quit();
		

	}

}
