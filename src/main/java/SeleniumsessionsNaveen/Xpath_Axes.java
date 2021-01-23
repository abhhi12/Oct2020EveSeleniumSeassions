package SeleniumsessionsNaveen;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath_Axes {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/new-zealand-v-pakistan-2020-21-1233950/new-zealand-vs-pakistan-2nd-t20i-1233960/full-scorecard");
		
		getPlayerScoreCard("Haider Ali").stream().forEach(ele -> System.out.println(ele +" "));
		System.out.println(getWicketTakerName("Haider Ali"));

	}
	public static List<String> getPlayerScoreCard(String PlayerName) {
		System.out.println();
		System.out.println(PlayerName +"--->");
		List<String> scorecardlist = new ArrayList<String>();
		List<WebElement> scorelist=driver.findElements(By.xpath("//a[text()='"+PlayerName+"']//parent::td//following-sibling::td"));
		for(int i=1; i<scorelist.size(); i++ ) {
			String text=scorelist.get(i).getText();
			scorecardlist.add(text);
		}
		return scorecardlist;
	}
	public static String getWicketTakerName(String PlayerName) {
		String text=driver.findElement(By.xpath("//a[text()='"+PlayerName+"']//parent::td//following-sibling::td//parent::tr//following-sibling::td")).getText();
		return text;
	}

}
