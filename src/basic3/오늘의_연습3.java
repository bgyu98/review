package basic3;

import java.util.Scanner;
import java.util.StringTokenizer;

public class 오늘의_연습3 {

	static void multiple(int a, int b) {
		System.out.println(a*b);
		return;
	}
	static void multiple(int a, char ch) {
		for(int i = 0; i < a; i++) {
			System.out.print(ch + " ");
		}
		return;
	}
		

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			System.out.println("숫자나 문자 입력");
			multiple(sc.nextInt(),sc.nextInt());
			
			
			System.out.println("숫자나 문자 입력");
			multiple(sc.nextInt(),'ㅋ');
		}
		
	}
