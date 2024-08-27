package testng;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportDemo {
	
	ExtentReports extent;
	
	static WebDriver driver;
	
	static ExtentTest test;
	
	@BeforeTest
	public void setUp() {
		
		
		
		// directory where output is to be printed
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"\\report\\extentReport.html");
	    extent = new ExtentReports();
		extent.attachReporter(spark);
		
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();	
		

	}
	
	
	@Test
	public void login() throws IOException {
		 test = extent.createTest("Navigate to google page").assignAuthor("username1").assignCategory("smoke").assignDevice("window10");
		 
		 driver.get("https://www.google.com/");
		 
		 
		 test.log(Status.INFO, "User is getting the title");
		 
		 String actualTitle = driver.getTitle();
		 
		 String expectedTitle = "Googlee";
		 
		 if(actualTitle.equals(expectedTitle)) {
			 
			 test.log(Status.PASS, "Title matched");
			 
		 }else {
			 test.log(Status.FAIL, "Title mismatched");
			 
			 takeScreenshot();
		 }
		 
	}
	
	
	@Test
	
	public void test2() {
		test = extent.createTest("Login page").assignAuthor("user2").assignCategory("sanity").assignDevice("windows11");
		
		test.log(Status.INFO, "user is logged in");
		
		test.log(Status.PASS, "test case passed");
		
	}
	
	
	@AfterTest
	
	public void tearDown() {
		extent.flush();
	}
	
public static void takeScreenshot() throws IOException {
		
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy h-m-s");
		Date date = new Date();
		
		
		TakesScreenshot tks = (TakesScreenshot) driver;// casting
		
		File image = tks.getScreenshotAs(OutputType.FILE);
		
		
		//File dest = new File("./screenshot/facebook"+System.currentTimeMillis()+".png");
		
		File dest = new File("./screenshot/google"+ formatter.format(date)+".png");
		
		
		FileUtils.copyFile(image, dest);
		
		test.log(Status.FAIL , MediaEntityBuilder.createScreenCaptureFromPath(dest.getAbsolutePath()).build());
		
		
		
		
		
	}
	
	
	
	

}
