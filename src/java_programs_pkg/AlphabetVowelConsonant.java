package java_programs_pkg;

import java.util.Scanner;

public class AlphabetVowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter an alphabet");
		
		char ch = sc.next().charAt(0);
		System.out.println("alphabet is: "+ch);
		
		if(ch =='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
		{
			System.out.println(ch+" is vowel");
		}
		else{
			System.out.println(ch+" is consonant");
		}
		

	}

}
