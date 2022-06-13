package FirstTestNgProject;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgAnnotations {

	@BeforeSuite
	public void connectWithDB() {
		System.out.println("System Connected withDB");
	}
	
	@BeforeTest
	public void createUser() {
		System.out.println("Open LoginPage");
	}
	
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Open LoginPage");
	}

	@BeforeMethod
	public void loginToApp() {
		System.out.println("Open LoginPage");
	}

	@Test
	public void homePageTitleTest() {
		System.out.println("hp - title test");
	}

	@Test
	public void homePageUrlTest() {
		System.out.println("hp - url test");
	}

	@Test
	public void isUserLoggedInTest() {
		System.out.println("user logged in test");
	}

	@AfterMethod
	public void logout() {
		System.out.println("AM - user is logged out");	
	}
	
	@AfterClass
	public void closePage() {
		System.out.println("close LoginPage");
	}
	
	@AfterTest
	public void deleteUser() {
		System.out.println("AT - delete user");
	}	
	@AfterSuite
	public void closeDbCinnections() {
		System.out.println("close All the Coneections");
	}
}
