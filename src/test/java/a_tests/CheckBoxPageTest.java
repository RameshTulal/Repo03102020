package a_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Congif.PropertiesFile;
import a_pages.A_HomePage;
import a_pages.CheckBoxPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxPageTest {
	private static WebDriver driver = null;	
	public static String Browser;	
	static String baseUrl = "https://www.seleniumeasy.com/test/charts-mouse-hover-demo.html"; 	
	
	@BeforeTest
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
		//driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);		
		A_HomePage objA_HomePage = new A_HomePage(driver);
		CheckBoxPage objCheckBoxPage = new CheckBoxPage(driver);
		
		objA_HomePage.clickInputFormLink(driver);	
		objA_HomePage.clickCheckBoxDemoLink(driver);	
		objCheckBoxPage.clickSingleCheckBox();
		if(objCheckBoxPage.verifySusseccMessage()){
			objCheckBoxPage.clickCheckAllButton();
			if(objCheckBoxPage.verifyCheckAllButtonWorks()) {	
				System.out.println("Test Passed!");
			}
		}
		else {
			System.out.println("Test Failed!");
		}
	
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();		
	}
}
