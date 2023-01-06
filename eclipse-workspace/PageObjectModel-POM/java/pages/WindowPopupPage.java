package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WindowPopupPage {
	public WebDriver driver;
	By likeUsOnFacebook=By.xpath("//a[@class='btn btn-primary windowSingle']");
	By followAll=By.xpath("//a[@id='windowMulti']");
	
	public WindowPopupPage(WebDriver driver) {
		this.driver=driver;
	}
	public void windowHandleMethod() {
		
	}
	
	

}
