package testNGTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Test {
	WebDriver driver = null;
	static String baseUrl = "https://www.seleniumeasy.com/test/charts-mouse-hover-demo.html"; 		
	
	@BeforeSuite
	public void setupSuit() {
		System.out.println("Suit Setup Started");
	}
	
	@BeforeTest
	public void setupTests() {
		System.out.println("Tests Setup Started");
	}
	
	@BeforeClass
	public void setupClass() {
		System.out.println("Class Setup Started");
	}
	
	@BeforeMethod
	public void setupMethod() throws InterruptedException {
		System.out.println("Method Setup Started");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);			
	}
	
	@Test
	public void TestCase1() throws InterruptedException {
		driver.get(baseUrl);
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Assert.assertEquals("String","String", "Test Failed: No element found");
		System.out.println("Test case 1 Executed");
	}
	
	@AfterMethod
	public void WindUpMethodSetUp() throws InterruptedException {	
		Thread.sleep(2000);
		driver.close();
		System.out.println("Method Setup Finished");
	}
	
	@AfterClass
	public void WindUpClassSetUp() {
		System.out.println("Class Setup Finished");
	}
	
	@AfterTest
	public void WindUpTestsSetUp() {
		System.out.println("Tests Setup Finished");
	}
	
	@AfterSuite
	public void WindUpSuitSetUp() {
		System.out.println("Suit Setup Finished");
	}	
	

}
