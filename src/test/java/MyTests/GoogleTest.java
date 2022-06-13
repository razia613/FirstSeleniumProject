package MyTests;

import org.testng.Assert;

public class GoogleTest extends BaseTest {
	public void googleTitkeTest()
	{Assert.assertEquals(driver.getTitle(),"Google");
		
	}
	public void googleurlTest()
	{
		Assert.assertTrue(driver.getCurrentUrl().contains("google.com"));
	}

}
