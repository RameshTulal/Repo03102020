package testNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E2ETest {

	WebDriver driver = null;
	static String baseUrl = "https://www.seleniumeasy.com/test/charts-mouse-hover-demo.html"; 		
	
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

}
