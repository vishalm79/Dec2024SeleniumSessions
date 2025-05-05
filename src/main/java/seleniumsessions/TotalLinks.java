package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		System.out.println(linkList.size());

//		for (int i = 0; i < linkList.size(); i++) {
//			String linkText = linkList.get(i).getText();
//			if (linkText.length() !=0) {
//				System.out.println(i + " = " + linkText);
//			}
//		}
		
		System.out.println("================");
		
		for(WebElement e: linkList) {
			String links = e.getText();
			if (links.length() !=0) {
				System.out.println(links);
			}
		}

		driver.quit();
	}

}
