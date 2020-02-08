package org;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestngAttributes
{
//	description,timeout,priority,alwaysrun,enable,invocation count,invocation timeout,expected exception
		
	/**
	 * Priority Example 
	 *  
	 */
	    @Test(priority=-1)
		public void test1()
		{
		Reporter.log( "Priority one TC   Test1",true);
		}

		/**
		 * Description Example 
		 *  
		 */
	    
	    @Test(description="kd;lfkd;s")
		public void test2()
		{
		Reporter.log("Test Description Test2",true);	
		}
		
	    
		/**
		 * always Run Example 
		 *  
		 */
	    
	    @Test(alwaysRun=true)
		public void test3()
		{
			Reporter.log("AlwaysRun Test3",true);	
		}
		
		/**
		 * Enable true Example 
		 *  
		 */
	    
	    @Test(enabled=true)
		public void test4()
		{
			Reporter.log("enabled=true Test4 ",true);	
		}
		
	    /**
		 * Enable false Example 
		 *  
		 */
	    
	    @Test(enabled=false)
		public void test41()
		{
			Reporter.log("enabled=false Test41 ",true);	
		}
		
	    /**
		 * Invocation Count Example 
		 *  
		 */
	    
		@Test(invocationCount=2)
		public void test5()
		{
			Reporter.log("Invocating 2 times Test5 ",true);	
		}
		
		/**
		 * InvocationTimeout Example 
		 *  
		 */
		
		@Test(invocationTimeOut=2000)
		public void test6()
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			Reporter.log("TimeOut=1ms->it may or may not occur  Test6",true);	
		}
		
		/**
		 *  Excepted Exception Example 
		 *  
		 */
		
		@Test(expectedExceptions=ArithmeticException.class)
		public void test7()
		{
			int a=0,b=10,c=0;
			Reporter.log("expectedException BEFORE ArithmeticException Test7 ",true);	
			c=b/a;
			Reporter.log("expectedException after ArithmeticException Test7 ",true);	
		}
		
		/**
		 * Method level Timeout Example 
		 * Test method has to complete its execution within time period
		 * Suite Level Timeout Example
		 * <Suite name ="Suite" time-out="4000">
		 * It applies to all the Test Method and all the test methods has to executes within the 4 seconds
		 * </Suite> 
		 *  
		 */
		
		@Test(timeOut = 2000)
		public void test8()
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			Reporter.log( "Failing it as tutor mentioned Test8 ");
		}
		
		
		/**
		 *  Thread poolsize with invocation count Example 
		 *  
		 */
		
		@Test(invocationCount=10,threadPoolSize=5)
		public void test9()
		{
			
			Reporter.log("Thread pool size only when we use invocation count Test9",true);	
		}
		
}

//testng.xml file format

	/**
	 *  Testng.xml file
	 *  <suite name="Suite" time-out="8000" thread-count="5" parallel="none">
	 *  <test name="test" >
	 *  <classes>
	 *  <classes> or <packages>
     *  <class name="org.ReporterLog"/> or<package name="org"/>
	 *  </classes> or<packages>
	 *  </test>
	 *  </suite>
	 * 
	 */
	
