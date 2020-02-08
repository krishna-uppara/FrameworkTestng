package org;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners({ListenersReporter.ListenersItest.class,ListenersReporter.Ireporterclass.class})
public class RetryExample
{
	
	@Test()
	public void test1()
	{
		System.out.println("test method1");
		Assert.assertEquals("test1", "test1");
	}

	@Test()
	public void test2()
	{
		System.out.println("test method2");
		Assert.assertEquals("test2", "test3");
	}

}
