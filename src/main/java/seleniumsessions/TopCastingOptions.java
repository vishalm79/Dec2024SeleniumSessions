package seleniumsessions;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {

		// 1. CD = new CD - only chrome browser
		// ChromeDriver driver = new ChromeDriver();

		// 2. WD d = new CD - valid and recommended
		// WebDriver driver = new ChromeDriver();

		// 3. SC d = new CD(); valid but not recommended
		// SearchContext driver = new ChromeDriver();

		// 4. WD d = new RWD(); valid and recommended only for remote execution, cloud,
		// AWS, VM or Grid
		// WebDriver driver = new RemoteWebDriver(remoteAddress, capabilities); //remote
		// is capa..is OS and browser

		// 5. SC d = new RWD(); valid but not recommended
		// SearchContext driver = new RemoteWebDriver(remoteAddress, capabilities);

		// 6. RWD d = new CD(); valid and recommended for local execution but not
		// generally used.
		//RemoteWebDriver driver = new ChromeDriver();

		// 7. Chromium d = new CD(); local and valid for only Chrome and Edge.
		//ChromiumDriver driver = new ChromeDriver();
		
		// 8. RWD d = new RWD();
		//RemoteWebDriver driver = new RemoteWebDriver(remoteAddress, capabilities);
	}

}
