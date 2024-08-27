package basic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertHandling {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		
		driver.get("https://letcode.in/alert");
		
		driver.manage().window().maximize();
		WebElement altButtton = driver.findElement(By.id("accept"));
		altButtton.click();
		
		
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		
		
		WebElement cnfmButton = driver.findElement(By.id("confirm"));
		cnfmButton.click();
	
		
		Alert confirmAlt = driver.switchTo().alert();
		
		String text = confirmAlt.getText();
		System.out.println(text);
		confirmAlt.dismiss();
		
		
		WebElement promptBtn = driver.findElement(By.id("prompt"));
		promptBtn.click();
		
		Alert promptAlt = driver.switchTo().alert();
		
		promptAlt.sendKeys("selenium");
		promptAlt.accept();
		
	}

}
