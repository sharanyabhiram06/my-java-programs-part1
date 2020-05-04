package java_programs_pkg;

import java.util.Scanner;

public class FabbiconicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num  = sc.nextInt();
		int a = 0;
		
		int b = 1;
		
		
		System.out.println("Fabinoicc series num is "+num);
		
		for(int i=1;i<=num;i++){
			System.out.println(a);
			
			int sum = a+b;
			a = b;
			b = sum;
			
		}
		
		 

	}

}
