package java_programs_pkg;

import java.util.Scanner;

public class LagestOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter three values");
		
		int a = sc.nextInt();
		System.out.println("value of a is "+a);
		int b = sc.nextInt();
		System.out.println("value of b is "+b);
		int c = sc.nextInt();
		System.out.println("value of c is "+c);
		
		if(a>b && a>c){
			System.out.println(a+" is greater");
		}else if(b>c){
			System.out.println(b+" is greater");
		}else{
			System.out.println(c+" is greater");
		}
		
		if(a>=b){
			if(a>=c){
				System.out.println(a+" is greater");
			}else {
				System.out.println(c+" is greater");
			}
		}
			else{
				if(b>=c){
				System.out.println(b+" is greater");
			}else{
				System.out.println(c+" is greater");
			}
		
		
	
	}
	}
}
