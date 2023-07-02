package Java;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.testng.annotations.Test;

public class Practice {
	
	
	public void Duplicate()
	{		
		String st = new String("I live in America");
		int len = st.length();
		
		char[] arr = st.toCharArray();
		for(int i = 0;i<len;i++)
		{
			for (int j = i+1;j<len;j++)
			{
				if(arr[i] == arr[j])
				{
					System.out.println("duplicate value is "+ arr[i]);	
					break;
				}	
			}	
		}		
	}

	@Test(enabled = false)
	public void Reversest()
	{
		
		String st = new String("My name is Navdeep Brar");
		int len = st.length();
		
		char[] arr = st.toCharArray();
		
		/*for(int i = 0;i<len;i++)
		{
			
			arr[i] = st.charAt(i);
			System.out.print(arr[i]);
		}
		
		System.out.println();
		*/
		for(int i = len-1;i>=0;i--)
		{
			
			arr[i] = st.charAt(i);
			System.out.print(arr[i]);
			
		}
		
		System.out.println();
	}
	
	
	@Test(enabled = false)
	public void Evennumbers()
	{
		
		int[] arr = {1,2,3,4,5,6,7,8};
		int len = arr.length;
		
		ArrayList<Integer> even = new ArrayList();
		ArrayList<Integer> odd = new ArrayList();
		
		for(int i = 0;i<len;i++)
		{	
			if (arr[i]%2 == 0)
			{											
				even.add(arr[i]);							
			}			
			else {							
			odd.add(arr[i]);			
			}					
		}		
		System.out.println("Even numbers are "+even);
		System.out.println("Odd numbers are "+odd);
		
	}
	
	@Test(enabled = false)
	public void Hashmap()
	{
	HashMap<Integer, String > hashmap = new HashMap<Integer, String>();
	hashmap.put(37, "Navdeep");
	hashmap.put(35, "Ashish");
	hashmap.put(30, "Nitin");
	
	System.out.println(hashmap);
	
	for(int key:hashmap.keySet())
	{
		
		System.out.println(key);
	}
	}
	
	@Test(enabled = false)
	public void getSortHashMap() {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		hashMap.put(25, "Dam");
		hashMap.put(45, "Bmith");
		hashMap.put(56, "Cohn");
		hashMap.put(6, "Aack");

		for (int key : hashMap.keySet()) {
			System.out.println(key);
		}
	}
	
	@Test(enabled = false)
	public void Reversestring()
	{
		
		StringBuffer sb = new StringBuffer("Navdeep Brar");
		sb.reverse();
		System.out.println(sb);
	}
	
	@Test(enabled = true)
	public void Longestword()
	{
		String st = "i live in contary American ";
		String word = "";
		String lword = "";
		int len = st.length();
		char ch;
		String Longestword = null;
		
		for(int i=0;i<len;i++)
		{
			ch = st.charAt(i);
			if(ch==' ')
			{
				if(word.length()>lword.length())
				{
					Longestword = word;
					lword = word;
				}
				word = "";
			}
			else
			{
				word+=ch;
				
			}
		}
		
		System.out.println("Longest word is "+Longestword);
	}
	
	@Test(enabled = true)
	public void sortarray()
	{
		
		int a[] = {16,1,8,4,5,9,3};
		int len = a.length;
		int var = 0;
		
		for(int i=0;i<=len-1;i++) {
			for(int j = i+1;j<len-1;j++) {
				if (a[i]<=a[j]) {
					var = a[i];
					a[i] = a[j];
					a[j] = var;
					
				}
			}System.out.println(a[i]);
		}
		
		Arrays.sort(a);
		
		for(int i=0;i<=len;i++) {
			System.out.println(a[i]);
			
		}
		
		
	}
	
	@Test(enabled = true)
	public void fabonaci() {
		
		int a =0;
		int b =1;
		int c;
		
		for(int i=1;i<=10;i++) {
		   c=a+b;
		   a = b;
		   b = c;
			System.out.println(c);
		}
		
	}
	
	
}
