package Java;

import java.util.Scanner;

public class Primenumber {
	
	public static void main(String args[]) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("enter starting rage of numbers");
		int a = s.nextInt();
		System.out.println("enter Ending rage of numbers");
		int b = s.nextInt();
		int count =0;
		int i,j;
		for(i=a;i<=b;i++) {
			
			for(j=2;j<=i;j++) {
				
				if(i%j==0) {
					
					break;
					
				}
					
									
				}
			
			if (i==j) {
				
				System.out.println(j);
				
			}
											
			}
			
		}
	}


