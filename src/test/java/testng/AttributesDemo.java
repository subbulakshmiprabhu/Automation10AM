package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AttributesDemo {
	
	@Test(priority = -2, description= "login page of ecommerce")
	public void login() {
		
		System.out.println("login");
		Assert.assertEquals(false, true);
		
	}
	@Test(priority = -1, invocationCount = 2, dependsOnMethods = "login", alwaysRun = false)
	public void homepage() {
		System.out.println("homepage");
	}
	@Test(priority = 0, invocationCount = 2, invocationTimeOut = 2000)
	public void addToCart() throws InterruptedException {
		
		Thread.sleep(1500);
		System.out.println("addTocart");
	}
	@Test(priority = 4, enabled = false)
	public void checkOut() {
		System.out.println("checkOut");
	}

	
	@Test(priority = 5, expectedExceptions = Exception.class)
	public void check() {
		
		int div = 10/0;
		System.out.println("division");
		
	}
}
