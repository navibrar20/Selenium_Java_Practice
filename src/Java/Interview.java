package Java;

import java.util.logging.Logger;

import org.testng.annotations.Test;





@Test
public class Interview {
	
	String st = "ajchsdiuvhiutnpsoeivnaofvsiiiiirotbiobn";
	int len  = st.length();
	char[] arr = st.toCharArray();
	int count = 1;
	public static Logger logger = Logger.getLogger(Interview.class.getName());
	
	@Test
	public void Repeatedchar()
	{
		for(int i=0;i<len;i++)
		{
			for(int j=i+1;j<len;j++)
			{
				if(arr[i] ==arr[j] & arr[j]!=' ')
				{
					count++;
					arr[j] = ' ';
					
				}
				
			}
			
			if(count>1)
			{
				System.out.println("no of times char "+arr[i]+" repeated is "+count );
				count = 1;
			}
		}
	}
	
	@Test
	public void Comparenumbers()
	{
		int num1 = 5;
		int num2 = 5;
		boolean num3 = num1>num2;
		
		if(num1!=num2)
		{
		System.out.println(num3);
		}
		else
		{
			System.out.println(-1);
			logger.info("Numbers are equal");
		}
	}
	
	@Test
	public static void main(String args[])
	{
		Interview in = new Interview();
		in.Comparenumbers();
	}

}
