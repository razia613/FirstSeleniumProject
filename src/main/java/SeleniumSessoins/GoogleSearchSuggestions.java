package SeleniumSessoins;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchSuggestions {
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
//First we need to enter the text which we need to search so just send the txt from selenium code to that search box
		driver.findElement(By.name("q")).sendKeys("Naveen Automation Labs");

//wait for 10 seconds to load the search suggestions
		Thread.sleep(10000);

		List<WebElement> suggList = driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']/span"));
//List<WebElement> suggList = 
//driver.findElements(By.xpath("//ul[@role='listbox']/li//div[@class='wM6W7d']/span"));

		for (WebElement e : suggList) {
			System.out.println("=========   +  ==========" + e.getText());
			if (e.getText().contains("naveen automationlabs java")) {
				e.click();
				break;
			}

		}
		driver.close();
	}
}
