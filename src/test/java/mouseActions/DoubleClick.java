package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		
		WebElement input = driver.findElement(By.id("field1"));
		
		input.clear();
		
		
		input.sendKeys("selenium");
		
		WebElement button = driver.findElement(By.xpath("//button[text() = 'Copy Text']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(button).perform();
	}

}
