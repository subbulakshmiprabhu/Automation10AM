package basic;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ScreenshotDemo {
	
	public static void main(String[] args) throws IOException, AWTException {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		driver.get("https://www.facebook.com/");
		
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("selenium");
		//takeScreenshot(driver);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("123");
		///takeScreenshot(driver);
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		//takeScreenshot(driver);
		
		completeScreenshot();
	}

	
	
	public static void takeScreenshot(WebDriver driver) throws IOException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy h-m-s");
		Date date = new Date();
		
		
		TakesScreenshot tks = (TakesScreenshot) driver;// casting
		
		File image = tks.getScreenshotAs(OutputType.FILE);
		
		
		//File dest = new File("./screenshot/facebook"+System.currentTimeMillis()+".png");
		
		File dest = new File("./screenshot/facebook"+ formatter.format(date)+".png");
		
		
		FileUtils.copyFile(image, dest);	
		
		
		
	}
	
	
	
	public static void completeScreenshot() throws AWTException, IOException {
		Robot r = new Robot();
		
		Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rect = new Rectangle(d);
		
		BufferedImage image = r.createScreenCapture(rect);
		
		File dest = new File("./screenshot/robot.png");
		
		ImageIO.write(image, "png", dest);
		
		
		
		
		
		
		
	}
}
