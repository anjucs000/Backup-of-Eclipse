package com.obsqura.selenium.TestNGHomeworks;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locators extends LocatorBase{
	//Nykaa site
	
	//@Test(description="Located by tag and ID")
	public void locateByCSSTagandID() {
		driver.findElement(By.cssSelector("a#category")).click();
	}
	//@Test(description="Located by tag and class")
	public void locateByCSSTagandClass() {
		driver.findElement(By.cssSelector("input.css-1upamjb")).click();
	}
	//@Test(description="Located by tag and attribute")
	public void locateByCSSTagandAttribute() {
		driver.findElement(By.cssSelector("a[href=\"/luxe-focus\"]")).click();
	}
	//@Test(description="Located by tag,class and attribute")
	public void locateByCSSTagClassandAttribute() {
		driver.findElement(By.cssSelector("a.Offers_Hover[id=OfferBlock]")).click();
	}
	//@Test(description="Tag and innertext")
	public void locateByCSSInnerText() {
		//no elements available
	}
	//@Test(description="using simple Xpath")
	public void locateBySimpleXpath() {
		driver.findElement(By.xpath("//input[@placeholder='Search on Nykaa']")).click();
	}
	//@Test(description="using Xpath with text")
	public void locateByXpathWithText() {
		driver.findElement(By.xpath("//a[text()='categories']")).click();;
	}
	@Test(description="full xpath copied from site directly")
	public void locateByXpath() {
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div/div/div[2]/ul/li[1]/a/span[2]")).click();;
	}
	@Test(description="xpath samples")
	public void locate() {
		driver.findElement(By.xpath("//span[text()='Get App']")).click();
		driver.findElement(By.xpath("(//span[@class='ts-text'])[2]")).click();
		//driver.findElement(By.xpath("(//a[@class='nw-store-get-direction-btn'])[1]")).click();
		driver.findElement(By.xpath("//button[@aria-label='Kebab menu']"));
		//WebElement searchField=driver.findElement(By.xpath("//input[@name='search-suggestions-nykaa']"));
		//searchField.sendKeys("lipstick");
		//searchField.sendKeys(Keys.ENTER);
		/*driver.findElement(By.xpath(xpathExpression));
		driver.findElement(By.xpath(xpathExpression));
		driver.findElement(By.xpath(xpathExpression));
		driver.findElement(By.xpath(xpathExpression));*/
		
	}
	
	
	
	
	
	
}
