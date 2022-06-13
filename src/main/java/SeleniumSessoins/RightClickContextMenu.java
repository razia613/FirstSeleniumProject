package SeleniumSessoins;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClickContextMenu {

	public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
	WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
	
	Actions action = new Actions(driver);
	action.contextClick(ele).build().perform();
	
	List<WebElement> ele_list = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']/li[contains(@class,'context-menu-icon')]"));
    for(WebElement e : ele_list)
    {
    	String text = e.getText();
//    	switch(text)
//    	{
//    	case "Copy":
//    		e.click();
//    		//Here Js alert is geeting opened we have to handle the alert by alert class 
//    		Alert alrt1 = driver.switchTo().alert();
//    		alrt1.accept();
//    		break;
//    	case "Edit":
//    		e.click();
//    		//Here Js alert is geeting opened we have to handle the alert by alert class 
//    		Alert alrt2 = driver.switchTo().alert();
//    		alrt2.accept();
//    		break;
//    	case "Cut":
//    		e.click();
//    		//Here Js alert is geeting opened we have to handle the alert by alert class 
//    		Alert alrt3 = driver.switchTo().alert();
//    		alrt3.accept();
//    		break;
//    	}
//    		
	if(text.equals("Copy")) {
		e.click();
		//Here Js alert is geeting opened we have to handle the alert by alert class 
		Alert alrt = driver.switchTo().alert();
		alrt.accept();
		break;																					
	}
	
	//Alert alrt = new Alert()

    }
		
	}
	
}
