package com.obsqura.selenium.TestNGSample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SimpleAlertSample extends Base{
	@Test
	public void simpleAlertMethod() {
		driver.navigate().to("https://selenium.obsqurazone.com/javascript-alert.php");
		WebElement clickMeButtonElemenet=driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		clickMeButtonElemenet.click();
		driver.switchTo().alert().accept();//ok button in alert
		clickMeButtonElemenet.click();
		String actualText=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		WebElement clickMeConfirmBox=driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		clickMeConfirmBox.click();
		driver.switchTo().alert().dismiss();//cancel button
		WebElement clickPromptBox=driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		clickPromptBox.click();
		//prompting for text
		driver.switchTo().alert().sendKeys("Anju");//add wait here.Then only its possible to view entering the text
		driver.switchTo().alert().accept();
	
	}

	

}
