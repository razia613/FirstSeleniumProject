package FirstTestNgProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppLoginTest {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
	}

	// AAA Rule
	
	@Test
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title is : " + title);
		Assert.assertEquals(title, "Account Login");
	}
	
	@Test
	public void  urlTest() {
		String currenturl= driver.getCurrentUrl();
	Assert.assertTrue(currenturl.contains("route=account/login"));
	}

	@Test
	public void searchTest() {		
	Assert.assertTrue(driver.findElement(By.name("Saeach")).isDisplayed());
	}
	
	
	@AfterTest
	public void terDown()
	{
		driver.close();
		
	}
}
