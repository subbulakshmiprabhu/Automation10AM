package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FbLoginWithParameters {
	
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		
	 driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
	}
	
	@Test
	@Parameters({"username", "password"})
	public void login(String name, String pass) {
		driver.findElement(By.id("email")).sendKeys(name);
		
		driver.findElement(By.id("pass")).sendKeys(pass);
		
		driver.findElement(By.name("login")).click();
	}

}
