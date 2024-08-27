package testng;

import org.testng.annotations.Test;

public class Class2 {
	@Test(groups = "regression")
	public void testMethod3() {
		System.out.println("3 The Thread id is: "+ Thread.currentThread().getId());
		System.out.println("testmethod3");
	}

	@Test(groups = "smoke")
	public void testMethod4() {
		System.out.println("4 The Thread id is: "+ Thread.currentThread().getId());
		System.out.println("testmethod4");
	}


}
