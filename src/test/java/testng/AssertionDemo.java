package testng;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionDemo {
	
	@Test
	public void login() {
		
		//Assert.assertEquals(true, false);
		Assert.assertNotEquals(true, false);
		System.out.println("end");
	}
	
	@Test
	public void softDemo() {
		SoftAssert s = new SoftAssert();
		s.assertEquals(false, true);
		System.out.println("end");
		s.assertAll();
	}

}
