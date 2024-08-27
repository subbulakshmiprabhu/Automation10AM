package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DatePickerDemo {
	
	
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		
		WebElement input = driver.findElement(By.id("datepicker"));
		//input.sendKeys("07/18/2024");
		input.click();
		
		String month = "August";
		String date = "25";
		String year ="2025";
		
		while(true) {
		String mon = driver.findElement(By.xpath("//span[@class ='ui-datepicker-month']")).getText();
		String yr = driver.findElement(By.xpath("//span[@class ='ui-datepicker-year']")).getText();
		if(mon.equals(month) && yr.equals(year)) {
			break;
		}
		
		WebElement nextBtn = driver.findElement(By.xpath("//span[text() = 'Next']"));
		nextBtn.click();
		
		
		}
		
		
       List<WebElement> allDates = driver.findElements(By.xpath("//table[@class = 'ui-datepicker-calendar']//tr/td/a"));
		
		for(WebElement dateElement: allDates) {
			String dateStr = dateElement.getText();
			if(dateStr.equals(date)) {
				dateElement.click();
			}
			
			
		}
		
	}

}
