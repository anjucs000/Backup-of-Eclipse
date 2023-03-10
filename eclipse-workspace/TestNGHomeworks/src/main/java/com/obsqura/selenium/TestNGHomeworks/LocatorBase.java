package com.obsqura.selenium.TestNGHomeworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class LocatorBase {
	WebDriver driver;
	
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjuc\\eclipse-workspace\\TestNGHomeworks\\src\\main\\java\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
}

