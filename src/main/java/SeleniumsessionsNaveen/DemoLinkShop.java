package SeleniumsessionsNaveen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoLinkShop {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		driver.findElement(By.id("search_query_top")).sendKeys("dress");
		Thread.sleep(3000);
		
		List<WebElement> suggList=driver.findElements(By.cssSelector("div.ac_results li"));
		//we can use xpath also .xpath("//div[@class='ac_results']/ul/li")
		suggList.stream().filter(ele -> ele.getText().equals("Blouses > Blouse")).findFirst().get().click();
	}

}
