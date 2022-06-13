package SeleniumSessoins;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public WebdriverBasics() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String title= driver.getTitle();
		System.out.println(title);
		//List<WebElement > listele= driver.findElements("a");
		//listele.parallelStream().filter(e->!e.getText().isEmpty()).forEach(e->System.out.println(e.getText()));
		//driver.quit();
		//driver.close();//difeerence b/w quit and close is slose maintains session id butclose will not maintain the session id
		//after quitting or closing the browser driverif we try to get the title it will throw no sich session exists exception
    	//System.out.println(driver.getTitle());
		
		//title validation can be done here
    	if(title=="Facebook – log in or sign up")
    	{
    		System.out.println("correct title");    	}
    	else {
    		System.out.println("wrong title");
    	}
    	driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
