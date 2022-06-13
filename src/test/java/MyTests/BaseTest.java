package MyTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseTest {
	WebDriver driver;

	@BeforeTest
	@Parameters({ "browser", "url", "headless" })
	public void setUp(String browserName,String appUrl,String headLess) {
		WebDriverManager.chromedriver().setup();
		System.out.println("browser name is : " + browserName);

		if (browserName.equalsIgnoreCase("chrome")) {
		ChromeOptions co =new ChromeOptions();
		if(Boolean.parseBoolean(headLess)) {
			co.setHeadless(true);
		}
		//driver = new ChromeDriver(co);
		else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();

		}
		else {
			System.out.println("please pass the right browser..." + browserName);
		}
		driver.get(appUrl);
		//
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
	}
	}
public void tearDown() {
driver.close();}
}
