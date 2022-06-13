package MyTests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginOageNegativeTest extends BaseTest {
	@Test(priority = 1)
	public void test() {
		driver.get("https://demo.opencart.com/index.php?route=account/login");

//String title = driver.getTitle();
//Assert.assertEquals(title, "Account Title");
		driver.findElement(By.id("input-email")).sendKeys("test");
		driver.findElement(By.id("input-password")).sendKeys("test222");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String errorMsg = driver.findElement(By.cssSelector("div.alert.alert-danger")).getText();
		System.out.println(errorMsg);
		Assert.assertTrue(errorMsg.contains(" No match for E-Mail and/or Password."));
	}
	@DataProvider
	public Object[][] getLoginData()
	{
	
		return new Object[][] {
			{"test@123","test111"},
			{"naveenanimation20","test@12121212"},
			{"test@.@.@1223","11122"},
			{"  ","   "},
			{"!@!@!@","111"}
			
		};
	}
}
