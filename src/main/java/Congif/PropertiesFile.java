package Congif;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

import a_tests.InputBoxPageTest;
import a_tests.CheckBoxPageTest;

public class PropertiesFile {
	static Properties prop = new Properties();
	
	public static void readPropertiesFile() {		
		try {
			InputStream input = new FileInputStream("F:/Ramesh/Selenium/SeleniumWorkSpace/SeleniumTest/src/Congif/Config.properties");
			prop.load(input);	
			a_tests.InputBoxPageTest.Browser = prop.getProperty("Browser");
			InputBoxPageTest.Browser = prop.getProperty("Browser");
			CheckBoxPageTest.Browser = prop.getProperty("Browser");
			
		} catch (Exception e) {			
			e.printStackTrace();
		}
		
	}
	public static void writePropertiesFile() {
		try {
			OutputStream output = new FileOutputStream("F:/Ramesh/Selenium/SeleniumWorkSpace/SeleniumTest/src/Congif/Config.properties");
			prop.setProperty("NewValue2", "New Value2 For testing");
			prop.store(output, "New Comment2 For testing");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
