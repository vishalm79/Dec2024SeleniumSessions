package seleniumsessions;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	WebDriver driver;

	public WebDriver initBrowser(String browserName) {
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			System.out.println("browser initialized: " + browserName);
			break;
		case "firefox":
			driver = new FirefoxDriver();
			System.out.println("browser initialized" + browserName);
			break;
		case "edge":
			driver = new EdgeDriver();
			System.out.println("browser initialized" + browserName);
			break;
		default:
			System.out.println("pass the valid browser..." + browserName);
			throw new BrowserException("Invalid browser.....");
		}
		return driver;

	}

	public void launchURL(String url) {
		nullCheck(url);
		lengthCheck(url);
		httpCheck(url);
		driver.get(url);
	}

	public void launchURL(URL url) {
		String appUrl = String.valueOf(url);
		nullCheck(appUrl);
		lengthCheck(appUrl);
		httpCheck(appUrl);
		driver.navigate().to(appUrl);
	}

	public boolean getTitle(String expectedTitle) {
		String actualTitle = driver.getTitle();
		if(actualTitle.equals(expectedTitle)) {
			System.out.println("Actual and expected title matched");
		}else {
			System.out.println("Actual and expected title did not matched");
		}		
		System.out.println("Page title is: " + actualTitle);
		return actualTitle.equals(expectedTitle);
	}

	public String getPageURL() {
		String pageURL = driver.getCurrentUrl();
		System.out.println("Current URL is: " + pageURL);
		return pageURL;
	}
	
	public boolean getPageURL(String expText) {
		String successURL = driver.getCurrentUrl();
		return successURL.equals(expText);
				
	}

	public void closeBrowser() {
		if (driver != null) {
			System.out.println("browser closed with close method....");
			driver.close();
		}
	}

	public void quitBrowser() {
		if (driver != null) {
			driver.quit();
			System.out.println("browser closed with quit method....");
		}
	}

	private void nullCheck(String value) {
		if (value == null) {
			System.out.println("value cannot be null -- " + value);
			throw new BrowserException("URL cannot be NULL.....");
		}
	}

	private void lengthCheck(String value) {
		if (value.length() == 0) {
			System.out.println("value cannot be blank -- " + value);
			throw new BrowserException("URL cannot be BLANK.....");

		}
	}

	private void httpCheck(String value) {
		if (value.indexOf("http") != 0) {
			System.out.println("invalid protocol");
			throw new BrowserException("HTTP protocol is missing from the URL.....");

		}

	}
}
