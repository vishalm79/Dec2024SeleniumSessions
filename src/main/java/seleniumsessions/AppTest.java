//package seleniumsessions;
//
//import org.openqa.selenium.WebDriver;
//
//public class AppTest {
//	WebDriver driver;
//
//	public static void main(String[] args) {
//
//		BrowserUtil brUtil = new BrowserUtil();
//		System.out.println("Launching the browser....");
//		WebDriver driver = brUtil.initBrowser("chrome");
//		brUtil.launchURL("https://www.orangehrm.com/");
//
//		String CurrentPageURL = brUtil.getPageURL();
//		System.out.println("Current page URL is: " + CurrentPageURL);
//
////		String actTitle = brUtil.getTitle();
//		if (actTitle.equals("Human Resources Management Software | OrangeHRM")) {
//			System.out.println("Title is correct -- test passed");
//		} else {
//			System.out.println("Title is incorrect -- test failed");
//
//		}
//
//		brUtil.closeBrowser();
//	}
//
//}
