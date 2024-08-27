package listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerDemo  extends TestCase implements ITestListener {
	
	 public void onTestStart(ITestResult result) {
		    // not implemented
		 
		 System.out.println("ontest start");
		  }

	 public void onTestSuccess(ITestResult result) {
		    // not implemented
		 System.out.println("on test success");
		  }


	 public void onTestFailure(ITestResult result) {
		    // not implemented
		 System.out.println("on test failure");
		 
		 try {
			captureScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		  }
	 
	 public  void onFinish(ITestContext context) {
		    // not implemented
		 System.out.println("on test finish");
		  }
}
