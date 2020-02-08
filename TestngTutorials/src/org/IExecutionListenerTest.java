package org;

import java.util.concurrent.ThreadLocalRandom;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ListenersReporter.IExecutionListerClass;
@Listeners(IExecutionListerClass.class)
public class IExecutionListenerTest {
	@Test(priority=-1)
	public void test1()
	{

        int rand_int1 = ThreadLocalRandom.current().nextInt(); 
        System.out.println(rand_int1);
	Reporter.log( "Priority one TC   Test1",true);
	}


}
