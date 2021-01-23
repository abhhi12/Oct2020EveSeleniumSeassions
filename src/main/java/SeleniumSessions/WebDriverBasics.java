package SeleniumSessions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WebDriverBasics {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver drive = new ChromeDriver();
		drive.manage().window().fullscreen();
		drive.get("https://www.google.com");
		String title = drive.getTitle();
		System.out.println(title);
		if(title.equals("Google")) {
			System.out.println("Correct Title");
		}
		else {
			System.out.println("Invalid Title");
		}
		System.out.println(drive.getCurrentUrl());
	}

}
