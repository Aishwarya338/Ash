package Demo.testng.annotations.Test;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 
{
	/*
	@Test(invocationCount = 2)//default priority = 0
	public void tc()
	{
		Reporter.log("Hey...!",true);
	}
	@Test(priority = 1)
	public void tc_1()
	{
		Reporter.log("Hey1...!",true);
	}
	@Test(enabled=false)
	public void tc_2()
	{
		Reporter.log("Hey2...!",true);
	}
	@Test(priority = -2)
	public void tc_3()
	{
		Reporter.log("Hey3...!",true);
	}
	*/
	@Test(dependsOnMethods = {"tc_2","tc_3"})
	public void tc()
	{
		Reporter.log("Hey...!",true);
	}
	@Test(dependsOnMethods ="tc_3")
	public void tc_2()
	{
		Reporter.log("Hey2...!",true);
	}
	@Test()
	public void tc_3()
	{
		Reporter.log("Hey3...!",true);
	}
	
}
