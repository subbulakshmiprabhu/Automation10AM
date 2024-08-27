package mouseActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {
	
	
	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver =  new ChromeDriver();
	
	driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=155259815513&hvpone=&hvptwo=&hvadid=674842289437&hvpos=&hvnetw=g&hvrand=7704838412336621145&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007809&hvtargid=kwd-10573980&hydadcr=14453_2316415&gad_source=1");
	WebElement helloElement = driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	
	WebElement order = driver.findElement(By.xpath("//span[text() = 'Your Orders']"));
	
	
	Actions act = new Actions(driver);
	
	act.moveToElement(helloElement).perform();
	act.moveToElement(order).click().perform();
	
	}

}
