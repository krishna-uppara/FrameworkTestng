package ListenersReporter;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

public class InvokedMethodListenersClass implements IInvokedMethodListener {

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		
		
		System.out.println(method.getTestMethod().toString());
		System.out.println(method.getDate());
		System.out.println(method.isTestMethod());
		System.out.println(method.getTestResult());
		System.out.println(testResult.getName());
		// TODO Auto-generated method stub
		
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
		System.out.println(method.getTestMethod().toString());
		System.out.println(method.getDate());
		System.out.println(method.isTestMethod());
		System.out.println(method.getTestResult());
		System.out.println(testResult.getName());
		System.out.println(testResult.getStatus());
		
	}

}
