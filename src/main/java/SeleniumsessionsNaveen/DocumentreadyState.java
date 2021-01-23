package SeleniumsessionsNaveen;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DocumentreadyState {
	static WebDriver driver;

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://classic.crmpro.com/");
		
		
		jsWaitForPageLoad(10);
		
	}
	
	public static void jsWaitForPageLoad(int timeOut) {
		JavascriptExecutor jse = ((JavascriptExecutor)driver);
		String jsCommand = "return document.readyState";
		
		if(jse.executeScript(jsCommand).toString().equals("complete")) {
			System.out.println("Page is fully loaded");
			return;
		}
		for(int i=0; i<timeOut; i++) {
			try {
				Thread.sleep(1000);
				if(jse.executeScript(jsCommand).toString().equals("complete")) {
					System.out.println("Page is fully loaded");
					break;
			}
			}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
}
	
