package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import basic.BaseClass;

public class KeyBoardActions {
	
	public static void main(String[] args) {
		WebDriver driver = BaseClass.browserSetUp("chrome");
		driver.get("https://www.facebook.com/");
		
		WebElement email = driver.findElement(By.id("email"));
		
		Actions act = new Actions(driver);
		act.sendKeys(email, "selenium@gmail.com").perform();
		
		//ctrl +A 
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		
		//ctrl+c
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		
		//press tab key
		
		act.sendKeys(Keys.TAB).perform();
		
		//ctrl +v
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		
		//prees two tabs and click enter key
		
		
		act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build().perform();
		
		
		
		
	}

}
