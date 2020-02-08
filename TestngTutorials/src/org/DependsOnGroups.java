package org;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnGroups
{
	 @Test(description="Smoke Group test1",groups={"smoke1"})
	  public void test1() 
	   {
		  Reporter.log("Smoke group test1 ",true);
	   }

	 @Test(description=" Sanity Group test2",groups={"sanity1"})
	  public void test2() 
	   {
		  Reporter.log("Sanity Smoke test2",true);
	   }
	 
	 @Test(description=" test3 Depends on smoke group ",dependsOnGroups={"smoke1"})
	  public void test3() 
	   {
		  Reporter.log("test3 methods depends on smoke group",true);
	   }
	 
	 @Test(description="test4 Depends on sanity group",dependsOnGroups={"sanity1"})
	  public void test4() 
	   {
		  Reporter.log("test4 methods depends on sanity group",true);
	   }
	 @Test(description="test5 Depends on smoke and sanity group",dependsOnGroups={"sanity1","smoke1"})
	  public void test5() 
	   {
		  Reporter.log("test5 methods depends on smoke and sanity group",true);
	   }

	 @Test()
	  public void test6() 
	   {
		  Reporter.log("test method",true);
	   }
	 
}
