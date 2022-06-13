package SeleniumSessoins;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RelativeLocatorsNoon {
	static WebDriver driver = null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		 driver = new ChromeDriver();
		driver.get("https://www.noon.com/uae-en/");
		Actions act= new Actions(driver); 
		
		while(true) {
			
			WebElement eleimg= getElement("fashion/view-all-kids-clothing");	
			if(driver.findElements(By.xpath("//a[@href='/uae-en/fashion/view-all-kids-clothing/']//img")).size()>0)
			{
				
				act.moveToElement(eleimg).click().perform(); 
				//eleimg.click();
				System.out.println("img Nav Page Found");
				 break;
				
			}
			else
			{
				WebElement element_nav = driver.findElement(By.xpath("(//div[contains(@class,'custom-navigation')])[last()-1]"));
			  if( element_nav.getAttribute("class").contains("disabled"))
			  {
				  System.out.println("pgination is over....img is not found...");
				  break;
			  }
				element_nav.click();
			    Thread.sleep(1500);
			}
		}		

	}
	public static WebElement getElement(String itemName) {
		String xpath = "//a[@href='/uae-en/"+itemName+"/']//img";
		return driver.findElement(By.xpath(xpath));
	}
	}


