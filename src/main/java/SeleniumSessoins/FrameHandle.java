package SeleniumSessoins;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		 WebDriver driver= new ChromeDriver();
	//	ElementUtil eutil=new ElementUtil(driver);
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		//driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"frame-one748593425\"]")));
		//List<WebElement> ele_list= driver.findElements(By.xpath("//div[@class='fs-squares-section container']//div[@class='fs-squares-section__link-wrapper']"));
		driver.findElement(By.xpath("//div[@id='imageTemplateContainer']/img")).click();
		driver.switchTo().frame("frame-one748593425");
    	driver.findElement(By.id("RESULT_TextField-2")).sendKeys("razia");
    	driver.findElement(By.id("RESULT_TextField-3")).sendKeys("razia");
	driver.findElement(By.id("RESULT_TextField-4")).sendKeys("razia");
	driver.findElement(By.id("RESULT_TextField-5")).sendKeys("razia");
	driver.findElement(By.id("RESULT_TextField-6")).sendKeys("razia");
	driver.findElement(By.id("RESULT_TextField-7")).sendKeys("1235");
	driver.findElement(By.id("RESULT_TextField-8")).sendKeys("razia");
	driver.findElement(By.id("RESULT_TextField-9")).sendKeys("razia");
	driver.findElement(By.id("RESULT_TextField-9")).sendKeys("Bangalore");
	driver.findElement(By.id("RESULT_TextField-9")).sendKeys("razia");
		Select contry= new Select(driver.findElement(By.id("RESULT_RadioButton-12")));
        contry.selectByIndex(4);
		//driver.switchTo().defaultContent();
		driver.findElement(By.id("FSsubmit")).click();
		driver.switchTo().defaultContent();
		//Element ele =driver.findElement(()
   
	}
//	public static void selectValueFromDropDown(By locator,String value) 
//	{
//		List<WebElement> countryOptions = driver.findElements(locator);
//		System.out.println(countryOptions.size());
//		for (int i = 0; i < countryOptions.size(); i++) {
//			String text = countryOptions.get(i).getText();
//			System.out.println("============" + text + "============");
//			if (text.contains(value)) {
//				countryOptions.get(i).click();
//				break;
//			}
//
//	}

}
