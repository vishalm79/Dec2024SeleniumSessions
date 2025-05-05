package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonBrowserUtility {
	
	WebDriver driver;
	
	public WebDriver amazonInitBrowser(String browserName) {
		System.out.println("launching browser: " + browserName);
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
			System.out.println("Pls pass the valid browser from the list i.e. chrome, firefox or edge");
			throw new AmazonExceptionUtility("===INVALID BROWSER===");
		}
		return driver;
		
	}
	

}
