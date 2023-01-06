import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SomnoappDriverFunctions {

	public static WebDriver driverA;
	public static void SetHomepage() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\anjuc\\eclipse-workspace\\HomeWork\\src\\main\\java\\com\\obsqura\\selenium\\HomeWork\\ChromeDriver\\chromedriver.exe");
		driverA=new ChromeDriver();
		driverA.get("https://qacef2r.somnoware.com/login");
		System.out.println(driverA.getTitle());
		driverA.manage().window().maximize();
		System.out.println(driverA.getCurrentUrl());
		System.out.println(driverA.toString());
	}
	public static void main(String[] args) {
		SomnoappDriverFunctions.SetHomepage();
	}

}
