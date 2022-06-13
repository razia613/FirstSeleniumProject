package SeleniumSessoins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleTogether {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver = new ChromeDriver();
		
        driver.get("https://opensource-demo.orangehrmlive.com/");//parent window
        String parentWindowId = driver.getWindowHandle();//will give u parent window id

        driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
        driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
        driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
        driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
        
        
        Set<String> handles = driver.getWindowHandles();
        
		Iterator<String> it = handles.iterator();
		
		while(it.hasNext()) {
		String win_id = it.next();
		driver.switchTo().window(win_id);
		System.out.println(driver.getTitle());
		if(!win_id.equals(parentWindowId))
		{
		driver.close();
		}
	
		}
		System.out.println(driver.getTitle());
		}

        
        

	}


