package java_programs_pkg;

import java.util.Scanner;

public class ComputQuotientReminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values to divide");
		
		int a = sc.nextInt();
		System.out.println("enter value a: "+a);
		
		int b = sc.nextInt();
		System.out.println("enter value b: "+b);
		
		int quotient = a/b;
		System.out.println("quotient is: "+quotient);
		
		int reminder = a%b;
		System.out.println("reminder is: "+reminder);
		
		

	}

}
