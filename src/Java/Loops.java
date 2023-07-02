package Java;

import java.util.Scanner;

public class Loops {

	public static void main(String args[]) {
		//System.out.println("Enter your speed");
		int a;
		int b;
		Scanner s = new Scanner(System.in);
//		a = s.nextInt();
//		while(b<1) {
//		while(a<=80) {
//			
//			System.out.println("you are within speed limit and your speed is " +a);
//			
//			a++;
//			
//		}
//		b++;
//		}
//		
//		System.out.println("SLOW DOWN your speed is "+ a);
		
		
	
		
//		for(char i = 'a';i<='z';i++) {
//			
//			System.out.print(" "+i);
//			
//		}
		
		
//		//Calculate power of number
//		int result = 1;
//		System.out.println("Print number");
//		a = s.nextInt();
//		System.out.println("Enter power of number");
//		b = s.nextInt();
//		
//		for (int i = 1;i<=b;i++) 
//			
//			result=result*a;
//			
//		
//		System.out.println(result);
		
		
		//Calculate factorial of number
				
				System.out.println("Print number");
				a = s.nextInt();
				int fact=a;
				
				for (int i = a;i>1;i--) 
					
					fact=fact*(i-1);
					
				
				System.out.println(fact);
		
	}
	
	
	
	
}

