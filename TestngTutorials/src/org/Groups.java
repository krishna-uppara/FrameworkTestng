package org;

import org.testng.Reporter;
import org.testng.annotations.Test;
/**
 * 
 * @author inkuppara
 *
 *<?xml version="1.0" encoding="UTF-8"?>
<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
<suite name="Suite">
  <test name="Test">
  <groups>
  <run>
  <include name="smoke"/>
  <include name="sanity"/>
  <exclude name="regression"/>
  </run>
  </groups>
    <classes>
      <class name="org.Groups"/>
    </classes>
  </test> <!-- Test -->
</suite> <!-- Suite -->

 */
public class Groups
{
	
		 @Test(description="Smoke Group test1",groups={"smoke"})
		  public void test1() 
		   {
			  Reporter.log("Smoke group test1 ",true);
		   }

		 @Test(description="Smoke Group test2",groups={"smoke"})
		  public void test2() 
		   {
			  Reporter.log("Smoke group test2",true);
		   }
		 @Test(description=" Sanity Group test3",groups={"sanity"})
		  public void test3() 
		   {
			  Reporter.log("Sanity Smoke test3",true);
		   }
		 @Test(description="Does not belongs to any Group ")
		  public void test4() 
		   {
			  Reporter.log("Does not belongs to any Group test4",true);
		   }

		 @Test(description="Two Group ",groups={"smoke","sanity"})
		  public void test5() 
		   {
			  Reporter.log("belongs to any Group test5",true);
		   }
		 @Test(description="test 6 regression group ",groups={"regression"})
		  public void test6() 
		   {
			  Reporter.log("belongs to any Regression Group test6",true);
		   }
	
}

