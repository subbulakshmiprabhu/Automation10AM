package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableDemo {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr"));
		
		int rowSize = rows.size();
		
		List<WebElement> cols = driver.findElements(By.xpath("//table[@name = 'BookTable']//tr//th"));
		
		int colSize = cols.size();
		
		//print all the table datas
		for(int row =2; row<=rowSize ; row++) {
			for(int col =1; col<=colSize; col++) {
				
				
				WebElement dataElement = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+row+"]//td["+col+"]"));
				
				System.out.print(dataElement.getText()+" ");
				
			}System.out.println();
		}
		
		
		
		//print data based on the specific condition.
		System.out.println("Amod's book name");
		
		
		for(int row =2; row<=rowSize; row++) {
			
			
			
			WebElement authorElement = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+row+"]/td[2]"));
			String authorName = authorElement.getText();
			
			
			if(authorName.equals("Amod")) {
				
				
				String bookname = driver.findElement(By.xpath("//table[@name = 'BookTable']//tr["+row+"]/td[1]")).getText();
				System.out.println(bookname);
				
			}
			
		}
	}

}
