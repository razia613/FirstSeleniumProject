package SeleniumSessoins;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BigBasketContextMenuExample {

	static WebDriver driver =null;
	static Actions actions;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		WebElement ele = driver.findElement(By.cssSelector("a.meganav-shop"));
		actions = new Actions(driver);
		actions.moveToElement(ele).perform();
			
		//List<WebElement> ele_list =  driver.findElements(By.xpath("//ul[@id='navBarMegaNav']/li"));
		List<WebElement> ele_list =  driver.findElements(By.xpath("//ul[@id='navBarMegaNav']//a"));
    	System.out.println(ele_list.size());
        for(WebElement e: ele_list) 
        {
        	actions.moveToElement(e).perform();

        	List<WebElement> ele_list_level2 =  driver.findElements(By.xpath("(//ul[contains(@class,'nav-stacked')])[last()]//a"));
        
        	for(WebElement e1:ele_list_level2) {
        	actions.moveToElement(e1).perform();
        	String strlevel2 = e1.getText();
        	System.out.println(strlevel2);
        	List<WebElement> ele_list_level3 =  driver.findElements(By.xpath("(//div[@class='box'])[last()-1]//a"));
        	
        	for(WebElement e2:ele_list_level3) {
        		actions.moveToElement(e2).perform();
            	String strlevel3 = e2.getText();
            	System.out.println(strlevel3);
        	}
        	
        	
        	
        		
        	}
        }

	}
		public static void getBigBasketMenuItem(String item)
	{
			WebElement elesubmenu12 =driver.findElement(By.linkText(item));
			actions.moveToElement(elesubmenu12).perform();    
	}
}