package java_programs_pkg;

import java.util.Scanner;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("numbers to swape ");
		
		int c =0;
		int a = sc.nextInt();
		System.out.println("value of a: "+a);
		int b = sc.nextInt();
		System.out.println("value of b: "+b);
		
		/*c=a;
		a=b;
		b=c;*/
		
		a=a-b;
		b=a+b;
		a=b-a;
		
		
		System.out.println("value of a is: "+a);
		System.out.println("value of b is: "+b);
		
	}

}
