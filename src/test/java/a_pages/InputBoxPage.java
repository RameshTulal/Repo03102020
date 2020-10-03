package a_pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InputBoxPage {
	WebDriver driver = null;
	
	By InputTextBox = By.id("user-message");
	By ShowMessageButton = By.xpath("//button[contains(text(),'Show Message')]");
	By OutPutMessage = By.id("display");
	
	
	public InputBoxPage(WebDriver driver) {
		this.driver =driver;		
	}	

	public void setTextInInputBox(String txt) {
		driver.findElement(InputTextBox).sendKeys(txt);	
	}
	public void clickShowMessageButton() {
		driver.findElement(ShowMessageButton).click();		
	}
	public boolean verifyOutPutMessage() {
		return driver.findElement(OutPutMessage).isDisplayed();
	}
}
