import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DriverLoadingEdge {
	public WebDriver driverB;
	
	public void loadEdge() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\anjuc\\eclipse-workspace\\HomeWork\\src\\main\\java\\driverpath\\msedgedriver.exe");
		driverB=new EdgeDriver();
		driverB.get("https://qacef2r.somnoware.com/login");
		driverB.manage().window().fullscreen();
		driverB.manage().window().maximize();
		System.out.println(driverB.getCurrentUrl());
		//System.out.println(driverB.getPageSource());
		System.out.println(driverB.getTitle());
		driverB.close();
	}

	public static void main(String[] args) {
		DriverLoadingEdge obj=new DriverLoadingEdge();
		obj.loadEdge();

	}

}
