package SeleniumSessoins;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTableHandle {
static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page");
		
		//For Single CheckBox---> CheckBox is Preceding sibling Of Joe.Root 
		//Syntax Is for preceding sibling ---> //a[text()='Joe.Root']/parent::td/preceding-sibling::td/input
		//WRITE A GENERIC METHOD FOR THIS
		doSelectUser("Joe.Root");
		doSelectUser("Jasmine.Morgan");
		
		
//WRITE GENERIC METHOD TO BELOW CODE WHICH IS USED TO GET THE FOLLOWING SIBLINKS OF JOE.ROOT

		getUserData("Joe.Root");
		getUserData("Jasmine.Morgan");

	}
	public  static void doSelectUser(String usename)
	{
		String xpath = "//a(text()="+usename+"/parent::td/preceding-sibling::td/input";
		driver.findElement(By.xpath(xpath)).click();//Click operation is used to select the checkbox
				
	}
	public static List<String> getUserData(String name) {
		System.out.println("user name is : " + name);
		List<WebElement> colEle = 
					driver.findElements(By.xpath("//a[text()='"+name+"']/parent::td/following-sibling::td"));
		List<String> colList = new ArrayList<String>();
		for(WebElement e  : colEle) {
			String text = e.getText();
			colList.add(text);
		}
		return colList;
	}

	

}
