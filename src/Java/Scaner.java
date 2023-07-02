package Java;

import java.util.Scanner;

public class Scaner {
	
	static int a;
	
	
	public static void main(String args[]) {
		
		
		System.out.println("Enter a value");
		Scanner s = new Scanner(System.in);
		Scaner.a = s.nextInt();
		int b=a+10;
		System.out.println(b);
	}

}
