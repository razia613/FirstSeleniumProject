package SeleniumSessoins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ReletiveLoctorsExample1 {

	static WebDriver driver =null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.aqi.in/dashboard/canada");
		WebElement ele = driver.findElement(By.linkText("Yorkton, Canada"));
		
		//right of (ele) --> tagname(p)
		System.out.println(driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText());
		System.out.println(driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText());
		System.out.println(driver.findElement(with(By.tagName("p")).above(ele)).getText());
		System.out.println(driver.findElement((with(By.tagName("p")).below(ele))).getText());
		System.out.println(driver.findElement(with(By.tagName("p")).near(ele)).getText());
		//td[text()='GOOD']
		WebElement element = driver.findElement(By.xpath("//td[text()='GOOD']"))  ;  
		System.out.println(driver.findElement(with(By.tagName("td")).toLeftOf(element)).getText());
		System.out.println(driver.findElement(with(By.tagName("td")).toRightOf(element)).getText());
	
	}

}
