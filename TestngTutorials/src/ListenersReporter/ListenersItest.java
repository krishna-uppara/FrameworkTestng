package ListenersReporter;


/*
 * <?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite">
<listeners>
<listener class-name="ListenersReporter.ListenersItest"></listener>
</listeners>
  <test name="Test">
    <classes>
      <class name="org.TestngAttributes"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->
 */

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersItest implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result)
	{
		System.out.println("test Started method started its name is ::"+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("test Success method passed its name is ::"+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result)
	{
		System.out.println("test Failure method Failed its name is ::"+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("testSkipped method Skipped its name is ::"+result.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
	  //dont know
		
	}

	@Override
	public void onStart(ITestContext context)
	{
		System.out.println("Test Name of the Suite is started its name is ::"+context.getName());
		
	}

	@Override
	public void onFinish(ITestContext context)
	{
		System.out.println("Test Name of the Suite is finished its name is ::"+context.getName());
		
	}

}
