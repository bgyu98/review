package basic2;

import java.util.Scanner;

/*
 * for		: 반복 횟수가 정해진 경우
 * while	: 반복 횟수를 모르는 경우
 * do~while	: 반복 횟수를 모르는 경유 ( 조건을 나중에 비교 )
 */
public class Ex02_반복문구분 {

	public static void main(String[] args) {
		// 구구단의 단수를 입력받아서 해당 단의 구구단을 출력
		System.out.print("구구단 단수 입력 >>");
		Scanner input = new Scanner(System.in);
		int f = input.nextInt();

		//for
		System.out.print("몇 번 반복할까요?");
		int re = input.nextInt();
		for (int n=0; n<re; n++) {
			for (int s = 1; s < 10; s++) {
				System.out.print(f + "*" +  s + " = " + f*s + " \t");
			}
			System.out.println();
		}

		//while
		while(true) {
			System.out.println("구구단 단수 입력>>");
			int i = input.nextInt();
			for(int j = 1; j<=9; j++) {
				System.out.printf("%d * %d = %d \t" ,i, j, i*j);
			}

			System.out.println("\n반복을 종료(Y) or 계속(N)");
			String answer = input.next();
			if(answer.equalsIgnoreCase("Y")) break;
		}


		//do~while
		do {
			System.out.println("구구단 단수 입력>>");
			int i = input.nextInt();
			for(int j = 1; j<=9; j++) {
				System.out.printf("%d * %d = %d \t" ,i, j, i*j);
			}
			System.out.println("\n반복을 종료(Y) or 계속(N)");
			String answer = input.next();
			if(answer.equalsIgnoreCase("Y")) break;
		}while(true);
	}

}




