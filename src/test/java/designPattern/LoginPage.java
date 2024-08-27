package designPattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseClass {
	
	By username = By.id("email");
	By password = By.id("pass");
	By login = By.name("login");
	By forgotPwd = By.linkText("Forgotten password?");
	By createNewBtn = By.xpath("//a[text() = 'Create new account']");
	
	By divElement = By.xpath("//div[@class = '_9ay7']");
	
	
	public String login() {
		driver.findElement(username).sendKeys("selenium@gmail.com");
		driver.findElement(password).sendKeys("123");
		driver.findElement(login).click();
		WebElement element = driver.findElement(divElement);
		String text = element.getText();
		//System.out.println(text);
		return text;
	}
	
	
	public String getFbTitle() {
		
		String actaulTitle = driver.getTitle();
		
		return actaulTitle;
		
	}
	
	public String getUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

}
