package org;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import ListenersReporter.Isuitlistenersclass;
@Listeners({Isuitlistenersclass.class})
public class ISuiteListernerTest {
	
	
	@Test(priority=-1)
	public void test1()
	{

        int rand_int1 = ThreadLocalRandom.current().nextInt(); 
        System.out.println(rand_int1);
	Reporter.log( "Priority one TC   Test1",true);
	}

	/**
	 * Description Example 
	 *  
	 */
    
    @Test(description="kd;lfkd;s")
	public void test2()
	{
	Reporter.log("Test Description Test2",true);	
	// create instance of Random class 
    Random rand = new Random(); 

    // Generate random integers in range 0 to 999 
    int rand_int1 = rand.nextInt(1000); 
    int rand_int2 = rand.nextInt(1000); 

    // Print random integers 
    System.out.println("Random Integers: "+rand_int1); 
    System.out.println("Random Integers: "+rand_int2); 

    // Generate Random doubles 
    double rand_dub1 = rand.nextDouble(); 
    double rand_dub2 = rand.nextDouble(); 

    // Print random doubles 
    System.out.println("Random Doubles: "+rand_dub1); 
    System.out.println("Random Doubles: "+rand_dub2); 
	}
	
    
	/**
	 * always Run Example 
	 *  
	 */
    
    @Test(alwaysRun=true)
	public void test3()
	{
		Reporter.log("AlwaysRun Test3",true);	
	}
	

}
