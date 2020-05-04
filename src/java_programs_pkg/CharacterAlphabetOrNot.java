package java_programs_pkg;

import java.util.Scanner;

public class CharacterAlphabetOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=  new Scanner(System.in);
		System.out.println("Enter an alphabet:");
		
		char ch = sc.next().charAt(0);
		
		System.out.println("Alphabet entered is "+ch);
		
		if((ch>='a' && ch<='z') || (ch>= 'A' && ch<='Z')){
			System.out.println(ch+" is an Alphabet");
		}else{
			System.out.println(ch+" is not an Alphabet");
		}

	}

}
