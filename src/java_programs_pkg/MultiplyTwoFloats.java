package java_programs_pkg;

import java.util.Scanner;

public class MultiplyTwoFloats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter two float values");
		
		float a = sc.nextFloat();
		System.out.println("enter a vaue: "+a);
		
		float b = sc.nextFloat();
		System.out.println("enter b value: "+b);
		
		float multiply = a*b;
		
		System.out.println("Multiply the float values: "+multiply);

	}

}
