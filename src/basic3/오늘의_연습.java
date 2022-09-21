package basic3;

import java.util.Scanner;

public class 오늘의_연습 {

	static boolean checkLower(char a) {
		if (Character.isUpperCase(a)) return false;
		else return true;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("영문자를 입력하세요 >>");
		char a = input.nextLine().charAt(0);
		
		System.out.println(a);
		System.out.println(checkLower(a));
	}
}
