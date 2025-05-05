package seleniumsessions;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class BrowserUtility {

	private WebDriver driver;

	/**
	 * this is used to initialize the driver on the basis of given browser
	 * name..Chrome, Firefox or Edge
	 * 
	 * @param browserName
	 * @return it returns the driver
	 */
	public WebDriver initBrowser(String browserName) {
		System.out.println("launching browser " + browserName);
		switch (browserName.trim().toLowerCase()) {
		case "chrome":
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		case "edge":
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Pls pass the valid browser from the list i.e. chrome, firefox or edge...");
			throw new BrowserException("===INVALID BROWSER===");
		}
		return driver;

	}

	// generic method: Method overloading concept - same method name with different
	// parameters
	public void launchURL(String url) {
		lengthCheck(url);
		httpCheck(url);
		nullCheck(url);
		driver.get(url);
	}

	public void launchURL(URL url) {
		String appURL = String.valueOf(url);
		lengthCheck(appURL);
		httpCheck(appURL);
		nullCheck(appURL);
		driver.navigate().to(url);

	}

	public String getPageTitle() {
		String Title = driver.getTitle();
		System.out.println("Page title is " + Title);
		return Title;

	}

	public String getPageURL() {
		String pageURL = driver.getCurrentUrl();
		System.out.println("Page URL is " + pageURL);
		return pageURL;

	}

	public void closeBrowser() {
		if (driver != null)
			driver.quit();
		driver.close();
		System.out.println("browser is closed");

	}

	public void quitBrowser() {
		if (driver != null)
			driver.quit();
		System.out.println("browser is closed");
	}

	private void lengthCheck(String value) {
		if (value.length() == 0) {
			System.out.println("URL cannot be blank " + value);
			throw new BrowserException("===Empty URL===");
		}

	}

	private void httpCheck(String urlValue) {
		if (urlValue.indexOf("http") != 0) {
			System.out.println("http is missing in the URL " + urlValue);
			throw new BrowserException("===HTTP protocol is missing===");
		}
	}
	
	private void nullCheck(String value) {
		if(value==null) {
			System.out.println("value cannot be null " + value);
			throw new BrowserException("===NULL value===");
		}
	}
	
	public List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public int getElementsCount(By locator) {
		int eleCount = getElements(locator).size();
		System.out.println("element count ==>" + eleCount);
		return eleCount;
	}
	
	public List<String> getElementTextList(By locator){
		List<WebElement> eleList = getElements(locator);
		List<String> eleTextList = new ArrayList<String>();
		
		for(WebElement e: eleList) {
			String text = e.getText();
			if (text.length() !=0) {
				System.out.println(text);
			}
		}
		return eleTextList;
	}
		
	


}
