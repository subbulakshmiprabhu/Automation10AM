package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadDemo {
	
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		WebElement choose = driver.findElement(By.name("upfile"));
		choose.sendKeys("G:\\Subbulakshmi\\Demo\\selenium notes\\Seleniumnotes_Jun27.txt");
		
	}

}
