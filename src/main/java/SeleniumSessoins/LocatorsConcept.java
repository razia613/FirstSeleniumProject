package SeleniumSessoins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {
	
	//Declare static webdriver 
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Plese remember this formulae
		//create web element(using By locators) + actions (click, send keys, get text,
				// isDisplayed)
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//Initial way of creating web element
		 driver.findElement(By.id("input-email")).sendKeys("Razia@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("test@123");
		
		//Type 2-> create object for web element and use it anywhere u need it
		WebElement email= driver.findElement(By.id("input-email"));
		
		WebElement pwd= driver.findElement(By.id("input-password"));
		email.sendKeys("Razia@gmail.com");
		pwd.sendKeys("test@123");
		
		//Type -->3 Create object for BY loctor and use it
		
		
	By emailid=By.id("input-email");
	By passwrd=By.id("input-password");
	
	WebElement  email_ele =driver.findElement(emailid);
	WebElement pwd_ele=driver.findElement(passwrd);
	email_ele.sendKeys("input-email");
	pwd_ele.sendKeys("input-password");
	
	//type->4 we can write a generic method to get element locator instead of creating every time
	
	
	
	By emailid_4=By.id("input-email");
	By passwrd_4=By.id("input-password");
	getElement(emailid);
	getElement(passwrd_4);
	
	//Type-->5 getElement method+Action(sendkeys)method for this we just need to add amethod to perform action
	
	 
	By emailid_5=By.id("input-email");
	By passwrd_5=By.id("input-password");
	
	doSendKeys(emailid_5, "razia@123");
	doSendKeys(passwrd_5, "123@test");
	
	//Type->6 create a geniric method for BY locator
	By emailId_6= By.id("input-email");
	By password_6= By.id("input-password");
	
	//By locator OR with generic methods in ElementUtil class
//	By emailId_6 = By.id("input-email");
//	By emailId_6 = By.id("input-password");
//	
//	ElementUtil eleUtil = new ElementUtil(driver);
//	eleUtil.doSendKeys(emailId, "naveen@gmail.com");
//	eleUtil.doSendKeys(password, "test@123");
	
	//Type->7  String locator OR with generic methods in ElementUtil class
	
	String ele_locator = "input-email";
	String password_id = "input-password";
	
doSendKeys(getBYlocator("id", ele_locator),"Razia@gmail.com");
doSendKeys(getBYlocator("id", password_id),"123@test");
	}
	
	//we have shifted these methods to ElementUtil class which will work for all type of elements and all the locators
	//ElementsUtil class have generic methods
	public static By getBYlocator(String locatorType, String locatorValue) {
		By locator =null;
				switch (locatorType.toLowerCase()) {
				case "id":
				locator=By.id(locatorValue);
				break;
				default:
					System.out.println("please pass the right locator....");
					break;}
		return locator;
				
		
	}
	
	public static WebElement getElement (By locator)
	{
		
	return driver.findElement(locator);	
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);

}
}
