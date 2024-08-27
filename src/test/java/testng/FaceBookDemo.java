package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBookDemo {
	WebDriver driver;
	
	@BeforeSuite
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		System.out.println("before test");
	}
	
	@Test
	public void login() {
		
		
		driver.findElement(By.id("email")).sendKeys("testng@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123");
		driver.findElement(By.name("login")).click();
		
		
		
		
	}

	
	@AfterSuite
	public void tearDown() {
		System.out.println("after test");
		driver.close();
	}
}
