package com.obsqura.selenium.TestNGSample;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class PopupToOtherPageWindowHandle extends Base {
	@Test
	public void windowHandleMethod() {
		driver.navigate().to("https://selenium.obsqurazone.com/window-popup.php");
		WebElement likeUsOnFacebookButton=driver.findElement(By.xpath("//a[@class='btn btn-primary windowSingle']"));
		likeUsOnFacebookButton.click();
		String mainWindow=driver.getWindowHandle();
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> i1=s1.iterator();
		while(i1.hasNext())
		{
			String childWindow=i1.next();
			if(!mainWindow.equalsIgnoreCase(childWindow));
			{
				//switching to child window
				driver.switchTo().window(childWindow);
				//driver.manage().window().maximize();
				WebElement loginButton=driver.findElement(By.xpath("//a[@aria-label='Accessible login button']"));
				loginButton.click();
				driver.close();
			}
		}
	driver.switchTo().window(mainWindow); //switch to main window
	}
}
