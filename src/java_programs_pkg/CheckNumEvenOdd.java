package java_programs_pkg;

import java.util.Scanner;

public class CheckNumEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the value: ");
		
		int a = sc.nextInt();
		System.out.println("value of a:"+a);
		
		if(a%2==0){
			System.out.println(a+" is even");
		}else
		{
			System.out.println(a+" is odd");
		}
		
		

	}

}
