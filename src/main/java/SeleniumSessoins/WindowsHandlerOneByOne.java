package SeleniumSessoins;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowsHandlerOneByOne {
static WebDriver driver =null;
static String parentWindowId =null;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
					
        driver.get("https://opensource-demo.orangehrmlive.com/");//parent window
         parentWindowId = driver.getWindowHandle();//will give u parent window id
         driver.switchTo().window(parentWindowId);
         System.out.println(driver.getTitle());
       
        Thread.sleep(4000);
        driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
    
        doOpenOneByOneWindow();
   		Thread.sleep(4000);
   		
   		   		
        driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();        
        doOpenOneByOneWindow();
		Thread.sleep(4000);
		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());		
        
        driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
        doOpenOneByOneWindow();
      		Thread.sleep(4000);
      		driver.switchTo().window(parentWindowId);
      		System.out.println(driver.getTitle());
  }
	public static  void doOpenOneByOneWindow() 
	{

        Set<String> handles = driver.getWindowHandles();    
   		Iterator<String> it = handles.iterator();   		
   		while(it.hasNext()) {
   		String win_id = it.next();   		
   		if(!win_id.equals(parentWindowId))
   		{
   		driver.switchTo().window(win_id);
   		System.out.println(driver.getTitle());
   		driver.close();
   		}	
   		}
   		driver.switchTo().window(parentWindowId);
   		System.out.println(driver.getTitle());
   		    
   }

}
