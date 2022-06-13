package SeleniumSessoins;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SVGelement {
	static WebDriver driver =null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
//   
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map#/");
		List<WebElement> elementlist =driver.findElements(By.xpath("//*[local-name()='svg' and @id ='map-svg']//*[name()='g' and @class = 'state']"));
		if(elementlist.size()>0) {
			Actions act= new Actions(driver);
		for(WebElement e: elementlist)
	    {
			String text = e.getAttribute("id");
			System.out.println(text);
			
			act.moveToElement(e).build().perform();
			Thread.sleep(100);
			if(text.equals("kansas") )
			{
			System.out.println(e.getText());
			act.click(e).perform();
				break;
			}
			
		}
		}
		}
		
		
	}


