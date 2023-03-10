package com.obsqura.selenium.TestNGSample;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class Base {
	public WebDriver driver;
	
	@BeforeMethod
	public void initialiseBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anjuc\\eclipse-workspace\\TestNGSample\\src\\main\\java\\Resource\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		//driver.navigate().to("https://selenium.obsqurazone.com/form-submit.php");
		//driver.get("https://www.amazon.in/");
		driver.manage().window().maximize(); //to maximise the window size
		//Assert.assertTrue(true);
	}
	//@AfterMethod
	public void browserClose() {
		driver.close();
	}
	public void driverQuit() {
		driver.quit();
	}
	}

