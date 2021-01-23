package SeleniumsessionsNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TagNameConcept {
	static WebDriver driver;

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("https://www.freshworks.com/");
		
//		String header = driver.findElement(By.tagName("h1")).getText();
//		
//		System.out.println(header);
//		
//		String h2 = driver.findElement(By.xpath("/html/body/section[1]/div/div/div[1]/h1[2]")).getText();
//		System.out.println(h2);
//		
//		String header1 = driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header1);
//		
//		String cust_text = driver.findElement(By.linkText("Customers")).getText();
//		System.out.println(cust_text);		
		
		By h1 = By.tagName("h1");
		By header2 = By.xpath("/html/body/section[1]/div/div/div[1]/h1[2]");
		By customers = By.linkText("Customers");
		
		System.out.println(doGetText(h1));
		System.out.println(doGetText(header2));
		System.out.println(doGetText(customers));
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}
	
	

}
