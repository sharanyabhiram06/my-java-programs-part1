package java_programs_pkg;

import java.util.Scanner;

public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		
		int num = sc.nextInt();
		int fact =1;
		System.out.println("Number entered is: "+num);
		
		for(int i=1;i<=num;i++){
			fact = fact*i;
		}
		System.out.println(fact+" is factorial of "+num);

	}

}
