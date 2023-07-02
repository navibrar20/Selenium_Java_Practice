package Java;

import java.util.Scanner;

public class Swittch {
	
	public static void main(String args[]) {
		
		int a = 10,b=5,ch;
		System.out.println("Enter case number");
		Scanner s = new Scanner(System.in);
		
		ch = s.nextInt();
		
		switch(ch){
			
		case 1: System.out.println("a + b = " + a+b );
		break;	
		case 2: System.out.println("a * b = " + a*b );
		break;
		case 3: System.out.println("a / b = " + a/b );
		break;
		}
	}

}
