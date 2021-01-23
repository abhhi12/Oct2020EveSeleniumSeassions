package TestNgSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlipkartTest extends BaseTest {
	
	@Test(priority=1)
	public void FlipkartTitleTest() {
		driver.get("https://www.flipkart.com/");
		String title=driver.getTitle();
		System.out.println("Page Title is:" +title);
		Assert.assertTrue(title.contains("Online Shopping"));
	}
	
	@Test(priority=2)
	public void FlipkartLogoTest() {
		Assert.assertTrue(driver.findElement(By.className("_2xm1JU")).isDisplayed());
	}

}
