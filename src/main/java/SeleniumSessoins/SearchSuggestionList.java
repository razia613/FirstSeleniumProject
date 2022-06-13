package SeleniumSessoins;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchSuggestionList {
	static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://automationpractice.com/index.php");

		// First we need to enter the text which we need to search so just send the txt
		// from selenium code to that search box
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");

		Thread.sleep(10000);
		// The below code can be written in different way as well there we can directly
		// access the list element directly without for loop
		List<WebElement> suggList = driver
				.findElements(By.xpath("//div[@class='ac_results']//ul//li[@class='ac_even']"));

		for (WebElement e : suggList) {
			System.out.println("=========   +  ==========" + e.getText());
			if (e.getText().contains("Summer Dresses > Printed Summer ")) {
				e.click();
				break;
			}

			// OR there is one method called contains which accepts the text as parameter.
			// (contains[text(),'string which is is written in the listbox element')]

			driver.findElement(By.xpath("//div[@class='ac_results']//li[contains(text(),'Casual Dresses > Printed')]"))
					.click();
			// If we take find elements method we just need to iterate the loop and we can
			// display the text or etc what ever we want

		}
	}
}
