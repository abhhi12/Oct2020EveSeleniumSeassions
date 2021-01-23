package SeleniumsessionsNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpicejetMenu {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		By addOnLink=By.linkText("ADD-ONS");
		By travellinsurence=By.linkText("Travel Insurance");
		By studisc=By.linkText("Student Discount");
		
		ElementUtil eleutil = new ElementUtil(driver);
		eleutil.clickOnSubMenu(addOnLink, travellinsurence);
		eleutil.clickOnSubMenu(addOnLink, studisc);
		

	}

}
