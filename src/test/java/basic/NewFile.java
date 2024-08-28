package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewFile {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		//FirefoxDriver driver2 = new FirefoxDriver();
		driver.get("https://www.google.com/");
		//WebElement input = driver.findElement(By.id("APjFqb"));
		//WebElement input = driver.findElement(By.name("q"));
		//WebElement input = driver.findElement(By.className("gLFyf"));
	   //  WebElement input = driver.findElement(By.tagName("textarea"));
		WebElement input = driver.findElement(By.xpath("//div[@jsname ='gLFyf']/child::textarea"));
		input.sendKeys("selenium");
		input.sendKeys(Keys.ENTER);
		
		Thread.sleep(10000);
		
		driver.close();
		
		
		
	}

}
