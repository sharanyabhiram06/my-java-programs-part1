package java_programs_pkg;

import java.util.Scanner;

public class AsciiValueOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		char a = sc.next().charAt(0);
		System.out.println("character stored: "+a);
		int asciinum = (int)a;
		
		System.out.println("ASCII Number: "+asciinum);

	}

}
