package com.obsqura.selenium.JUnitSample;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BrowserCommands extends Base {
	@Test
	public void basicCommands() {
		String actualTitle, actualURL, actualSource, expectedTitle = "Obsqura Testing";
		actualTitle = driver.getTitle(); // to get title of the site
		actualURL = driver.getCurrentUrl(); // to get actual url from site
		actualSource = driver.getPageSource();
		assertEquals(expectedTitle,actualTitle);//to compare 2 string values

	}
	@Test
	public void navigateCommands() {
		driver.navigate().to("https://selenium.obsqurazone.com/radio-button-demo.php");
		driver.navigate().back();// go to last page
		driver.navigate().forward(); // again go to the next page
		driver.navigate().refresh(); // to refresh page
	}
}
