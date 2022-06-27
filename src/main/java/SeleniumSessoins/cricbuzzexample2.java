package SeleniumSessoins;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class cricbuzzexample2 {
	static WebDriver driver =null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//   
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/46086/dc-vs-kkr-41st-match-indian-premier-league-2022");
		List<String> str_list = new ArrayList<String>();
		str_list = getBowlerInfo("mustafizur");
		
		System.out.println("bowlername :"+str_list);  
		System.out.println(str_list);
	}
public static List<String> getBowlerInfo(String bowlername)
{
	
	List<WebElement> ele_list =driver.findElements(By.xpath("//a[@href='/profiles/9863/"+bowlername+"']/parent::div/following-sibling::div"));
	List<String> str_list = new ArrayList<String>();
	for(WebElement e: ele_list) {
		str_list.add(e.getText());
		// System.out.println(bowlername+":"+str_list);
	}	
	return str_list;
}
}
