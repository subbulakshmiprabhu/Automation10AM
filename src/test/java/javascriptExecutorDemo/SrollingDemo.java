package javascriptExecutorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.BaseClass;

public class SrollingDemo {
	
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		
		driver.get("https://en.wikipedia.org/wiki/India");
		driver.manage().window().maximize();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollBy(0, 4000);");
		
		WebElement geoElement = driver.findElement(By.id("Geography"));
		
		jse.executeScript("arguments[0].scrollIntoView(true);", geoElement);
		
	}

}
