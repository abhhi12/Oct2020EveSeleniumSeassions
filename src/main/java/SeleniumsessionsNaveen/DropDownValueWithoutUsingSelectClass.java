package SeleniumsessionsNaveen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownValueWithoutUsingSelectClass {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		
		By industry =By.xpath("//select[@id=\"Form_submitForm_Industry\"]/option");
		By country = By.xpath("//select[@id='Form_submitForm_Country']/option");
		
		DropDownvalue(industry, "travel");
		DropDownvalue(country, "India");

	}
	public static void DropDownvalue(By locator, String value) {
		List<WebElement> optionlist=driver.findElements(locator);
		System.out.println(optionlist.size());
		
		for(WebElement e : optionlist) {
			String text=e.getText();
			
			if(text.equals(value)) {
				e.click();
				break;
			}
		}
		
	}

}
