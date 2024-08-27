package brokenlink;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.BaseClass;

public class HandlingLinks {
	
	
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		//driver.get("https://www.softwaretestingmaterial.com/");
		driver.get("http://www.deadlinkcity.com/");
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		int sum = 0;
		
		for(WebElement link:alltags) {
			
			String urlStr = link.getAttribute("href");
			int flag = BrokenLinkChecker.linkChecker(urlStr);
			
			sum += flag;
			
		}System.out.println("Broken links count "+ sum);
	}

}
