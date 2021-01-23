package TestNgSessions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NoonTest extends BaseTest {
	
	@Test(priority=1)
	public void noonTitletest() {
		driver.get("https://www.noon.com/uae-en/");
		String title=driver.getTitle();
		System.out.println("Page Title is:" + title);
		Assert.assertTrue(title.contains("Online Shopping"));
	}
	
	@Test(priority=2)
	public void noonLogoTest() {
		Assert.assertTrue(driver.findElement(By.xpath("//a[@href='/uae-en']/img")).isDisplayed());
	}
	
	@Test(priority=2)
	public void noonSignInTest() {
		Assert.assertTrue(driver.findElement(By.id("dd_header_signInOrUp")).isDisplayed());
	}

}
