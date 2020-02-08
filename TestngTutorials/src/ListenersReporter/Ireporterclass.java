package ListenersReporter;

import java.util.List;
import java.util.Map;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.ITestContext;
import org.testng.Reporter;
import org.testng.xml.XmlSuite;

public class Ireporterclass implements IReporter
{

	@Override
	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory)
	{
		// Iterates all the suites present in the TestNg xml file 
		for(ISuite suite :suites)
		{
			// gets all the suites names from TestNG xml 
			String suiteNames = suite.getName();
			Map<String, ISuiteResult> suiteResults = suite.getResults();
			for(ISuiteResult sr : suiteResults.values())
			{
				ITestContext tc = sr.getTestContext();
				Reporter.log("Total tests passed for Suites " +suiteNames + " is:" + tc.getPassedTests().getAllResults().size(),true);
				Reporter.log("Total tests Failed for Suites " +suiteNames + " is:" + tc.getFailedTests().getAllResults().size(),true);
				Reporter.log("Total tests Skipped for Suites " +suiteNames + " is:" + tc.getSkippedTests().getAllResults().size(),true);
			}
		}
		
	}

}
