package testng;

import org.testng.annotations.Test;

public class Class1 {
	
	@Test(groups ={"sanity", "regression"})
	public void testMethod1() {
		System.out.println("1 The Thread id is: "+ Thread.currentThread().getId());
		System.out.println("testmethod1");
	}

	@Test(groups = "smoke")
	public void testMethod2() {
		System.out.println("2 The Thread id is: "+ Thread.currentThread().getId());
		System.out.println("testmethod2");
	}

}
