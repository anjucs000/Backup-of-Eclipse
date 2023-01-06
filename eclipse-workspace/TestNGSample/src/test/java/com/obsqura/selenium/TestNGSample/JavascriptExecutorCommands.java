package com.obsqura.selenium.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JavascriptExecutorCommands extends Base {
	@Test
	public void scrollMethod() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//in this scrolling x value is 0 bcs its a vertical scroll
		js.executeScript("window.scrollBy(0,350)", ""); //it will scrolldown.value 350 that depends on how much we need to scroll the page.
		js.executeScript("window.scrollBy(0,-350)", ""); //this will scrollup
		//below code will scrolldown until the provided element is visible
		WebElement element=driver.findElement(By.xpath("//button[@id='button-two']"));
		js.executeScript("arguments[0].scrollIntoView()", element);
		js.executeScript("window.scrollBy(0,-350)", "");
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		js.executeScript("arguments[0].click()", element);

	}

}
