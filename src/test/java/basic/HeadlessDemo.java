package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessDemo {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		
		ChromeOptions options = new ChromeOptions();
		
		//options.addArguments("--headless");
		
		options.setHeadless(false);
		
		options.addArguments("incognito");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("selenium@gmail.com");
		
		
		System.out.println(username.getAttribute("value"));
	}

}
