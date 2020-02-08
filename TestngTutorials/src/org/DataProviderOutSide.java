package org;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DataProviderOutSide
{
	@Test(dataProvider="userlist",priority=2,dataProviderClass=DataProviderOutSideTheClass.class)
	public void createUser(String un,int pw,boolean tf)
	{
		Reporter.log("running the createuser"+un+"----"+pw+"----"+tf,true);
		
	} 
	@Test(dataProvider="testdata",priority=1,dataProviderClass=DataProviderOutSideTheClass.class)
	public void test1(String firstname,String lastname,String email)
	{
		System.out.println(firstname);
		System.out.println(lastname);
		System.out.println(email);
	}
}
