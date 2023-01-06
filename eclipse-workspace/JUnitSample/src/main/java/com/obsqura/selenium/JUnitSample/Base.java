package com.obsqura.selenium.JUnitSample;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver; //declaring object of WebDriver as public bcz we need to use it in diff methods
	
	@Before
	public void initialiseBrowser() { //the driver in the below setproperty and above object are different..not same
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anjuc\\eclipse-workspace\\JUnitSample\\src\\main\\java\\Resources\\chromedriver.exe");	
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.manage().window().maximize(); //to maximise the window size
	}
	
	public void browserClose() {
		driver.close();
	}
	@After
	public void driverQuit() {
		driver.quit();
	}
	}

