package SeleniumSessoins;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil implements Util {
	public WebDriver driver;

	// TODO Auto-generated constructor stub
//		WebDriverManager.chromedriver().setup();
//		
//		WebDriver driver=new ChromeDriver();

	public WebDriver init_driver(String browsername)
	{
		// cross browser logic
		if (browsername.equalsIgnoreCase(CHROME_BROWSER)) {
			WebDriverManager.chromedriver().setup();
			driver= new ChromeDriver();

		} else if (browsername.equalsIgnoreCase(FIREFOX_BROWSER)) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			

		} else if (browsername.equalsIgnoreCase(SAFARI_BROWSER)) {
			//WebDriverManager.safaridriver().setup();
			driver = new SafariDriver();

		} else {
			System.out.println("Please pass the right browser name : " + browsername);
		}
		
		return driver;
	}

	

	@Override
	public void navigateUrl(URL url) {
		driver.navigate().to(url);
	}

	@Override
	public void nvaigateUrl(String url) {
		if (url == null || url.isEmpty()) {
			return;
		}

		else if (url.indexOf("http") == -1 || url.indexOf("https") == -1) {
			System.out.println("please pass the right url, http(s) is missing....");

			return;
		}
		driver.get(url);
	}

	@Override
	public String getPageUrl() {
		return driver.getCurrentUrl();
	}

	@Override
	public String getPageTitle() {
		return driver.getTitle();
	}

	@Override
	public String getPageSource() {
		return driver.getPageSource();
	}

	@Override
	public void closeBrowser() {
		driver.close();
	}

	@Override
	public void quitBrowser() {
		driver.quit();
	}

}
