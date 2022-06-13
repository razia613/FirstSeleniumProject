package FirstTestNgProject;

import org.testng.annotations.Test;

public class ExpectedExceptionConcept {	
	String name = "naveen";
	
	@Test(priority=1,expectedExceptions = {ArithmeticException.class,NullPointerException.class})
	public void searchProdyctTest()
	{
		System.out.println("This my MacBook");
		int i = 9/0;
		ExpectedExceptionConcept obj = new ExpectedExceptionConcept();
		obj= null;
		System.out.println(obj.name);
	}
	
	@Test(expectedExceptions = Exception.class)//which is not preferable and will handle all the exceptions
	public void testingTest()
	{
		
	}
	
	
	
	
	
	
	

}
