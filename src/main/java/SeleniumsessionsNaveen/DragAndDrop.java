package SeleniumsessionsNaveen;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/resources/demos/droppable/default.html");
		
		Actions action = new Actions(driver);
		
		WebElement srcElement= driver.findElement(By.id("draggable"));
		WebElement targerElement=driver.findElement(By.id("droppable"));
		
		//action.clickAndHold(srcElement).moveToElement(targerElement).build().perform();
		action.dragAndDrop(srcElement, targerElement).perform();

	}

}
