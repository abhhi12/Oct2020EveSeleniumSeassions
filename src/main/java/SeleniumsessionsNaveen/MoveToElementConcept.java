package SeleniumsessionsNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("http://mrbool.com/how-to-create-menu-with-submenu-using-css-html/26146");
			
			//WebElement ParentMenulink =driver.findElement(By.className("menulink"));
			
			//Actions action = new Actions(driver);
			//action.moveToElement(ParentMenulink).perform();
			//Thread.sleep(3000);
			//driver.findElement(By.linkText("COURSES")).click();
			
			By ParentMenu =By.className("menulink");
			By SubMenuCourses =By.linkText("COURSES");
			
			ElementUtil eleutil = new ElementUtil(driver);
			eleutil.clickOnSubMenu(ParentMenu, SubMenuCourses);

	}

}
