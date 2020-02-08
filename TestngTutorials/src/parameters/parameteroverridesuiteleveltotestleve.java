package parameters;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class parameteroverridesuiteleveltotestleve
{
	// overriding the suite level parameters from test level
	@Parameters({"browser","url","timeout"})	
	@Test()
	public void testpara(String bro,String u ,String time)
	{
		long waittime = Long.parseLong(time);
		System.out.println("browser name"+bro+"url name"+u+"timeout"+waittime);
		
	}

}
