package java_programs_pkg;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		long num  = sc.nextLong();
		long rev =0;
		
		System.out.println("Number to reverse is "+num);
		
		while(num !=0){
			long n = num%10;
			rev =rev*10+n;
			num = num/10;
			
		}
		System.out.println("reverse number is "+rev);
	}

}
