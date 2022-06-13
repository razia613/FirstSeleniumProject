package SeleniumSessoins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept_part2 {
static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		// 1. id: unique Attr : can not be duplicate -- I
		// 2. name: can be duplicate (attr) -- II
//				driver.findElement(By.name("email")).sendKeys("test@gmail.com");
//				driver.findElement(By.name("password")).sendKeys("test@123");
	
		By email = By.name("email");
		By pwd = By.name("password");

		ElementUtil eutil =new ElementUtil();
		eutil.doSendKeys(email,"razia@gmail.com");
		eutil.doSendKeys(pwd, "test@123");
		
		//3. classname
		
		// 3. class name: it can be duplicate (attr) for th multiple elements --- III
				// form-control input-lg
				// form-control
				// form-control
		driver.findElement(By.className("form-control")).sendKeys("razia@gmail.com");
		driver.findElement(By.className("form-control")).sendKeys("text@123");
		
		//4. xpath is locator (address of the element in DOM) -- but its not an
		// attribute
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		//5.By emailId = By.xpath("//*[@id=\"input-email\"]");
		By password = By.xpath("//*[@id=\"input-password\"]");
		By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		By errorMesg = By.className("alert-danger");
		doSendKeys(password, "razia@123");
		doClick(loginBtn);
		String actErrorMesg = doGetElementText(errorMesg);
		//System.out.println(actErrorMesg);
		if(actErrorMesg.contains("Warning")) {
			System.out.println("correct error mesg");
		}
		else {
			System.out.println("incorrect error mesg");
		}
		
		
		// 6.cssselector :
driver.findElement(By.cssSelector("#input-email")).sendKeys("razia@gmail.com");
driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();//we can write a generic method for click event

//7. linkText: is only for links
//Register
//Register
driver.findElement(By.linkText("Register")).click();
By registerLink = By.linkText("Register");
By loginLink = By.linkText("Login");
doClick(registerLink);
doClick(loginLink);

//8. partial link text is only for links
// Forgotten password
// Forgotten username
String header = driver.findElement(By.tagName("h1")).getText();
System.out.println(header);

	}
	//we can shift these methods to ElementUtil class and can use those in other class it will work for all the  of locators in general
	public static String doGetElementText(By  locator) {
	return getElement(locator).getText();
	}
	
	
	public static void doClick(By locator)
	{
		getElement(locator).click();
		
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

}

