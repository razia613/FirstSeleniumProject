package SeleniumSessoins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectClassmethods {
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// drop down -- html tag --> <select> --> <option>
		// Select class
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By locator = By.id("Form_submitForm_Country");
		//By state = By.id("Form_submitForm_State");

		Select sel_option = new Select(driver.findElement(locator));
		sel_option.selectByIndex(0);
		Thread.sleep(4000);
		
		sel_option.selectByValue("Algeria");
		Thread.sleep(4000);
		
		sel_option.selectByVisibleText("India");
		Thread.sleep(4000);
		
//		select.deselectAll();
//		there is a method to deselect the dropdown elements
//		select.deselectByVisibleText(text);		
//      System.out.println(select.isMultiple());		
//      select.getAllSelectedOptions();
		

	}

}
