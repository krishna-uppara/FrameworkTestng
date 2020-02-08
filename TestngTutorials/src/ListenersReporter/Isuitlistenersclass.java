package ListenersReporter;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class Isuitlistenersclass implements ISuiteListener{
	
	@Override
	public void onStart(ISuite suite) {
		
		
		
		String  simpleDate = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());
	
		System.out.println("Suite started Executing at:  " + System.currentTimeMillis() + "Suite Name is :   " + suite.getName() );
		System.out.println(simpleDate);
		
		
	}

	@Override
	public void onFinish(ISuite suite) {
		SimpleDateFormat simpleDate = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
	System.out.println("Suite completed its Executing at : " + System.currentTimeMillis() + "Suite Name is :   " + suite.getName() );
	System.out.println(simpleDate);
		
	}

}
