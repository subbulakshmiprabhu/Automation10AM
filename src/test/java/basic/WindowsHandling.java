package basic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandling {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	WebElement inputbox = 	driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
	
	inputbox.sendKeys("selenium");
	inputbox.sendKeys(Keys.ENTER);
	
	List<WebElement> allLinks = driver.findElements(By.xpath("//div[@id = 'Wikipedia1_wikipedia-search-results']//a"));
		
		for(WebElement link:allLinks) {
			
			link.click();
			
		}
		
		
		String windowHandle = driver.getWindowHandle();
		System.out.println(windowHandle);
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		for(String curHandle:windowHandles) {
			
			driver.switchTo().window(curHandle);
			
			String title = driver.getTitle();
			System.out.println(title);
			
		}
		
		//Converting set to list 
		
		
		List<String> list = new ArrayList<>(windowHandles);
		
		list.get(3);
		
		//switching to the child windows
		System.out.println("Swtiching to the child windows");
		
          for(String curHandle:windowHandles) {
        	  if(!(windowHandle.equals(curHandle))) {
			
			driver.switchTo().window(curHandle);
			
			String title = driver.getTitle();
			System.out.println(title);
        	  }
			
		}
          
          String s = "selenium";
          String s1 ="selenium";
          String s2 = new String("selenium");
          //s == s1 // true
          //s1 == s2  // false
          
          s1.equals(s2); //true
		
		
		
	}

}
