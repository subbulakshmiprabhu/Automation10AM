package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootsrapDropdownHandling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
		
		WebElement button = driver.findElement(By.id("dropdownMenuButton"));
		button.click();
		//WebElement link = driver.findElement(By.linkText("Action"));
		
		//System.out.println(link.getText());
		//link.click();
		
		List<WebElement> options = driver.findElements(By.xpath("//div[@class = 'dropdown-menu show']/child::a"));
		
		for(WebElement x:options) {
			
			System.out.println(x.getText());
			
		}

	}

}
