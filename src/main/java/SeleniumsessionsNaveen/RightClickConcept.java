package SeleniumsessionsNaveen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickConcept {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickEle=driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions action = new Actions(driver);
		action.contextClick(rightClickEle).perform();
		
		List<WebElement> optionlist=driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li/span"));
		System.out.println(optionlist.size());
		
		for(WebElement e : optionlist) {
			String text=e.getText();
			System.out.println(text);
			
			if(text.equals("Copy")) {
				e.click();
				break;
			}
		}

	}

}
