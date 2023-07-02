package Java;

import org.junit.Test;

public class prac5 {
	
	@org.testng.annotations.Test
	public void Sortnumbers() {
		
		int[] a = {2,7,6,9,5,3,11};
		int len = a.length;
		int c;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(a[i]>a[j]) {
					c = a[i];
					a[i]=a[j];
					a[j]=c;
				}
				
			}System.out.println(a[i]);
		}
	}

}
