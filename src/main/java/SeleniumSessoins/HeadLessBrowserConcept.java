
package SeleniumSessoins;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadLessBrowserConcept {

	public static void main(String[] args) {
		
		//headless -- no browser window
		//improves performance of the script
		//complex UI -> might not work
		
		// 1. Headless browser is used when we don't want to launch the browser still want to run the test cases
	     //2.	Browser window is not present in headless browser
		

		WebDriverManager.chromedriver().setup();

		ChromeOptions co = new ChromeOptions();
		co.setHeadless(true);
		co.addArguments("--headless");
		co.addArguments("--incognito");
		WebDriver driver = new ChromeDriver(co); 
		
//	WebDriverManager.firefoxdriver().setup();
//		FirefoxOptions fo = new FirefoxOptions();
//	fo.setHeadless(true);

		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

		//driver.quit();

	}
	}
