package org;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsOnGroups1
{

	 @Test(description="Smoke2 Group test1",groups={"smoke2"})
	  public void test1() 
	   {
		  Reporter.log("Smoke2 group test1 ",true);
	   }

	 @Test(description=" Sanity2 Group test2",groups={"sanity2"})
	  public void test2() 
	   {
		  Reporter.log("Sanity2 Smoke test2",true);
	   }
	 
	 @Test(description=" test3 Depends on sanity2 group ",dependsOnGroups={"sanity2"})
	  public void test3() 
	   {
		  Reporter.log("test3 methods depends on sanity2 group",true);
	   }
	 @Test(description=" test4 Depends on sanity1 and sanity2 group ",dependsOnGroups={"sanity1","sanity2"})
	  public void test4() 
	   {
		  Reporter.log("test4 methods depends on sanity1 and sanity2 group",true);
	   }
	 @Test(description=" test5 Depends on sa and smoke2 group ",dependsOnGroups={"smoke1","smoke2"})
	  public void test5() 
	   {
		  Reporter.log("test5 methods depends on smoke1 and Smoke2group",true);
	   }


}
