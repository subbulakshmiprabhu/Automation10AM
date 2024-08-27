package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SliderDemo {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		WebElement minSlider = driver.findElement(By.xpath("//div[@id = 'slider-range']/child::span[1]"));
		WebElement maxSlider = driver.findElement(By.xpath("//div[@id = 'slider-range']/child::span[2]"));
		
		
		Point location = minSlider.getLocation();
		System.out.println(location);
		
		Point location2 = maxSlider.getLocation();
		System.out.println(location2);
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(minSlider, 100, 250).perform();
		act.dragAndDropBy(maxSlider, -100,250).perform();
	}

}
