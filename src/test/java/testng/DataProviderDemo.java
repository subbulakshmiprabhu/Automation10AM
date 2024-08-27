package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderDemo {
	
	
	@Test(dataProvider = "data")
	public void login(String name, String pass) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new  ChromeDriver();
			
		driver.get("https://www.facebook.com/");
			
			driver.findElement(By.id("email")).sendKeys(name);
			
			driver.findElement(By.id("pass")).sendKeys(pass);
			
			driver.findElement(By.name("login")).click();

		
	}
	
	@DataProvider(name = "data")
	public Object[][] credentialData() {
		
		
		Object[][]  arr= {{"testng@gmail.com", "123"}, {"selenium@gmail.com", "456"}, {"java@gmail.com", "789"}};
		
		return arr;
	}

}
