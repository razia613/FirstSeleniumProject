package SeleniumSessoins;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlerWithList {
 //static WebDriver driver=null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");//parent window
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();

		Set<String> handles = driver.getWindowHandles();
		Thread.sleep(3000);
		//set to list:
		List<String> winList = new ArrayList<String>(handles);
		String parentWinId = winList.get(0);
		String childWinId = winList.get(1);
		
		driver.switchTo().window(childWinId);
		System.out.println(driver.getTitle());
		driver.close();//close the child window
		Thread.sleep(3000);
		
		
		driver.switchTo().window(parentWinId);
		System.out.println(driver.getTitle());
		driver.close();//close the parent window



	}

}
