package FirstTestNgProject;

import org.testng.annotations.Test;

public class InvocationConcept {

	@Test(invocationCount=10)//will be executed 10 times meas 10 users will be created 
	//Generally in selenium we dont use this concept
	public void createUserTest()
	{
		System.out.println("This is bTest");
	}
}
