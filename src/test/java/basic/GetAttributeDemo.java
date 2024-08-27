package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetAttributeDemo {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		
//		WebElement input = driver.findElement(By.id("APjFqb"));
//		
//		input.sendKeys("selenium");
//		
//		
//		String attribute = input.getAttribute("value");
//		
//		System.out.println(attribute);
//		
//		System.out.println(input.getAttribute("id"));
//		
//		System.out.println(input.getAttribute("class"));
//		System.out.println(input.getAttribute("name"));
		
		
//		WebElement link = driver.findElement(By.linkText("Gmail"));
//		
//		
//		String text = link.getText();
//		
//		System.out.println(text);
//		
//		String linkValue = link.getAttribute("innerHTML");
//		
//		System.out.println(linkValue);
		
		  WebElement bodyElement = driver.findElement(By.tagName("body"));
		  
		  
		  System.out.println(bodyElement.getText());
		
		
	}

}
