package ListenersReporter;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.ISuite;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.ITestAnnotation;

public class Retry implements IRetryAnalyzer
{
	private int minCount = 1, maxCount = 3;

	@Override
	public boolean retry(ITestResult result)
	{

		if(result.getStatus()==ITestResult.FAILURE && minCount<=maxCount)
		{
			try
			{
				
				Thread.sleep(2000);
				System.out.println("Test name"+ result.getTestClass()+" "+"Retry failed test method name "+result.getName()+" "+minCount);
				minCount++;
				return true;
				
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return false;
	}

}
