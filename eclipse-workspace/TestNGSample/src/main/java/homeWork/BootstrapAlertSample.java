package homeWork;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.obsqura.selenium.TestNGSample.Base;

public class BootstrapAlertSample extends Base {
	@Test
	public void checkAlertClose() {
		driver.navigate().to("https://selenium.obsqurazone.com/bootstrap-alert.php");
		WebElement autoClosableSuccess=driver.findElement(By.xpath("//button[@id='autoclosable-btn-success']"));
		WebElement normalSuccess=driver.findElement(By.xpath("//button[@id='normal-btn-success']"));
		autoClosableSuccess.click();
		normalSuccess.click();
		WebElement normalSuccessCloseButton=driver.findElement(By.xpath("//div[@class='alert alert-success alert-normal-success']//child::button[@type='button']"));
		normalSuccessCloseButton.click();
	}

}
