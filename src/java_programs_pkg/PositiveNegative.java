package java_programs_pkg;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a number:");
		
		double num = sc.nextDouble();
		System.out.println("the value entered is:"+num);
		
		if(num>0){
			System.out.println(num+" is positive");
			
		}else if(num<0){
			System.out.println(num+" is negative");
		}else{
			System.out.println(num+" is zero ie either positive nor negative");
		}
		

	}

}
