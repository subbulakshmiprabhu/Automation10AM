package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableTask {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		List<WebElement> datas = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr/td[4]"));
		
		int sum = 0;
		
		for(WebElement data : datas) {
			String text = data.getText();
			
			int num = Integer.parseInt(text);
			
			sum = sum+num; //800
		}
		
		System.out.println(sum);
	}

}
