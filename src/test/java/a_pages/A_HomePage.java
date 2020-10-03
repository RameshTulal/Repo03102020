package a_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class A_HomePage {
	WebDriver driver = null; 
	
	By linkInputForm = By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Input Forms')]");
	By linkSimpleFormDemo = By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Simple Form Demo')]");
	By linkCheckBoxDemo = By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Checkbox Demo')]");
	
		
	public A_HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void clickInputFormLink(WebDriver driver) {
		driver.findElement(linkInputForm).click();			
	}

	public void clickSimpleFormDemoLink(WebDriver driver) {
		driver.findElement(linkSimpleFormDemo).click();			
	}

	public void clickCheckBoxDemoLink(WebDriver driver) { 
		driver.findElement(linkCheckBoxDemo).click();
			
	}	
	
	
	public static void wait20()	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {				
			e.printStackTrace();
		}

	}

}






