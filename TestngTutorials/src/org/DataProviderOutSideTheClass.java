package org;

import org.testng.annotations.DataProvider;

public class DataProviderOutSideTheClass
{

	@DataProvider(name="testdata")
	public static Object[][] getdata()
	{
//		Object[][] data = {{"krishna","uppara","Kemail@gmail.com"},{"Shashi","uppara","Semail@gmail.com"}};
		Object[][] data = new Object[3][3];
		data[0][0]="krishna";
		data[0][1]="uppara";
		data[0][2]="kemail@gmail.com";
		data[1][0]="shashi";
		data[1][1]="uppara";
		data[1][2]="semail@gmail.com";
		data[2][0]="veeresh";
		data[2][1]="uppara";
		data[2][2]="Vemail@gmail.com";
	
		return data;
	}
	
	@DataProvider(name="userlist")
	public static Object[][] getdata1()
	{
	Object data[][]=new Object[3][3];
	data[0][0]="usera";
	data[0][1]=123;
	data[0][2]=true;

	data[1][0]="userb";
	data[1][1]=456;
	data[1][2]=true;

	data[2][0]="userc";
	data[2][1]=789;
	data[2][2]=false;
	return  data;
	}
	
	
}
