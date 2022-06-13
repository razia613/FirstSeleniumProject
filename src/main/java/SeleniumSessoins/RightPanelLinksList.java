package SeleniumSessoins;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightPanelLinksList {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//TO GET ALL THE RIGHT PANEL LIST WE CAN ALSO WRITE A GENERIC METHOD AND SHIFT IT TI Eutil.Java CLASS
		
		List<WebElement> eleList =  driver.findElements(By.xpath("//aside[@id='column-right']//a"));
		
		List<String> eleTextList = new ArrayList<String>();


		// TO PRINT ALL ELEMENT TEXT WE CAN ALSO WRITE A METHOD AND SHIFT IT TO Eutil.Java CLASS BY PASSING By AS PARAMETER
		for(WebElement e:eleList) {
			eleTextList.add(e.getText());
        }

		System.out.println(eleTextList);
		
		//To GET ONE SINGLE ELEMENT 
//		By rightpanl_singleelement=By.xpath("//aside[@id='column-right']//a[contains(text(),'Register')]");
//		driver.findElement(rightpanl_singleelement).click();
	}
		public static void printAllElementsText(By locator) {
			List<WebElement> eleList =  driver.findElements(locator);
			
			List<String> eleTextList = new ArrayList<String>();
			for(WebElement e: eleList) {
				//eleTextList.add(e.getText());
				String ele_text =e.getText();
				System.out.println("===============" + ele_text + "===============");

				
			}

		}
		// GENERIC METHOD TO GET THE ELEMENT LIST SHIFT IT TO Eutil CLASS
		public static List<String> getElementsTextList(By locator) {
			List<String> eleTextList = new ArrayList<String>();
			List<WebElement> eleList = driver.findElements(locator);
			for (WebElement e : eleList) {
				String text = e.getText();
				eleTextList.add(text);
			}
			return eleTextList;

		}
		
		//GENERIC METHOD TO GET THE NO OF ELEMENTS IN THE BROWSER/RIGHTPANEL ETC
		public static int getElementsListCount(By locator) {
			return driver.findElements(locator).size();
		}


	}


