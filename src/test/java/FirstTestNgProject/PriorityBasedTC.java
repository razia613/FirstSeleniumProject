package FirstTestNgProject;

import org.testng.annotations.Test;

public class PriorityBasedTC {

	@Test(priority=1)
	public void aTest()
	{
		System.out.println("This is aTest");
	}
	@Test(priority=1)
	public void bTest()
	{
		System.out.println("This is bTest");
	}

	@Test
	public void cTest()
	{
		System.out.println("This is cTest");
	}

	@Test(priority=3)
	public void dTest()
	{
		System.out.println("This is dTest");
	}

	@Test(priority=0)
	public void eTest()
	{
		System.out.println("This is eTest");
	}
	@Test(enabled=false,priority=5)
	public void fTest()
	{
		System.out.println("This is fTest");
	}

}
