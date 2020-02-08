package parameters;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OptionalParameter
{

	// when in xml file parameters are not defined
	@Parameters({"browser","url","timeout"})	
	@Test()
	public void testpara(@Optional("FF")String bro,@Optional("http://www.facebook.com")String u , @Optional("30")String time)
	{
		long waittime = Long.parseLong(time);
		System.out.println("browser name"+bro+"url name"+u+"timeout"+waittime);
		
	}
}
