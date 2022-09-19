package basic1;

import java.util.Iterator;

/*
 * 반복문 : for / while / do~while
 * 
 * (1) for(초기치; 조건문; 증가치){
 * 			반복구문
 * 		}
 * 
*/
public class Ex03_for개념 {

	public static void main(String[] args) {
		
		// 1) 1부터 10까지 숫자 출력
		for (int i = 1; i < 11 ;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//1] 위의 for 원리 이해하기
		
		//2] 1부터 10까지의 합을 출력
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			sum += i;
		}
		System.out.println("1~10의 합: " + sum);
		
		//3] 1부터 10까지의 홀수의 합을 출력
		sum = 0;
		for(int i = 0; i < 101; i += 3) {
			sum += i;
			if(i < 99) {
				System.out.print(i + " + ");
			}if(i == 99) {
				System.out.print(i + " = ");
			}
		}
		System.out.println(sum);
		
		// 2)'A' 부터 'Z'까지 출력
//		for(char i = 0101; i <= 0132; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		for(char ch='A'; ch <= 'Z'; ch++) {
//			System.out.print(ch + " ");
//		}
//		System.out.println();
//		
//		for(char ch = 'A'; ch <= 'Z'; ch+=2) {
//			System.out.print(ch + " ");
//		}
//		
//		//Z부터 A까지 출력
//		System.out.println();
//		for(char ch = 'Z'; ch >= 'A'; ch--) {
//			System.out.print(ch + " ");
//		}
		
		
	}

}
