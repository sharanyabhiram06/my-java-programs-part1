package java_programs_pkg;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		
		int n = sc.nextInt();
		//int fact =1;
		System.out.println("Number entered is: "+n);
		
		for(int i=1;i<=10;i++){
			System.out.println(n+"x"+i +"=" +(n*i));
			
		}

	}

}
