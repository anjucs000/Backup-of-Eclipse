package com.obsqura.selenium.HomeWork;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroceryStorePage {
	public WebDriver d;
	
	public WebDriver loadPage() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anjuc\\eclipse-workspace\\HomeWork\\src\\main\\java\\com\\obsqura\\selenium\\HomeWork\\ChromeDriver\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("http://www.opesmount.in/grocerystore1/");
		return d;
	}

	public static void main(String[] args) {
		GroceryStorePage o=new GroceryStorePage();
		o.loadPage();

	}

}
