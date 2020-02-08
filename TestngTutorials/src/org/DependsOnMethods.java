package org;
	
	import org.testng.Assert;
	import org.testng.Reporter;
	import org.testng.annotations.Test;
	
	public class DependsOnMethods {
	
		
		

		// testng.xml file format
		
		/**
		 *  Testng.xml file
		 *  <suite name="Suite" time-out="8000" thread-count="5" parallel="none">
		 *  <test name="test" >
		 *  <classes>
		 *  <classes> or <packages>
	     *     <class name="org.ReporterLog"/> or<package name="org"/>
		 *  </classes> or<packages>
		 *  <classes>
		 *  <class name="org.ReporterLog"/>
		 *  <include name ="test1"/>
		 *  <exclude name =" test2" >
		 *  </classes>
		 *  </test>
		 *  </suite>
		 * 
		 */	
	  @Test(description="independent method")
	  public void test1() 
	   {
		  Reporter.log("suprem method test1",true);
//		  Assert.fail("failed");
	   }
	  
	  @Test(description="test2 depends on test1",dependsOnMethods={"test1"})
	  public void test2() 
	   {
		  Reporter.log("Dependent method Test2", true);
	   }
	  
	  @Test(description="test3 depends on test2",dependsOnMethods={"test2"})
	  public void test3() 
	   {
		  Reporter.log("Dependent method ",true);
	   }
	  @Test(description="test4 depends on test1",dependsOnMethods={"test1","test3"})
	  public void test4() 
	   {
		  Reporter.log("Dependent method ",true);
	   }
	} 
	
	
	// if test method is depends on other test method of another class we have to use inheritance concept extends 
	
	class childclass extends DependsOnMethods
	{
		 @Test(description="test5 depends on test4",dependsOnMethods={"test4"})
		  public void test5() 
		   {
			  Reporter.log("Dependent method test5 ",true);
		   }
	}
	
	
	
	