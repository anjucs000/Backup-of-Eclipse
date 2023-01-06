package com.obsqura.selenium.TestNGHomeworks;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BaseClassStudy {
	public WebDriver driver;
	
	@BeforeMethod
	public void startBrowser() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjuc\\eclipse-workspace\\TestNGHomeworks\\src\\main\\java\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//Thread.sleep(2000);
		
	}
	@AfterMethod
	public void endSession() {
		driver.close();
	}
	

}
