package waitdemo;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basic.BaseClass;

public class WaitAlertHandling {
	
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		//WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/waits");
		driver.findElement(By.id("accept")).click();
		
		//Alert alert = driver.switchTo().alert();
		//alert.accept();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		
	}

}
