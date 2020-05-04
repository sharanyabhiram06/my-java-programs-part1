package java_programs_pkg;

import java.util.Scanner;

public class PrintInteger {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an number");
		
		int num = sc.nextInt();
		
		String st = sc.next();
		
		System.out.println("You have entered: "+num);
		System.out.println("You have entered: "+st);

	}

}
