package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FramesHandling {
	
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		driver.get("https://demo.automationtesting.in/Frames.html");
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		//driver.switchTo().frame("singleframe");
		driver.switchTo().frame(1);
		
		WebElement inputBox = driver.findElement(By.xpath("//input[@type = 'text']"));
		inputBox.sendKeys("selenium");
		
		driver.switchTo().defaultContent();
		
		WebElement button = driver.findElement(By.linkText("Iframe with in an Iframe"));
		button.click();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@src = 'MultipleFrames.html']"));
		//driver.switchTo().frame(frame);
		
		driver.switchTo().frame(2);
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src = 'SingleFrame.html']"));
		
		//driver.switchTo().frame(frame1);
		driver.switchTo().frame(0);
		
		
		WebElement input2 = driver.findElement(By.xpath("//input[@type = 'text']"));
		input2.sendKeys("selenium");
		
		driver.switchTo().parentFrame();
		WebElement heading = driver.findElement(By.xpath("//h5[text()  = 'Nested iFrames']"));
		System.out.println(heading.getText());
	}

}
