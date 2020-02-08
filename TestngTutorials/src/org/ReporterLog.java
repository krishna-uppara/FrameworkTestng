package org;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterLog
{
@Test()
public void devi ()
{
	//sysout will only print the statements in console
	System.out.println("full name plz");
	//Reporter log is used to print in the HTML file where TestNG report is generated(emailable-report.html)
	
	Reporter.log("last name plz");
	//For the reporter.log ,it contains two parameters - string & boolean
	//The string of Reporter.log will be printed in the emailable-report
	//if we want to print the string in console as well, then we have to use the boolean operator 'true'
	//By default, the boolean value will be 'false'
	//Please refer above reporter.log
	Reporter.log("middle name plz",false);
}
}
