package FirstTestNgProject;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsConcept {
	
	WebDriver driver ;
	@Test
	public void homePageTest() {
		
		System.out.println("HomePagetest Is passed");	
		int i = 9/0;
	}
	
	@Test(dependsOnMethods = "homePageTest")
	//which is not preferable abd we wont use this because one method should wait until the above method is executed
//if we r executind on docer machine (multiplemachines) one method should wait untill the other method executed so other machines should wait until that method is executed.
	public void searchTest() {
		
		System.out.println("Search Is passed");		
	}
	
	@Test(dependsOnMethods = "homePageTest")
	public void addtoCartTest() {
		
		System.out.println("AddToCart Is passed");		
	}
}
