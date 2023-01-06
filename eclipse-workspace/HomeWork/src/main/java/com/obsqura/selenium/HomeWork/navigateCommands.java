package com.obsqura.selenium.HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateCommands {
	
	public WebDriver driver;
	public void navigCommands() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjuc\\eclipse-workspace\\HomeWork\\src\\main\\java\\com\\obsqura\\selenium\\HomeWork\\ChromeDriver\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("http://www.opesmount.in/grocerystore1/");
		driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		navigateCommands obj=new navigateCommands();
		obj.navigCommands();

	}

}
