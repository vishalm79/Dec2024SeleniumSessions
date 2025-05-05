package seleniumsessions;

import org.openqa.selenium.WebDriver;

public class OpenCartAppTest {

	public static void main(String[] args) {

		BrowserUtility brUtil = new BrowserUtility();
		WebDriver driver = brUtil.initBrowser("firefox");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		String actTitle = brUtil.getPageTitle();
		if (actTitle.equals("Account Login")) {
			System.out.println("title is correct ==> Test passed");
		} else {
			System.out.println("title is incorrect ==> Test failed");

		}

		String actURL = brUtil.getPageURL();
		if (actURL.contains("account/login")) {
			System.out.println("login page URL is correct ==> Test passed");

		} else {
			System.out.println("login page URL is incorrect ==> Test failed");

		}
		brUtil.quitBrowser();

	}

}
