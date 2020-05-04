package java_programs_pkg;

import java.util.Scanner;

public class NumberOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		long num  = sc.nextLong();
		
		System.out.println("Number digit is "+num);
		int c=0;
		while(num!=0){
			num = num/10;
			c++;
		}
System.out.println("number of digit are "+c);
	}

}
