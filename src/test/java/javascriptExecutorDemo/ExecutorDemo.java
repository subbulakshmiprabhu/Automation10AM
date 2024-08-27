package javascriptExecutorDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import basic.BaseClass;

public class ExecutorDemo {

	
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement register = driver.findElement(By.linkText("Register"));
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("arguments[0].click();", register);
		
		WebElement firstName = driver.findElement(By.id("FirstName"));
		WebElement lastName = driver.findElement(By.id("LastName"));
		WebElement male = driver.findElement(By.id("gender-male"));
		
		
		
		jse.executeScript("arguments[0].value ='selenium';arguments[1].value = 'java';arguments[2].click();", firstName, lastName, male);
		
	}
}
