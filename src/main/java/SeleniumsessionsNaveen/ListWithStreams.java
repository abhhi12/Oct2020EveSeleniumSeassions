package SeleniumsessionsNaveen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ListWithStreams {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> linkslist =driver.findElements(By.tagName("a"));
		System.out.println(linkslist.size());
		long startTime=System.currentTimeMillis();
		
		//linkslist.stream().forEach(ele -> System.out.println(ele.getText()));
		
		linkslist.parallelStream().forEach(ele -> System.out.println(ele.getText()));
		
		long endTime=System.currentTimeMillis();
		
		System.out.println("Total time taken=" +endTime);

	}

}
