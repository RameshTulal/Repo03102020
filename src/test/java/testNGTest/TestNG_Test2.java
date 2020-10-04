//package testNGTest;
//
//import org.testng.Assert;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;
//
//public class TestNG_Test2 {	
//	
//	
//	@BeforeMethod
//	public void setupMethod() {
//		System.out.println("Method Setup Started");
//	}
//	
//	@Test
//	public void TestCase1() {
//		Assert.assertEquals("String","String", "Test Failed: No element found");
//		System.out.println("Test case 2.1 Executed");
//	}
//	@Test
//	public void TestCase2() {
//		Assert.assertEquals("String","String", "Test Failed: No element found");
//		System.out.println("Test case 2.2 Executed");
//	}
//	@Test
//	public void TestCase3() {
//		Assert.assertEquals("String actual","String expected", "Test Failed: No element found");
//		System.out.println("Test case 2.3 Executed");
//	}
//	
//	@AfterMethod
//	public void WindUpMethodSetUp() {		
//		System.out.println("Method Setup Finished");
//	}
//
//}
