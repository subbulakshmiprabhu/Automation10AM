package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxHandling {
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		driver.manage().window().maximize();
		
	//	WebElement checkbox = driver.findElement(By.id("sunday"));
		
		//checkbox.click();
		
		List<WebElement> checkboxes = driver.findElements(By.xpath("//input[contains(@id, 'day')]"));
		
		for(WebElement e :checkboxes) {
			//String id = e.getAttribute("id");
			//if()
			e.click();
			
			System.out.println(e.isSelected());
		}
	}

}
