package pages;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import utilities.ExcelUtility;
import utilities.PageUtility;
import utilities.WaitUtility;

public class SimpleFormDemoPageFactory {
	public WebDriver driver;
	public SimpleFormDemoPageFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@id='single-input-field']")
	private WebElement enterMessageField;
	
	@FindBy(xpath="//button[@id='button-one']")
	private WebElement showMessage;
	
	@FindBy(xpath="//div[@id='message-one']")
	private WebElement yourMessage;
	
	
public void verifySingleInputField() throws IOException {
		
		//String inputMessage=ExcelUtility.getStringMultiColor(1, 0, "\\src\\main\\java\\Resources\\TestData.xlsx", "Simple Form Demo");
		//String expectedText=ExcelUtility.getStringMultiColor(2, 0, "\\src\\main\\java\\Resources\\TestData.xlsx", "Simple Form Demo");
		String inputMessage="test";
		String expectedText="Your Message : ";
		String actualMessage,expectedMessage=expectedText+inputMessage;
		//driver.findElement(enterMessageField).sendKeys(inputMessage);
		PageUtility.enterText(enterMessageField, inputMessage);
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));//explicit wait
		//wait.until(ExpectedConditions.elementToBeClickable(showMessage));
		//WebElement showMessageWebElement=driver.findElement(showMessage);
		WaitUtility.waitForElementClickable(driver, showMessage);
		showMessage.click();
		wait.until(ExpectedConditions.presenceOfElementLocated((By) yourMessage));
		actualMessage=yourMessage.getText();
		Assert.assertEquals(actualMessage, expectedMessage, "Expected and actual outputs are not same");
		}
}
