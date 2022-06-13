package SeleniumSessoins;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Webtable_CricBuzz {
static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//a[text()='Sunrisers Hyderabad']/parent::td/following-sibling::td
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-series/4061/indian-premier-league-2022/points-table");
		WebElement elelink = driver.findElement(By.xpath("//a[text()='Sunrisers Hyderabad']"));
		elelink.click();
		List<WebElement> ele_list = driver.findElements(By.xpath("//a[text()='Sunrisers Hyderabad']/parent::td/following-sibling::td"));
		List<String> str_list = new ArrayList<String>();
	for(WebElement e : ele_list) {
		String str = e.getText();
		str_list.add(str);
	}
		System.out.println(str_list);
		

	}

}
