package com.obsqura.selenium.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IframeSample extends Base{
	@Test
	public void iframeMethod() {
		driver.navigate().to("https://www.globalsqa.com/demo-site/frames-and-windows/#iFrame");
		int size=driver.findElements(By.tagName("iframe")).size();
		//driver.switchTo().frame(0);//switching to frame by index
		//driver.switchTo().frame(driver.findElement(By.xpath("//li[@class='resp-tab-item resp-tab-active']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']")));
		//driver.switchTo().frame(driver.findElement(By.xpath("//div[@class='single_tab_div resp-tab-content resp-tab-content-active']")));
		driver.findElement(By.xpath("//a[@href='https://www.globalsqa.com/training/selenium-online-training/']")).click();
		//driver.quit();
		//driver.switchTo().defaultContent();
		
	}

}
