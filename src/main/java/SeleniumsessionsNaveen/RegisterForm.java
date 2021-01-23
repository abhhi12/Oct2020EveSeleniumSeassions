package SeleniumsessionsNaveen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterForm {
	static WebDriver driver;

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		List<WebElement> textFieldList = driver.findElements(By.className("form-control"));
		System.out.println(textFieldList);
		
		for(int i=1; i<textFieldList.size(); i++) {
			textFieldList.get(i).sendKeys("Abhishek");
		}

	}

}
