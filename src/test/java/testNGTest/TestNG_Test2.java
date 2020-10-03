package testNGTest;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Test2 {

	
		
	@BeforeTest
	public void setupTests() {
		System.out.println("Tests Setup Started");
	}
	
	@BeforeClass
	public void setupClass() {
		System.out.println("Class Setup Started");
	}
	
	@BeforeMethod
	public void setupMethod() {
		System.out.println("Method Setup Started");
	}
	
	@Test
	public void TestCase1() {
		Assert.assertEquals("String","String", "Test Failed: No element found");
		System.out.println("Test case 1 Executed");
	}
	@Test
	public void TestCase2() {
		Assert.assertEquals("String","String", "Test Failed: No element found");
		System.out.println("Test case 2 Executed");
	}
	@Test
	public void TestCase3() {
		Assert.assertEquals("String actual","String expected", "Test Failed: No element found");
		System.out.println("Test case 3 Executed");
	}
	@Test
	public void TestCase4() {
		Assert.assertEquals("String","String", "Test Failed: No element found");
		System.out.println("Test case 4 Executed");
	}
	
	@AfterMethod
	public void WindUpMethodSetUp() {		
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


}
