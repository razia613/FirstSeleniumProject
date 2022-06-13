package SeleniumSessoins;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FooterLinks {
static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
driver =new ChromeDriver();
Thread.sleep(30000);
driver.get("https://www.freshworks.com/ae/");
By locator = By.xpath("//footer//ul[@class='footer-nav']//a");

//cliclOnElementFromSelection(locator, "Customer");method  can be used to click on  any footer item
//cliclOnElementFromSelection(locator,"Products");
//cliclOnElementFromSelection(locator,"Affiliates");
cliclOnElementFromSelection(locator,"Investors");

driver.close();
	}
//	public static void clickOnElementFromSection(By locator, String value) {
//		List<WebElement> eleList = driver.findElements(locator);
//
//		System.out.println(eleList.size());
//
//		for (WebElement e : eleList) {
//			String text = e.getText();
//			System.out.println("=================" + text + "==================");
//			if (text.equals(value)) {
//				e.click();
//				break;
//			}
	public static void cliclOnElementFromSelection(By locator,String value) {
		List<WebElement> eleList= driver.findElements(locator);
		System.out.println(eleList.size());
		for(WebElement e:eleList) {
			String text = e.getText();
			System.out.println("=================" + text + "==================");
			if(text.equals(text)) {
				e.click();
				break;
			}
			
		}
	}

	

}
