package Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class Practice2 {
	
	@Test
	public void Largestword()
	{
	
		String st = "Today is Monday and its working day in Americaaaa ";
		int len = st.length();
		String word = "";
		String lword = "";
		char ch;
		String Largestword = null;
		for(int i=0;i<len;i++)
		{
			ch = st.charAt(i);
			
			
			if(ch!=' ')
			{
				word+=ch;
				if(word.length()>lword.length())
				{
					Largestword = word;
					lword = word;
				}
			}
			else
			{
				word = "";
			}
		}
		
		System.out.println("longest word is "+Largestword);
		
	}
	
	
	@Test
	public void Wordarray()
	{
	
		String st = "Today is Monday and its working day";
		int len = st.length();
		String word = "";
		ArrayList arr = new ArrayList();
		char ch;
		String Largestword = null;
		for(int i=0;i<len;i++)
		{
			ch = st.charAt(i);
			
			if(ch!=' ')
			{
				word = word+ch;
				
			}
			else
			{
				arr.add(word);
				word = "";
			}
			
		}
		
		System.out.println(arr);
		
	}
	
	@Test
	public void Sortlist()
	{
		ArrayList<Integer> arr = new ArrayList<>();
		//TreeSet<Integer> arr = new TreeSet<>();
		arr.add(4);
		arr.add(56);
		arr.add(3);
		arr.add(88);
		arr.add(12);
		arr.remove(0);
		
		//Collections.sort(arr);
		
		System.out.println(arr);
		
		
	}

}
