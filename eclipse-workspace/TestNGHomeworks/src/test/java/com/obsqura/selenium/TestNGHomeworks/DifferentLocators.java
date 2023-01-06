package com.obsqura.selenium.TestNGHomeworks;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DifferentLocators extends BaseClassStudy{
	
	@Test //locating by ID
	public void locateByID() {
		driver.findElement(By.id("button-one")).click();
	}
	@Test //locating by class
	public void locateByClass() {
		driver.findElement(By.className("btn btn-primary"));//2 classes are there.But just to learn put this classname here
	}
	@Test //locating by name//in page -https://selenium.obsqurazone.com/date-picker.php
	public void locateByName() {
		driver.findElement(By.name("daterange"));
	}
	//locate by different CSS locators
	@Test
	public void locateByTagAndID() {
		driver.findElement(By.cssSelector("input#single-input-field"));
	}
	@Test //field is in the page -https://selenium.obsqurazone.com/check-box-demo.php
	public void locateByTagAndClass() {
		driver.findElement(By.cssSelector("input.form-check-input"));
	}
	@Test //element is in -https://selenium.obsqurazone.com/check-box-demo.php..5 elements are there.Here took this ..just for learning
	public void locateByTagAndAttribute() {
		driver.findElement(By.cssSelector("input[type='checkbox']"));
	}
	@Test
	public void locateByTagClassAttribute() { //3 elements present
		driver.findElement(By.cssSelector("input.form-control[type='text']"));
	}

}
