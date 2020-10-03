package a_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Congif.PropertiesFile;
import a_pages.A_HomePage;
import a_pages.InputBoxPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class InputBoxPageTest {
	
	private static WebDriver driver = null;	
	public static String Browser;	
	static String baseUrl = "https://www.seleniumeasy.com/test/charts-mouse-hover-demo.html"; 	
	static String InputText = "Test Message for InputBox";	
	
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
	public void setUpTest() {
		PropertiesFile.readPropertiesFile();
		if(Browser.contains("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();	
			driver.get(baseUrl);	
			driver.manage().window().maximize();			 
			A_HomePage.wait20();		
		}
		else
		{
			System.out.println("Only Chrome browser supporing at this moment");
		}
		//PropertiesFile.writePropertiesFile();	
		
	}
	
	@Test
	public static void runTest() {					
		A_HomePage objA_HomePage = new A_HomePage(driver);
		InputBoxPage objInputBoxPage = new InputBoxPage(driver);
		
		objA_HomePage.clickInputFormLink(driver);	
		objA_HomePage.clickSimpleFormDemoLink(driver);		
		objInputBoxPage.setTextInInputBox(InputText);
		objInputBoxPage.clickShowMessageButton();
		if(objInputBoxPage.verifyOutPutMessage()){
			System.out.println("Test Passed!");
		}
		else {
			System.out.println("Test Failed!");
		}		
	}
	
	@Test
	public static void runTest2() {					
		A_HomePage objA_HomePage = new A_HomePage(driver);
		InputBoxPage objInputBoxPage = new InputBoxPage(driver);
		
		objA_HomePage.clickInputFormLink(driver);	
		objA_HomePage.clickSimpleFormDemoLink(driver);		
		objInputBoxPage.setTextInInputBox(InputText);
		objInputBoxPage.clickShowMessageButton();
		if(objInputBoxPage.verifyOutPutMessage()){
			System.out.println("Test Passed!");
		}
		else {
			System.out.println("Test Failed!");
		}		
	}
	
	@AfterMethod
	public void tearDownTest() {
		driver.close();		
	}
}
