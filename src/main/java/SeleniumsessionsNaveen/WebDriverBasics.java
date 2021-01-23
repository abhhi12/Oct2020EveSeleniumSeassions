package SeleniumsessionsNaveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasics {

	public static void main(String[] args) {

		//1. open the browser: chrome
		//2. enter url: 
		//3. get the title of the page
		//4. check the title - verify
		//5. close the browser
		
		//Win:
		//System.setProperty("webdriver.chrome.driver", "c:\\users\\naveen\\chromedriver.exe");
		
		//MAC:
		System.setProperty("webdriver.chrome.driver", "/Users/naveenautomationlabs/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();//open the browser: chrome
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com");//enter url
		
		String title = driver.getTitle();//get the title of the page
		System.out.println("page title is: " + title);
		
		//verification point: checkpoint (actual vs expected result)
		if(title.equals("Google")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("in-correct title");
		}
		
		System.out.println(driver.getCurrentUrl());
		
		//System.out.println(driver.getPageSource());
		
		//driver.quit();//close the browser
		
		
	}

}