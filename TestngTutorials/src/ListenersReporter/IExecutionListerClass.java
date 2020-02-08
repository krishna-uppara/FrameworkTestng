package ListenersReporter;

import org.testng.IExecutionListener;

public class IExecutionListerClass implements IExecutionListener {

	@Override
	public void onExecutionStart() {
		System.out.println("before Testng suite file execution");
		
	}

	@Override
	public void onExecutionFinish() {
		System.out.println("After execution of Testng suite ");
		
	}

}
