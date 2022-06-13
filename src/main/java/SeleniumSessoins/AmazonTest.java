package SeleniumSessoins;

import java.net.MalformedURLException;
import java.net.URL;

public class AmazonTest {

	

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		BrowserUtil bru =new BrowserUtil();
		bru.init_driver("chrome");
		
		//bru.nvaigateUrl("https://www.amazon.com");
		//brUtil.navigateUrl("https://www.amazon.com");
		bru.navigateUrl(new URL("https://www.amazon.com"));

		String actualTitle =bru.getPageTitle();
		System.out.println("title is : " + actualTitle);
		
		if(actualTitle.contains("Amazon")) {
			System.out.println("title is correct title");
		}
		else {
			System.out.println("title is incorrect title ");
		}

		System.out.println(bru.getPageSource().contains("Actionable Analytics"));

		System.out.println(bru.getPageUrl().contains("https://www.amazon.com/"));
		bru.closeBrowser();

	}

}
