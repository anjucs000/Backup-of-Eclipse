package com.obsqura.selenium.pageObjectModel_POM;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import constants.Constants;

public class BasePOM {
public WebDriver driver;
public Properties prop,prop1;
public FileInputStream fs,fs1;
	
	@BeforeMethod
	public void initialiseBrowser() {
		prop=new Properties();
		try {
			fs = new FileInputStream(System.getProperty("user.dir") +constants.Constants.CONFIGfILE);
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			prop.load(fs);
		} catch (Exception e) {
			// TODO: handle exception
		}
		prop1=new Properties();

		try {
			fs = new FileInputStream(System.getProperty("user.dir") +constants.Constants.TESTDATAFILE);
		} catch (Exception e) {
			// TODO: handle exception
		}
		try {
			prop1.load(fs);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\chromedriver.exe");	
		driver=new ChromeDriver();
		//driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
		driver.get(prop.getProperty("url"));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//old format
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));//new format
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}

}
