package org;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.util.RetryAnalyzerCount;

public class RetryExample2
{
	
	@Test()
	public void test111()
	{
		System.out.println("test method111");
		Assert.assertEquals("test1", "test1");
	}

	@Test(retryAnalyzer = ListenersReporter.Retry.class)
	public void test222()
	{
		System.out.println("test method222");
		Assert.assertEquals("test2", "test3");
	}

}
