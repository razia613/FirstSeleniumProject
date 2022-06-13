package SeleniumSessoins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class PaginationWebTable {

static WebDriver driver=null;
	
	public static void main(String[] args) throws InterruptedException {
	
		WebDriverManager.chromedriver().setup();		
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		while(true) {
		if(driver.findElements(By.xpath("//td[text()='Fort Mill']")).size()>0)
		{
			selectCity("Fort Mill");
		 	break;
		}
		else
		{
			// pagination logic:
			WebElement next = driver.findElement(By.id("tablepress-3_next"));
			if(next.getAttribute("class").contains("disabled"))
			{
				System.out.println("pgination is over....city is not found...");
				break;
			}
			next.click();
			Thread.sleep(1000);
			
		}
        
	}
		
	}
	public static void selectCity(String city)
	{
		String xpath= "//td[text()='"+city+"']//preceding-sibling::td/child::input[@type='checkbox']";
		driver.findElement(By.xpath(xpath)).click();
		
	}
	public static void selectCityWithRelativeLoctors(String city)
	{
		String xpath="//td[text()='Fort Mill']";
		WebElement cityRelLoc = driver.findElement(By.xpath(xpath));
		driver.findElement(with(By.xpath("//input[@type='ckeckbox'")).toLeftOf(cityRelLoc)).click();
		
		
	}
}
