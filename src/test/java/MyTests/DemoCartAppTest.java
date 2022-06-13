package MyTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoCartAppTest extends BaseTest {

	@Test
	public void titleTest() {
		String title = driver.getTitle();
		System.out.println("page title is : " + title);
		Assert.assertEquals(title, "Account Login");
	}
	
	@Test
	public void  urlTest() {
		String currenturl= driver.getCurrentUrl();
	Assert.assertTrue(currenturl.contains("route=account/login"));
	}

	@Test
	public void searchTest() {		
	Assert.assertTrue(driver.findElement(By.name("Saeach")).isDisplayed());
	}}