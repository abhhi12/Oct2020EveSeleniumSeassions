package SeleniumsessionsNaveen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSessions.ElementUtil;

public class LoginPage {

	public static void main(String[] args) {

		WebDriverFactory wf = new WebDriverFactory();
		WebDriver driver = wf.init_driver("chrome");
		wf.launchUrl("https://www.orangehrm.com/orangehrm-30-day-trial/");

		String title = wf.getPageTitle();
		System.out.println("page title is: " + title);

		System.out.println(wf.getPageUrl());

		By url = By.id("Form_submitForm_subdomain");
		By firstname = By.id("Form_submitForm_FirstName");
		By lastname = By.id("Form_submitForm_LastName");
		By submitBtn = By.id("Form_submitForm_action_request");

		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(url, "testautomation");
		eleUtil.doSendKeys(firstname, "testing");
		eleUtil.doSendKeys(lastname, "naveen");
		eleUtil.doClick(submitBtn);

		wf.quitBrowser();

	}

}