package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class parametertestleve
{
	@Parameters({"browser","url","timeout"})	
	@Test()
	public void testpara(String bro,String u ,String time)
	{
		long waittime = Long.parseLong(time);
		System.out.println("browser name"+bro+"url name"+u+"timeout"+waittime);
		
	}

}
