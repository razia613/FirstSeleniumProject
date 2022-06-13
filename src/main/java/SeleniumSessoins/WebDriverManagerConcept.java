package SeleniumSessoins;

import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class WebDriverManagerConcept {

	public WebDriverManagerConcept() {

	}
	// TODO Auto-generated constructor stub

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WDM -- webdriver manager introduced by bonigarcia
		// Instead of using set property method we can use wdm to update the browser
		// versions automatically
		// System.setProperty("webdriver.chrome.driver",
		// "/Users/naveenautomationlabs/Downloads/chromedriver");
		WebDriverManager.chromedriver().setup();// it will automatically check the browser version
		WebDriver dr = new ChromeDriver();// launch chrome

		dr.get("http://www.google.com");// launch url
		String title = dr.getTitle();
		System.out.println(title);
		if (title.equals("Google")) {
			System.out.println("Correct title");
		} else {
			System.out.println("InCorrect title");
		}
		// dr.close();

		// Automation Steps (Selenium) + validation/checkpoint (Java/TestNG-Assertions)
		// ==> Automation Testing
		String url = dr.getCurrentUrl();
		System.out.println(url);
		dr.close();

		// For chrome dBrowser
		WebDriverManager.firefoxdriver().setup();
		WebDriver drf = new FirefoxDriver();
		drf.get("http://www.google.com");
		System.out.println(drf.getTitle());
		drf.close();
		/**
		 * Code to launch safari driver //WebDriverManager.safaridriver().setup();
		 * WebDriver drs =new SafariDriver(); drs.get("http://google.com"); String
		 * title_s=drs.getTitle(); System.out.println(title_s);
		 **/
		
		// code to launch edge driver
		WebDriverManager.edgedriver().setup();
		WebDriver dr_e=new EdgeDriver();
		dr_e.get("http://www.google.com");
		System.out.println(dr_e.getTitle());
	}
}
