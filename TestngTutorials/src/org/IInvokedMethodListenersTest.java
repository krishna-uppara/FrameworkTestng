package org;

import java.util.concurrent.ThreadLocalRandom;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ListenersReporter.InvokedMethodListenersClass;

@Listeners(InvokedMethodListenersClass.class)
public class IInvokedMethodListenersTest {
	@Test(priority=-1)
	public void test1()
	{

	Reporter.log( "Priority one TC   Test1",true);
	}


}
