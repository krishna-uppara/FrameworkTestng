
public class stringcount
{

	public static void main(String[] args)
	{
		String s = "kjslkjadlsaslakjd";
		int leng= s.length();				
		char a[] = s.toCharArray();
		int count =0;
		for(int i= 0;i<leng;i++)
		{
			for(int j= i+1;j<leng;j++)
			{
				if(a[i]==a[j])
				{
					count++;
				}
				
			
			}
			System.out.println(a[i]+" repeated " + count +" times ");
			count=0;
		}

	}

}
