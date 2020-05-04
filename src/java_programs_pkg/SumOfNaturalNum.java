package java_programs_pkg;

import java.util.Scanner;

public class SumOfNaturalNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the natural number");
		
		int num = sc.nextInt();
		int sum = 0;
		
		for(int i=0;i<=num;i++){
			sum = sum+i;
		}
System.out.println(sum+" is the natural number of "+num);
	}

}
