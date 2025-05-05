package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage {

	static WebDriver driver;

	public static void main(String[] args) {

		BrowserUtil brUtil = new BrowserUtil();
		// launching the browser
		WebDriver driver = brUtil.initBrowser("chrome");
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		brUtil.getPageURL();
		brUtil.getTitle("Register Account");
		// locators
		// By pageHeader = By.tagName("h1");
//		By fname = By.id("input-firstname");
//		By lname = By.name("lastname");
//		By email = By.xpath("//*[@id=\"input-email\"]");
//		By phone = By.id("input-telephone");
//		By password = By.cssSelector("#input-password");
//		By confirmpassword = By.id("input-confirm");
//		By agreeCheckbox = By.xpath("//*[@id=\"content\"]/form/div/div/input[1]");
//		By continuebtn = By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
//		//Enter registration details
//		ElementsUtil eleUtil = new ElementsUtil(driver);
//		eleUtil.doSendKeys(fname, "MVishalMV");
//		eleUtil.doSendKeys(lname, "Mehta");
//		eleUtil.doSendKeys(email, "vmd@test.com");
//		eleUtil.doSendKeys(phone, "1244567898");
//		eleUtil.doSendKeys(password, "admin@123");
//		eleUtil.doSendKeys(confirmpassword, "admin@123");
//		eleUtil.doClick(agreeCheckbox);
//		eleUtil.doClick(continuebtn);
		// validating the success response
//		brUtil.getTitle("Your Account Has Been Created!");
//		brUtil.getPageURL("success");
		// closing the browser
//		brUtil.closeBrowser();

		driver.findElements(By.className("list-group-item"));
	}

}
