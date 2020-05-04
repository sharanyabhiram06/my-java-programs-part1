package java_programs_pkg;

import java.util.Scanner;

public class SubtractTwoNumbrs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a and b values");
		
		int a = sc.nextInt();
		System.out.println("enter value a:"+a);
		int b = sc.nextInt();
		System.out.println("enter value b:"+b);
		
		int sub = a-b;
		System.out.println("Total sum of two values is:"+sub);

	}

}
