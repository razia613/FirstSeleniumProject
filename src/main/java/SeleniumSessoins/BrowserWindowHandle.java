package SeleniumSessoins;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserWindowHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");//parent window
        driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();

        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parentWindowId = it.next();
        System.out.println("Parent window id : " + parentWindowId);

        String childWindowId = it.next();
        System.out.println("Parent window id : " + childWindowId);
        
        driver.switchTo().window(childWindowId);
        System.out.println("child window title is : " + driver.getTitle());
        driver.close();
        
        driver.switchTo().window(parentWindowId);
        System.out.println("child window title is : " + driver.getTitle());
        driver.close();
        
	
	}

}
