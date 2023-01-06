package homework;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSourceChecking {
	public WebDriver driver;
	String expectedPageSource,expTitle="Obsqura Testing";
	@Before
	public void driverLoading() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\anjuc\\eclipse-workspace\\JUnitSample\\src\\main\\java\\Resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	}
	@Test
	public void CheckPageSource() {
		expectedPageSource=driver.getPageSource();
		assertFalse(expectedPageSource.isEmpty()); 
	}
	@Test
	public void checkURL() {
		expTitle=driver.getTitle();
		assertTrue(expTitle.contains("Testing"));
	}
	@After
	public void browserClose() {
		driver.close();
	}
	
}


