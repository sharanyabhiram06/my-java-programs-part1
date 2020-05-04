package java_programs_pkg;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//divisible by 4 for all century year
		//century year is leap year only when its prefectly divisible by 400
		//1900 is not leap year
		//2012 leap year
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter year");
		boolean leap = false;
		
		int leapnum = sc.nextInt();
		System.out.println(leapnum+" is year");
		if(leapnum %4==0){
			if(leapnum%100==0){
				if(leapnum %400==0){
				System.out.println(leapnum+" is leap year");
			}else{
				System.out.println(leapnum+" is not a leap year");
			}
		}
			else{
				System.out.println(leapnum+" is leap year");
			}
	}
		else{
			System.out.println(leapnum+" is not a leap year");
		}
}
}
