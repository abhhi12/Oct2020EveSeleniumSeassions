package SeleniumsessionsNaveen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverWaitForElements {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.freshworks.com/");
		By footerlinks=By.cssSelector("ul.footer-nav li a");
		
		//An expectation for checking that all elements present on the 
		//web page that match the locator visible.
		//Visibility means that the elements are not only displayed but also have a height and
		//width that is greater than 0.
		
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		//List<WebElement> footerlist =wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(footerlinks));
		//footerlist.stream().forEach(ele -> System.out.println(ele.getText()));
		
		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.getPageElementsText(footerlinks, 10);

	}

}
