package designPattern;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseClass{
	
	@Test(priority = 2)
	public void loginCheck() {
		
		String actualtext = loginPage.login();
		String expectedText = "The password that you've entered is incorrect. Forgotten password?";
		Assert.assertEquals(actualtext, expectedText);
		
	}
	
	@Test(priority = 1)
	public void titleCheck() {
		String actualTitle = loginPage.getFbTitle();
		String expectedTitle = "Facebook – log in or sign up";
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@Test
	public void urlCheck() {
		String actualurl = loginPage.getUrl();
		String expectedUrl ="https://www.facebook.com/" ;
		Assert.assertEquals(actualurl, expectedUrl);
	}

}
