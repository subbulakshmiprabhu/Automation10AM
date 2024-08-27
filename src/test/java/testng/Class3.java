package testng;

import org.testng.annotations.Test;

public class Class3 {

	@Test(groups = "sanity")
	public void testMethod5() {
		System.out.println("5 The Thread id is: "+ Thread.currentThread().getId());
		System.out.println("testmethod5");
	}

	@Test(groups = "smoke")
	public void testMethod6() {
		System.out.println("6 The Thread id is: "+ Thread.currentThread().getId());
		System.out.println("testmethod6");
	}

}
