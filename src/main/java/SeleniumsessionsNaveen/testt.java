package SeleniumsessionsNaveen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testt {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		
		By tag=By.xpath("//div[@id='search-container']");
		
		ElementUtil eleutil = new ElementUtil(driver);
		
		eleutil.doSendKeys(tag, "English song");
		
		
		
		
		
		
	
	}
}