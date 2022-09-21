package basic3;

import java.util.Scanner;

public class 오늘의_연습2 {

	static char checkUpper(char a) {
		char upper = 0;
		if(a >= 97 | a <= 122) { upper = Character.toUpperCase(a); return upper;}
		else return a;
		
	}

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			System.out.println("영문자를 입력하세요 >>");
			char a = input.nextLine().charAt(0);
			
			System.out.println(checkUpper(a));
		}
	}
