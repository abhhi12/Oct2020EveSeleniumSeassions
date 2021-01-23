package SeleniumsessionsNaveen;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableIteration {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//By table = By.xpath("//table[@id='customers']/tbody/tr/th/..//following-sibling::tr/td[3]");
		//By table =By.xpath("//table[@id='customers']/tbody/tr/td[3]");
		By table=By.xpath("//table[@id='customers']/tbody/tr");
		List<WebElement> tabledata=driver.findElements(table);
		System.out.println(tabledata.size());
		tabledata.stream().forEach(ele -> System.out.println(ele.getText()));
		
		System.out.println("-----------");
		
		//By.xpath("//table[@id='customers']/tbody/tr/td[1]");
		//By.xpath("//table[@id='customers']/tbody/tr/td[2]");
		//By.xpath("//table[@id='customers']/tbody/tr/td[3]");
		
		for(int i=1; i<=3; i++) {
			System.out.println("Column ----" + i + "-----");

			List<WebElement> columnData = driver
					.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[" + i + "]"));
			columnData.stream().forEach(ele -> System.out.println(ele.getText()));
		}
		

	}

}
