package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		
		WebElement uname = driver.findElement(By.xpath("//input[@name = 'email']"));
		uname.sendKeys("selenium");
		WebElement pass = driver.findElement(By.xpath("//input[@type = 'password']"));
		pass.sendKeys("12");
		
		WebElement login = driver.findElement(By.xpath("//button[@type = 'submit']"));
		
		login.click();
	}
}
