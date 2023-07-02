package Java;

import java.util.Scanner;

public class Claculator {

	public static void main(String args[]) {
		
		int a,b,c;
		
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("Enter first number");
		a = s.nextInt();
		System.out.println("Enter second number");
		b = s.nextInt();
		System.out.println("Enter 1 for addition");
		System.out.println("Enter 2 for Sub");
		System.out.println("Enter 3 for Multiplication");
		System.out.println("Enter 4 for Division");
		c = s.nextInt();
		
		switch(c) {
		
		case 1:System.out.println(a + "+" + b + "=" + a+b);
		break;
		case 2:System.out.println(a-b);	
		break;
		case 3:System.out.println(a + "*" + b + "=" + a*b);
		break;
		case 4:System.out.println(a + "/" + b + "=" + a/b);
		break;
		}
	}
}
