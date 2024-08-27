package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandling {
	
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://letcode.in/dropdowns");
		
		driver.manage().window().maximize();
		WebElement dropdown = driver.findElement(By.id("fruits"));
		
		
		Select s = new Select(dropdown);
		
		//s.selectByIndex(4);
		
		//s.selectByValue("4");
		
		s.selectByVisibleText("Mango");
		
		
		WebElement dropdwn1 = driver.findElement(By.id("superheros"));
		
		Select s1 = new Select(dropdwn1);
		
		s1.selectByIndex(1);
		s1.selectByValue("bt");
		s1.selectByVisibleText("Daredevil");
		
		
		//s1.deselectAll();
		
		//s1.deselectByIndex(1);
		
		//s1.deselectByValue("bt");
		
		//s1.deselectByVisibleText("Daredevil");
		
		
		List<WebElement> allSelectedOptions = s1.getAllSelectedOptions();
		
		//System.out.println(allSelectedOptions);
		
		
		for(WebElement x :allSelectedOptions) {
			
			System.out.println(x.getText());
			
		}
		
		
		WebElement firstSelectedOption = s1.getFirstSelectedOption();
		
		
		System.out.println(firstSelectedOption.getText());
		
		
	}

}
