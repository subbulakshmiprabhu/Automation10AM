package waitdemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import basic.BaseClass;

public class ExplicitWaitDemo {
	
	public static void main(String[] args) {
		
		WebDriver driver = BaseClass.browserSetUp("chrome");
		//WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		WebElement username = wait.until(ExpectedConditions.presenceOfElementLocated(By.name("username")));
		username.sendKeys("Admin");
		
		
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		
		
	}

}
