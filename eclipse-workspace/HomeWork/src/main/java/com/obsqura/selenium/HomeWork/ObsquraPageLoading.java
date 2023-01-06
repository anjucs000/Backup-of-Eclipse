package com.obsqura.selenium.HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ObsquraPageLoading {
	public WebDriver chDriver;
	
	public WebDriver initObsqura() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anjuc\\eclipse-workspace\\HomeWork\\src\\main\\java\\driverpath\\chromedriver.exe");
		chDriver=new ChromeDriver();
		chDriver.get("https://www.obsqurazone.com/");
		return chDriver;
	}
	public static void main(String[] args) {
		ObsquraPageLoading obj= new ObsquraPageLoading();
		obj.initObsqura();
	}

}
