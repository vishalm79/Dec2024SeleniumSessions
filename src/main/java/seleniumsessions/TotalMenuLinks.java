package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalMenuLinks {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		List<WebElement> menuLinks = driver.findElements(By.className("list-group-item"));
		System.out.println(menuLinks.size());

		for (WebElement e : menuLinks) {
			String menuList = e.getText();
			System.out.println(menuList);
			if (menuList.equals("Returns")) {
				e.click();
				break;
			}
		}
		driver.quit();
		System.out.println("browser closed");
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static int getElementsCount(By locator) {
		int eleCount = getElements(locator).size();
		System.out.println("element count ==>" + eleCount);
		return eleCount;
	}

}
